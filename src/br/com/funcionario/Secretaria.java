package br.com.funcionario;

public class Secretaria extends Funcionario {
	
	private int ramal;
	private static int countRamal;
	  
	public Secretaria() {
		Secretaria.countRamal++;
		this.ramal = Secretaria.countRamal;
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
	public String toString() {
		return super.toString()+"\nRamal:"+getRamal();

	}
	
	@Override
	void calculaBonificacao() {
		this.salario+=(this.salario*=0.03);
		
	}

}
