package entidades;

import java.util.Date;

public class ContratoHora {

	public Date data;
	public Double valorPorHora;
	public Integer horas;

	public ContratoHora() {
	}

	public ContratoHora(Date data, double valorPorHora, int horas) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double valorTotal() {
		return horas * valorPorHora;
	}

}
