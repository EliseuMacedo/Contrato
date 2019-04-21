package entidades;

import java.util.ArrayList;

import entidades.enums.NivelDeTrabalho;

public class Funcionario {
	
	public String nome;
	public NivelDeTrabalho nivel;
	public Double salarioBase;
	//rela��o um para um
	public Departamento departamento;
	//rela��o um para muitos
	public ArrayList<ContratoHora> contratos = new ArrayList<ContratoHora>();
	
	

}
