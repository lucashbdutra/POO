package com.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(Conta contas) {
		this.contas.add(contas);
	}

	public void listar(){
		for(Conta i: getContas()){
			System.out.println("Nome: " + i.getCliente().getNome());
			System.out.println("Saldo: " + i.getSaldo());
		}
	}

}
