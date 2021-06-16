package br.com.main;

import java.util.Scanner;

import br.com.util.ContaCorrente;

public class Conta {
	public static void main(String[] args) {
	
		ContaCorrente contaCorrente = new ContaCorrente();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número da conta: ");
		long conta = sc.nextLong();
		
		System.out.println("Digite o nome do titular da conta: ");
		String nome = sc.next();
		
		System.out.println("Será feito o depósito inicial? Digite s (sim) ou n (não)");
		String entrada = sc.next();
		
		
		if (entrada.equals("s") || entrada.equals("S")){
			System.out.println("Digite o valor do depósito inicial: ");
			Double deposito = sc.nextDouble();
			contaCorrente.depositar(deposito);
		}else{
			double saldoConta =0;
			System.out.println("Dados da Conta: "+"\n"+"Conta número " + conta + ", Titular " +nome + " , Saldo R$ " +saldoConta);
		}
		
		int operacoes =0;
		
		while (operacoes !=4) {
			System.out.println("Qual operação deseja realizar? Digite 1 (depósito), 2 (saque), 3 (extrato) ou 4 (sair) :");
			operacoes = sc.nextInt();
			
		if ( operacoes == 1) {
			System.out.println("Digite o valor do depósito: ");
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
	
