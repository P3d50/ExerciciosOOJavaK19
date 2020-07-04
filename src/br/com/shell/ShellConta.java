package br.com.shell;

import br.com.conta.*;
import br.com.cliente.*;
import br.com.association.ContaCliente;;

public class ShellConta {
	
		
		public static void main(String[] args) {
			
			Cliente cliente = new Cliente("Pedro");
			
			ContaCorrente conta1 = new  ContaCorrente(100000,100000);
			
			ContaCorrente conta2 = new  ContaCorrente(100);
			
			
			ContaCorrente c = new ContaCorrente();
			
			ContaCliente contaCliente = new ContaCliente(conta1,cliente);
			
			Conta contaPoupanca = new ContaPoupanca(100000,1000000);
			Cliente cliente2 = new Cliente("Andrea");
			ContaCliente contaCliente2 = new ContaCliente(contaPoupanca,cliente2);
			contaCliente2.cliente.getNome();
			contaCliente2.conta.getLimite();
			contaCliente2.conta.getSaldo();
			contaCliente2.conta.getNumeroDaConta();
			
		
			contaCliente.conta.transferencia(conta2, 159000);
			contaCliente.conta.transferencia(c, 5000);
			
			conta2.getSaldo();
			conta2.getLimite();
			
			c.getSaldo();
			c.getLimite();
		}
			


}
