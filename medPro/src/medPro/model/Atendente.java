package medPro.model;

public class Atendente {

	// Atributos privados

	private int matriculaAtendente;
	private String nomeAtendente;
	private int idadeAtendente;
	private Sexo sexoAtendente;
	private String telefoneAtendente;
	private String emailAtendente;

	// Construtor
	public Atendente(String nomeAtendente, int idadeAtendente, Sexo sexoAtendente,
			String telefoneAtendente, String emailAtendente) {

		
		this.nomeAtendente = nomeAtendente;
		this.idadeAtendente = idadeAtendente;
		this.sexoAtendente = sexoAtendente;
		this.telefoneAtendente = telefoneAtendente;
		this.emailAtendente = emailAtendente;
	}

	// Get e Set

	public int getMatriculaAtendente() {
		return matriculaAtendente;
	}

	public void setMatriculaAtendente(int matriculaAtendente) {
		this.matriculaAtendente = matriculaAtendente;
	}

	public String getNomeAtendente() {
		return nomeAtendente;
	}

	public void setNomeAtendete(String nomeAtendente) {
		this.nomeAtendente = nomeAtendente;
	}

	public int getIdadeAtendente() {
		return idadeAtendente;
	}

	public void setIdadeAtendente(int idadeAtendente) {
		this.idadeAtendente = idadeAtendente;
	}

	public Sexo getSexoAtendente() {
		return sexoAtendente;
	}

	public void setSexoAtendente(Sexo sexoAtendente) {
		this.sexoAtendente = sexoAtendente;
	}

	public String getTelefoneAtendente() {
		return telefoneAtendente;
	}

	public void setTelefoneAtendente(String telefoneAtendente) {
		this.telefoneAtendente = telefoneAtendente;
	}

	public String getEmailAtendente() {
		return emailAtendente;
	}

	public void setEmailAtendente(String emailAtendente) {
		this.emailAtendente = emailAtendente;
	}

	// ToString

	@Override
	public String toString() {
		return "Matricula=" + matriculaAtendente + "" + ", Nome=" + nomeAtendente + "" + " Idade=" + idadeAtendente + ""
				+ ", Sexo=" + sexoAtendente + "" + ", Telefone=" + telefoneAtendente + "" + ", Email=" + emailAtendente;
	}

}
