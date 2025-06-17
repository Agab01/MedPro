package medPro.model;

import java.util.List;

public class Medico {

	// Atributos privados
	private String crmMedico;
	private String nomeMedico;
	private int idadeMedico;
	private Sexo sexoMedico;
	private String telefoneMedico;
	private String emailMedico;
	private List<Especialidade> especialidades;

	// Construtor
	public Medico(String crmMedico, String nomeMedico, int idadeMedico, Sexo sexoMedico, String telefoneMedico,
			String emailMedico, List<Especialidade> especialidades) {

		this.crmMedico = crmMedico;
		this.nomeMedico = nomeMedico;
		this.idadeMedico = idadeMedico;
		this.sexoMedico = sexoMedico;
		this.telefoneMedico = telefoneMedico;
		this.emailMedico = emailMedico;
		this.especialidades = especialidades;
	}

	// Get e Set
	public String getCrmMedico() {
		return crmMedico;
	}

	public void setCrmMedico(String crmMedico) {
		this.crmMedico = crmMedico;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public int getIdadeMedico() {
		return idadeMedico;
	}

	public void setIdadeMedico(int idadeMedico) {
		this.idadeMedico = idadeMedico;
	}

	public Sexo getSexoMedico() {
		return sexoMedico;
	}

	public void setSexoMedico(Sexo sexoMedico) {
		this.sexoMedico = sexoMedico;
	}

	public String getTelefoneMedico() {
		return telefoneMedico;
	}

	public void setTelefoneMedico(String telefoneMedico) {
		this.telefoneMedico = telefoneMedico;
	}

	public String getEmailMedico() {
		return emailMedico;
	}

	public void setEmailMedico(String emailMedico) {
		this.emailMedico = emailMedico;
	}

	public List<Especialidade> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<Especialidade> especialidades) {
		this.especialidades = especialidades;
	}

	// ToString
	@Override
	public String toString() {
		return "CRM=" + crmMedico + "" + ", Nome=" + nomeMedico + "" + ", Idade=" + idadeMedico + "" + ", Sexo="
				+ sexoMedico + "" + ", Telefone=" + telefoneMedico + "" + ", Email=" + emailMedico + ""
				+ ", Especialidades=" + especialidades;
	}

}
