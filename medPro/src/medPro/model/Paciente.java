package medPro.model;

public class Paciente {

	// Atributos
	private String cpfPaciente;
	private String nomePaciente;
	private int idadePaciente;
	private Sexo sexoPaciente;
	private String telefonePaciente;
	private String emailPaciente;

	// Construtores
	public Paciente(String cpfPaciente, String nomePaciente, int idadePaciente, Sexo sexoPaciente,
			String telefonePaciente, String emailPaciente) {

		this.cpfPaciente = cpfPaciente;
		this.nomePaciente = nomePaciente;
		this.idadePaciente = idadePaciente;
		this.sexoPaciente = sexoPaciente;
		this.telefonePaciente = telefonePaciente;
		this.emailPaciente = emailPaciente;
	}

	// Get e Set
	public String getCpfPaciente() {
		return cpfPaciente;
	}

	public void setCpfPaciente(String cpfPaciente) {
		this.cpfPaciente = cpfPaciente;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public int getIdadePaciente() {
		return idadePaciente;
	}

	public void setIdadePaciente(int idadePaciente) {
		this.idadePaciente = idadePaciente;
	}

	public Sexo getSexoPaciente() {
		return sexoPaciente;
	}

	public void setSexoPaciente(Sexo sexoPaciente) {
		this.sexoPaciente = sexoPaciente;
	}

	public String getTelefonePaciente() {
		return telefonePaciente;
	}

	public void setTelefonePaciente(String telefonePaciente) {
		this.telefonePaciente = telefonePaciente;
	}

	public String getEmailPaciente() {
		return emailPaciente;
	}

	public void setEmailPaciente(String emailPaciente) {
		this.emailPaciente = emailPaciente;
	}

	// ToString
	@Override
	public String toString() {
		return "CPF=" + cpfPaciente + "" + ", Nome=" + nomePaciente + "" + ", Idade=" + idadePaciente + "" + ", Sexo="
				+ sexoPaciente + "" + ", Telefone=" + telefonePaciente + "" + ", Email=" + emailPaciente;
	}

}
