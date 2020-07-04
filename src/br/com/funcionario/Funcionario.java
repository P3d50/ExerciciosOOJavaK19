package br.com.funcionario;

public abstract class Funcionario {
	
	private String nome;
	protected double salario = 0;
	public static int count = 1;
	private int codigo;
	
	public Funcionario() {
		setCodigo(Funcionario.count++);
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;

	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		if(salario < this.salario) {
			IllegalArgumentException erro = new IllegalArgumentException () ;
			throw erro ;
		}
		else
			this.salario = salario;
	}
	
	public void aumentaSalario(double salario) {
		
		this.salario = this.getSalario();
		
		if ( salario < this.salario) {
			
				IllegalArgumentException erro = new IllegalArgumentException () ;
				throw erro ;
			
			}
		else {
			
				this.salario = salario;
				this.calculaBonificacao();
		}
		
		
	}
	
	public String toString() {
		
		return "\nNome do funcionario:"+getNome()
		+"\nSalário do funcionário:"+getSalario()
		+"\nCódigo do funcionário:"+getCodigo();
	}
	
	abstract void calculaBonificacao();


}
