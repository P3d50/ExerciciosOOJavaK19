package br.com.conta;


public abstract class Conta implements ContaInterface {
	
	protected int numeroDaConta;
	protected double saldo;
	protected double limite = 100;
	protected static int numeroDeContas;
	
	public static int getNumeroDeContas() {
		return numeroDeContas;
	}
	
	public static void setNumeroDeContas(int numeroDeContas) {
		Conta.numeroDeContas = numeroDeContas;
	}
	
	public int getNumeroDaConta() {
		return this.numeroDaConta;
	}
	public void setNumeroDaConta() {
		this.numeroDaConta = numeroDeContas;
	}
	public double getSaldo() {
		return saldo;
	}
	public double setSaldo(double saldo) {
		this.saldo = saldo;
		return saldo;
	}

}
