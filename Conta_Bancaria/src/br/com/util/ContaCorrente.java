package br.com.util;

import br.com.main.Conta;

public class ContaCorrente extends Conta {
	
	private String nome;
	private long conta;
	private double saldoConta;

	int saques=0;
	int qntSaque =0;
	int depositos=0;
	double saqueTotal =0;
	double depositoTotal =0;
	
	
	public ContaCorrente() {}
	
	public ContaCorrente(String nome, long conta, double saldoConta, double saqueTotal){
		this.nome = nome;
		this.conta =conta;
		this.saldoConta = saldoConta;
		this.saqueTotal = saqueTotal;
	}


	public double getSaldoConta() {
	return this.saldoConta;
	}
	
	public void depositar(double deposito) {
		if (deposito>0) {
			this.saldoConta = this.saldoConta+deposito;
			depositos++;
			depositoTotal = depositoTotal + deposito;
			 System.out.println("Depositado o valor de R$: " +deposito);
			  System.out.println("Seu novo saldo de R$: " + saldoConta + "\n");
		}else {
			 System.out.println("Valor inválido!!");
		}
	}
	
	public void sacar(double saque) {
		if (this.saldoConta >=saque) {
		this.saldoConta = this.saldoConta - (saque+5);
		System.out.println("Sacado o valor de R$: " +saque);
        System.out.println("Seu novo saldo de R$: " + saldoConta+ "\n");
			saques++;
			saqueTotal = saqueTotal+ saque;
      } else {
          System.out.println("Seu saldo está insuficiente. Realize um depósito\n");
		}
	}
	
	//Consertar o nome
	public void gerarExtrato () {
		System.out.println("Dados da Conta: "+"\n"+"Conta número: " + conta + ", Titular: " +nome + " , Saldo de R$ " +this.saldoConta);
		System.out.println("Quantidade de saques que foram realizados hoje: " + this.saques + ", no valor total de R$" +this.saqueTotal + "\n");
		System.out.println("Quantidade de depósitos que foram realizados hoje: " + this.depositos + ", no valor total de R$" +this.depositoTotal + "\n");
	}
	}
