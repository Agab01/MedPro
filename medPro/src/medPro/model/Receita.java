package medPro.model;

import java.util.List;

public class Receita {

    private int idReceita;
    private String descricaoReceita;
    private List<Medicamento> medicamentos;
    private int idConsulta;

    public Receita(int idReceita, String descricaoReceita, List<Medicamento> medicamentos, int idConsulta) {
        this.idReceita = idReceita;
        this.descricaoReceita = descricaoReceita;
        this.medicamentos = medicamentos;
        this.idConsulta = idConsulta;
    }

    // getter e setter para idConsulta
    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

	public int getIdReceita() {
		return idReceita;
	}

	public void setIdReceita(int idReceita) {
		this.idReceita = idReceita;
	}

	public String getDescricaoReceita() {
		return descricaoReceita;
	}

	public void setDescricaoReceita(String descricaoReceita) {
		this.descricaoReceita = descricaoReceita;
	}

	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}
    
    

}
