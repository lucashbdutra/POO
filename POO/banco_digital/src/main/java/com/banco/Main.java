package com.banco;
public class Main {

	public static void main(String[] args) {
		Cliente jao = new Cliente();
		jao.setNome("Jão");
		
		Conta cc = new ContaCorrente(jao);
		Conta poupanca = new ContaPoupanca(jao);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		

		Cliente lucas = new Cliente();
		lucas.setNome("lucas");
		
		Conta cc1 = new ContaCorrente(lucas);
		Conta poupanca1 = new ContaPoupanca(lucas);

		cc1.depositar(100);
		cc1.transferir(100, poupanca);


		Banco bb = new Banco();
		bb.setContas(poupanca);
		bb.setContas(poupanca1);
		
		bb.listar();

		System.out.println("\n \n");
		poupanca.imprimirExtrato();
		
		System.out.println("\n \n");
		cc.imprimirExtrato();
	}

}
