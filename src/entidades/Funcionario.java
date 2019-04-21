package entidades;

import java.util.ArrayList;

import entidades.enums.NivelDeTrabalho;

public class Funcionario {
	
	public String nome;
	public NivelDeTrabalho nivel;
	public Double salarioBase;
	//relação um para um
	public Departamento departamento;
	//relação um para muitos
	public ArrayList<ContratoHora> contratos = new ArrayList<ContratoHora>();
	
	

}
