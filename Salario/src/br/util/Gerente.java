package digitalinnovation.util;

public class Gerente extends Funcionario{

	public void calcularSalario (double salarioLiquido) {
		desconto = salarioLiquido * 0.1;
		salario = salarioLiquido- desconto;
		System.out.println("O salário do Gerente com descontos é: " +salario);
	}

}
