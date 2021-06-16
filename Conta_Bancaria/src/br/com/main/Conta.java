package br.com.main;

import java.util.Scanner;

import br.com.util.ContaCorrente;

public class Conta {
	public static void main(String[] args) {
	
		ContaCorrente contaCorrente = new ContaCorrente();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n�mero da conta: ");
		long conta = sc.nextLong();
		
		System.out.println("Digite o nome do titular da conta: ");
		String nome = sc.next();
		
		System.out.println("Ser� feito o dep�sito inicial? Digite s (sim) ou n (n�o)");
		String entrada = sc.next();
		
		
		if (entrada.equals("s") || entrada.equals("S")){
			System.out.println("Digite o valor do dep�sito inicial: ");
			Double deposito = sc.nextDouble();
			contaCorrente.depositar(deposito);
		}else{
			double saldoConta =0;
			System.out.println("Dados da Conta: "+"\n"+"Conta n�mero " + conta + ", Titular " +nome + " , Saldo R$ " +saldoConta);
		}
		
		int operacoes =0;
		
		while (operacoes !=4) {
			System.out.println("Qual opera��o deseja realizar? Digite 1 (dep�sito), 2 (saque), 3 (extrato) ou 4 (sair) :");
			operacoes = sc.nextInt();
			
		if ( operacoes == 1) {
			System.out.println("Digite o valor do dep�sito: ");
			Double deposito = sc.nextDouble();
			contaCorrente.depositar(deposito);
		}else if (operacoes == 2) {
			System.out.println("Digite o valor do saque: ");
			Double saque = sc.nextDouble();
			contaCorrente.sacar(saque);
		}else if (operacoes == 3) {
			contaCorrente.gerarExtrato();
		}
		}
		System.out.println("Saindo. Obrigado!");
		sc.close();
	}
}
	
