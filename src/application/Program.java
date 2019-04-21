package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.ContratoHora;
import entidades.Departamento;
import entidades.Funcionario;
import entidades.enums.NivelDeTrabalho;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		// novo objeto de data
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Nome do departamento: ");
		String dep = sc.nextLine();
		Departamento departamento = new Departamento(dep);
		System.out.println("Dados do trabalhador:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Nivel - JUNIOR/PLENO/SENIOR: ");
		String nivel = sc.nextLine();
		System.out.print("Salario base: ");
		double salarioBase = sc.nextDouble();
		//instanciar o objeto
		Funcionario funcionario = new Funcionario(nome, NivelDeTrabalho.valueOf(nivel), salarioBase, departamento);
		System.out.print("Quantos contratos você quer adicionar:? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Entre com os dados do " + i + "º contrato:");
			System.out.print("Data (DD/MM/YYYY): ");
			// Inserir uma string de data
			Date data = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração em horas: ");
			int horas = sc.nextInt();
			//novo objeto e adicionar a lista
			ContratoHora contrato = new ContratoHora(data, valorPorHora, horas);
			funcionario.addContratoHora(contrato);
		}
		System.out.print("\nEntre com o mês e o ano para ver os ganhos (MM/YYYY): ");
		String mesAno = sc.next();
		
		int mes = Integer.parseInt(mesAno.substring(0,2));
		int ano = Integer.parseInt(mesAno.substring(3));

		double result = funcionario.ganhos(ano, mes);
		
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Departamento: " + funcionario.departamento.getNome());
		System.out.println("Ganhos para " + mesAno + ": " + String.format("%.2f", result));
		
		sc.close();

	}

}
