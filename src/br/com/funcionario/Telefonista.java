package br.com.funcionario;

public class Telefonista extends Funcionario {
	
	private static int countEstacaoDeTrabalho =1;
	private int estacaoDeTrabalho =1;
	
	public Telefonista(){
		
		setEstacaoDeTrabalho();
	}
	
	public int getEstacaoDeTrabalho() {
		return this.estacaoDeTrabalho;
	}

	private void setEstacaoDeTrabalho() {
		int count = Telefonista.countEstacaoDeTrabalho++;
		this.estacaoDeTrabalho = count;
	}
	
	public String toString() {
		return super.toString()+"\nEstação de trabalho:"+getEstacaoDeTrabalho();
	}

	@Override
	void calculaBonificacao() {
		this.salario+=(this.salario*0.03);
		
	}
	
	

}
