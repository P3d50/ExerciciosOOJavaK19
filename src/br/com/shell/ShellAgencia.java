package br.com.shell;

import br.com.agencia.Agencia;;

public class ShellAgencia {
	
	public static void main(String[] args) {
		
		Agencia agencia1 = new Agencia();
		agencia1.numero = 1;
		
		Agencia agencia2 = new Agencia();
		agencia2.numero = 2;
		
		System.out.println("Agencia:"+agencia1.numero);
		System.out.println("Agencia:"+agencia2.numero);
	}

}
