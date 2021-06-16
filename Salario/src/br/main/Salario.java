package digitalinnovation.main;

import java.util.Scanner;

import digitalinnovation.util.Atendente;
import digitalinnovation.util.Funcionario;
import digitalinnovation.util.Gerente;
import digitalinnovation.util.Supervisor;

public class Salario {
		public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
	Funcionario funci = new Funcionario();
	Atendente atend = new Atendente ();
	Supervisor superv = new Supervisor ();
	Gerente geren = new Gerente();
	
		
	System.out.println("Digite 1 para atendente, 2 para gerente e 3 para supervisor, 5 para sair");
	int entrada = sc.nextInt();
		
		do {
			if ( entrada == 1) {
				System.out.println("Digite o salário Líquido?");
				double salarioLiquido = sc.nextDouble();
				atend.calcularSalario(salarioLiquido);
			}else if (entrada == 2) {
				System.out.println("Digite o salário Líquido?");
				double salarioLiquido = sc.nextDouble();
				geren.calcularSalario(salarioLiquido);
			}else if (entrada == 3) {
				System.out.println("Digite o salário Líquido?");
				double salarioLiquido = sc.nextDouble();
				superv.calcularSalario(salarioLiquido);
			}
			System.out.println("Deseja continuar (S/N)? ");
			funci.continuacao = sc.next();
			}
				while (  funci.continuacao.equals("S"));
				System.out.println("Saindo!!");
}
}