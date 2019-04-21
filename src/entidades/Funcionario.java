package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.NivelDeTrabalho;

public class Funcionario {

	public String nome;
	public NivelDeTrabalho nivel;
	public Double salarioBase;
	// relação um para um
	public Departamento departamento;
	// relação um para muitos
	public List<ContratoHora> contratos = new ArrayList<>();

	// construtor padrão
	public Funcionario() {
	}

	// metodo construtor - a lista
	public Funcionario(String nome, NivelDeTrabalho nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	// get com todos atributos e somente get da lista
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelDeTrabalho getNivel() {
		return nivel;
	}

	public void setNivel(NivelDeTrabalho nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}

	// lista de contratos
	public void addContratoHora(ContratoHora contrato) {
		contratos.add(contrato);
	}

	public void removeContratoHora(ContratoHora contrato) {
		contratos.remove(contrato);
	}

	public Double ganhos(int ano, int mes) {

		double soma = salarioBase;
		// instanciar calendario
		Calendar cal = Calendar.getInstance();

		for (ContratoHora x : contratos) {
			// meu calendario recebeu a data da lista x
			cal.setTime(x.getData());

			int xAno = cal.get(Calendar.YEAR);
			int xMes = 1 + cal.get(Calendar.MONTH);

			if (xAno == ano && xMes == mes) {
				soma += x.valorTotal();
			}
		}
		return soma;
	}

}
