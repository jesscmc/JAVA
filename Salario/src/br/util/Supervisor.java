package digitalinnovation.util;

public class Supervisor extends Funcionario {

	public void calcularSalario (double salarioLiquido) {
		desconto = salarioLiquido * 0.05;
		salario = salarioLiquido- desconto;
		System.out.println("O sal�rio do Supervisor com descontos �: " +salario);
	}

}
