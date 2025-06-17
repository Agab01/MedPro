package medPro.model;

import java.time.LocalTime;
import java.util.List;

public class Consulta {

	private int idConsulta;
	private String dataConsulta;
	private LocalTime horaConsulta;
	private int matriculaAtendenteConsulta;
	private String crmMedicoConsulta;
	private String cpfPacienteConsulta;
	private Receita receita;
	private List<Receita> receitas;

	public Consulta(String dataConsulta, LocalTime horaConsulta, int matriculaAtendenteConsulta, String crmMedicoConsulta,
			String cpfPacienteConsulta) {
		
		this.dataConsulta = dataConsulta;
		this.horaConsulta = horaConsulta;
		this.matriculaAtendenteConsulta = matriculaAtendenteConsulta;
		this.crmMedicoConsulta = crmMedicoConsulta;
		this.cpfPacienteConsulta = cpfPacienteConsulta;
		receitas = null;
		this.receita = null;
	}

	public int getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
	}

	public String getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public LocalTime getHoraConsulta() {
		return horaConsulta;
	}

	public void setHoraConsulta(LocalTime horaConsulta) {
		this.horaConsulta = horaConsulta;
	}

	public int getMatriculaAtendenteConsulta() {
		return matriculaAtendenteConsulta;
	}

	public void setMatriculaAtendenteConsulta(int matriculaAtendenteConsulta) {
		this.matriculaAtendenteConsulta = matriculaAtendenteConsulta;
	}

	public String getCrmMedicoConsulta() {
		return crmMedicoConsulta;
	}

	public void setCrmMedicoConsulta(String crmMedicoConsulta) {
		this.crmMedicoConsulta = crmMedicoConsulta;
	}

	public String getCpfPacienteConsulta() {
		return cpfPacienteConsulta;
	}

	public void setCpfPacienteConsulta(String cpfPacienteConsulta) {
		this.cpfPacienteConsulta = cpfPacienteConsulta;
	}

	public Receita getReceita() {
		return receita;
	}

	public void setReceita(Receita receita) {
		this.receita = receita;
	}

	public List<Receita> getReceitas() {
		return receitas;
	}

	public void setReceitas(List<Receita> receitas) {
		this.receitas = receitas;
	}


	
}
