package br.com.shell;

import br.com.conta.*;
import br.com.cartao.*;
import br.com.cliente.*;
import br.com.association.*;

public class ShellCartao {

	public static void main(String[] args) {
		
	Cliente cliente = new Cliente("Pedro");
	CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(26377363,"06/2026");
	CartaoDoCliente cartaoDoCliente = new CartaoDoCliente(cliente, cartaoDeCredito);
	ContaCorrente conta = new ContaCorrente();
	ContaCliente contaCliente = new ContaCliente(conta,cliente);
	
	contaCliente.conta.getSaldo();
	contaCliente.conta.deposito(10000);
	contaCliente.conta.saque(1000);
	
	Cliente cliente1 = new Cliente("Andrea");
	CartaoDeCredito cartaoDeCredito1 = new CartaoDeCredito(245688796,"04/2026");
	new CartaoDoCliente(cliente1, cartaoDeCredito1);
	ContaCorrente conta1 = new ContaCorrente();
	ContaCliente contaCliente1 = new ContaCliente(conta1,cliente1);
	
	contaCliente1.conta.getSaldo();
	contaCliente1.conta.deposito(10000);
	contaCliente1.conta.saque(1000);
	
	
	
	}

}
