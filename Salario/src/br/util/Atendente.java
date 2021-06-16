package digitalinnovation.util;

public class Atendente extends Funcionario {
	
	public void calcularSalario (double salarioLiquido) {
		desconto = salarioLiquido * 0.01;
		salario = salarioLiquido- desconto;
		System.out.println("O salário do Atendente com desconto é: " +salario);
	}
}
