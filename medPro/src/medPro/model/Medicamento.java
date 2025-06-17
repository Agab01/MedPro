package medPro.model;

import java.time.LocalTime;

public class Medicamento {

	// Atributos privados
	private int idMedicamento;
	private String nomeMedicamento;
	private LocalTime horario_Medicamento;
	private String quantidade_Medicamento;

	// Construtor
	public Medicamento(String nomeMedicamento, LocalTime horario_Medicamento, String quantidade_Medicamento) {

		this.nomeMedicamento = nomeMedicamento;
		this.horario_Medicamento = horario_Medicamento;
		this.quantidade_Medicamento = quantidade_Medicamento;
	}

	// Get e Set
	public int getIdMedicamento() {
		return idMedicamento;
	}

	public void setIdMedicamento(int idMedicamento) {
		this.idMedicamento = idMedicamento;
	}

	public String getNomeMedicamento() {
		return nomeMedicamento;
	}

	public void setNomeMedicamento(String nomeMedicamento) {
		this.nomeMedicamento = nomeMedicamento;
	}

	public LocalTime getHorario_Medicamento() {
		return horario_Medicamento;
	}

	public void setHorario_Medicamento(LocalTime horario_Medicamento) {
		this.horario_Medicamento = horario_Medicamento;
	}

	public String getQuantidade_Medicamento() {
		return quantidade_Medicamento;
	}

	public void setQuantidade_Medicamento(String quantidade_Medicamento) {
		this.quantidade_Medicamento = quantidade_Medicamento;
	}

	// ToString

	@Override
	public String toString() {
		return "Medicamento [id=" + idMedicamento + "" + ", nome=" + nomeMedicamento + "" + ", horario="
				+ horario_Medicamento + "" + ", quantidade=" + quantidade_Medicamento + "]";
	}

}
