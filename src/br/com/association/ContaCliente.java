package br.com.association;

import br.com.conta.Conta;
import br.com.cliente.Cliente;


public class ContaCliente {
	
	public Cliente cliente;
	public Conta conta;
	
	public ContaCliente( Conta conta,Cliente cliente){
		
		this.cliente = cliente;
		this.conta = conta;
		
		System.out.println("\n\nConta vinculada ao cliente:");
		System.out.printf("Cliente:%1$s, Conta:%2$d\n",this.cliente.getNome(),this.conta.getNumeroDaConta());
		
	}

	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Conta getConta() {
		return conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
}
