package medPro.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import medPro.database.Conexao;
import medPro.model.Especialidade;
import medPro.model.Medico;
import medPro.model.Sexo;



public class MedicoDAO {

    // Inserir
    public void salvarMedico(Medico medico) {
        String sql = "INSERT INTO Medico (crm_Medico, nome_Medico, idade_Medico, sexo_Medico, telefone_Medico, email_Medico) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, medico.getCrmMedico());
            stmt.setString(2, medico.getNomeMedico());
            stmt.setInt(3, medico.getIdadeMedico());
            stmt.setString(4, medico.getSexoMedico().toString());
            stmt.setString(5, medico.getTelefoneMedico());
            stmt.setString(6, medico.getEmailMedico());
            stmt.executeUpdate();

            salvarEspecialidades(conn, medico.getCrmMedico(), medico.getEspecialidades());

            System.out.println("MÈdico inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir mÈdico: " + e.getMessage());
        }
    }

 // Inserir as especialidades do mÈdico na tabela de junÁ„o
    private void salvarEspecialidades(Connection conn, String crmMedico, List<Especialidade> especialidades) throws SQLException {
        String sql = "INSERT INTO Medico_Especialidade (crm_Medico, nome_Especialidade) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            for (Especialidade especialidade : especialidades) {
                stmt.setString(1, crmMedico);
                stmt.setString(2, especialidade.getNomeEspecialidade());  
                stmt.addBatch();
            }
            stmt.executeBatch();
        }
    }
    

    
    // Listar todos
    public List<Medico> listarTodos() {
        List<Medico> lista = new ArrayList<>();
        String sql = "SELECT * FROM Medico";

        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String crm = rs.getString("crm_Medico");
                String nome = rs.getString("nome_Medico");
                int idade = rs.getInt("idade_Medico");
                Sexo sexo = Sexo.valueOf(rs.getString("sexo_Medico"));
                String telefone = rs.getString("telefone_Medico");
                String email = rs.getString("email_Medico");

                List<Especialidade> especialidades = buscarEspecialidadesPorCRM(crm);
                Medico medico = new Medico(crm, nome, idade, sexo, telefone, email, especialidades);
                lista.add(medico);
            }
        } catch (SQLException e) {
            System.out.println("‚ùå Erro ao listar m√©dicos: " + e.getMessage());
        }

        return lista;
    }
    
    
    public Medico buscarPorCRM(String crm) {
        String sql = "SELECT * FROM Medico WHERE crm_Medico = ?";
        Medico medico = null;

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, crm);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String nome = rs.getString("nome_Medico");
                int idade = rs.getInt("idade_Medico");
                Sexo sexo = Sexo.valueOf(rs.getString("sexo_Medico"));
                String telefone = rs.getString("telefone_Medico");
                String email = rs.getString("email_Medico");

                // Busca especialidades associadas
                List<Especialidade> especialidades = buscarEspecialidadesPorCRM(crm);

                medico = new Medico(crm, nome, idade, sexo, telefone, email, especialidades);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar mÈdico: " + e.getMessage());
        }

        return medico;
    }
    
    
    

    private List<Especialidade> buscarEspecialidadesPorCRM(String crm) {
        List<Especialidade> especialidades = new ArrayList<>();
        String sql = "SELECT nome_Especialidade FROM Medico_Especialidade WHERE crm_medico = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, crm);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome_Especialidade");
                try {
                    especialidades.add(new Especialidade(nome));
                } catch (IllegalArgumentException e) {
                    System.out.println("Especialidade inv·lida no banco: " + nome);
                }
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar especialidades do mÈdico: " + e.getMessage());
        }

        return especialidades;
    }
    // Atualizar
    public void atualizar(Medico medico) {
        String sql = "UPDATE Medico SET nome_Medico = ?, idade_Medico = ?, sexo_Medico = ?, telefone_Medico = ?, email_Medico = ? WHERE crm_Medico = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, medico.getNomeMedico());
            stmt.setInt(2, medico.getIdadeMedico());
            stmt.setString(3, medico.getSexoMedico().toString());
            stmt.setString(4, medico.getTelefoneMedico());
            stmt.setString(5, medico.getEmailMedico());
            stmt.setString(6, medico.getCrmMedico());
            stmt.executeUpdate();

       
            removerEspecialidades(medico.getCrmMedico());
            salvarEspecialidades(conn, medico.getCrmMedico(), medico.getEspecialidades());

            System.out.println("MÈdico atualizado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar mÈdico: " + e.getMessage());
        }
    }

    private void removerEspecialidades(String crm) throws SQLException {
        String sql = "DELETE FROM Medico_Especialidade WHERE crm_Medico = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, crm);
            stmt.executeUpdate();
        }
    }

    // Deletar
    public void deletar(String crm) {
        String sql = "DELETE FROM Medico WHERE crm_Medico = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            removerEspecialidades(crm);

            stmt.setString(1, crm);
            stmt.executeUpdate();
            System.out.println("úMÈdico removido com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao remover mÈdico: " + e.getMessage());
        }
    }
}
