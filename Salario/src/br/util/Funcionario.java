package digitalinnovation.util;

public class Funcionario {

	protected double salarioLiquido;
	protected double desconto;
	protected double salario;
	public String continuacao;

	public Funcionario (){
	}
	
	
//public Funcionario (double salario){
	//	this.setSalario(salarioLiquido);
	//	this.salarioLiquido = salarioLiquido;
	//	this.salario = salario;
	//	}
	

	//Get e Set
	
	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalarioLiquido() {
		return salarioLiquido;
	}


	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	
	//METODOS
	public void calcularSalario (double salarioLiquido) {
		desconto = salarioLiquido * 0.02;
		salario = salarioLiquido- desconto;
		System.out.println("O salário com os descontos é: " +salario);
	}
}
