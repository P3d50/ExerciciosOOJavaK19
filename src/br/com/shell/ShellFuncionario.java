package br.com.shell;

import br.com.controleDePonto.ControleDePonto;
import br.com.funcionario.*;

public class ShellFuncionario {
	
	
	static ControleDePonto cdp = new ControleDePonto();

	private static void entradaMask(Funcionario f){
		System.out.println(""+cdp.registraEntrada(f));
	}
	
	private static void saidaMask(Funcionario f){
		System.out.println(""+cdp.registraSaida(f));
	}
	
	private static void print(String s,Funcionario f) {
		System.out.print(f.getClass());
		System.out.println(s);
	}
	
	private static void compara(Funcionario f, Funcionario f2) {
		
		System.out.printf(
		"Comparação de %1$s com %2$s\n %3$s\n",f.getClass(),f2.getClass(),
		(f.getClass().equals(f2.getClass()))?"São iguais":"Não são iguais"
		);
	}

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Pedro");
		try {
			gerente.setSalario(-15000);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Valor inválido,o valor deve ser numérico e maior que o salário atual");
		}
		gerente.setSenha("q1w2e3r4");
		gerente.setUser("PedroGerente");
		print(gerente.toString(),gerente);
		entradaMask(gerente);
		saidaMask(gerente);
		
		Telefonista telefonista = new Telefonista();
		telefonista.setNome("Ana");
		telefonista.setSalario(1500);
		print(telefonista.toString(),telefonista);
		entradaMask(telefonista);
		saidaMask(telefonista);
		
		Telefonista telefonista2 = new Telefonista();
		telefonista2.setNome("Maria");
		telefonista2.setSalario(1500);
		print(telefonista2.toString(),telefonista2);
		entradaMask(telefonista2);
		saidaMask(telefonista2);

		Telefonista telefonista3 = new Telefonista();
		telefonista3.setNome("Ana PAula");
		telefonista3.setSalario(1500);
		print(telefonista3.toString(),telefonista3);
		entradaMask(telefonista3);
		saidaMask(telefonista3);
		
		Secretaria secretaria = new Secretaria();
		secretaria.setNome("Paloma");
		secretaria.setSalario(3000);
		print(secretaria.toString(),secretaria);
		entradaMask(secretaria);
		saidaMask(secretaria);

		Secretaria secretaria2 = new Secretaria();
		secretaria2.setNome("Pietra");
		secretaria2.setSalario(3000);
		print(secretaria2.toString(),secretaria2);
		entradaMask(secretaria2);
		saidaMask(secretaria2);
		
		Secretaria secretaria3 = new Secretaria();
		secretaria3.setNome("Valdice");
		secretaria3.setSalario(4000);
		print(secretaria3.toString(),secretaria3);
		entradaMask(secretaria3);
		saidaMask(secretaria3);
		
		compara(gerente,secretaria);
		compara(gerente,telefonista);
		compara(telefonista2,telefonista);
		compara(secretaria2,secretaria);
		
	}

}
