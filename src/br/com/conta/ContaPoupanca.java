package br.com.conta;

public class ContaPoupanca extends Conta {


	public ContaPoupanca(){
		updateContas();
		contaCriada();
		this.setNumeroDaConta();
	    this.deposito(0);
	    getSaldo();
	    getLimite();
	};
	
	public ContaPoupanca(double saldo,double limite){
		
		updateContas();
		contaCriada();
		this.setNumeroDaConta();
		
		this.deposito(saldo);
		setLimite(limite);
		
	}
	
	public ContaPoupanca(double saldo){
		updateContas();
		contaCriada();
		this.setNumeroDaConta();
		deposito(saldo);
		getLimite();
		
	}
	
	public void contaCriada() {
		System.out.println("\nConta criada com sucesso");
	}
	
	 public void updateContas() {
		
		 ContaPoupanca.setNumeroDeContas(ContaPoupanca.getNumeroDeContas() + 1);
	}
	
	
	public int getNumeroDaConta() {
		return this.numeroDaConta;
	}
	
	public void transferencia(Conta conta,double valor) {
		
		int numConta=conta.getNumeroDaConta();
		
		if((this.getSaldo() >= valor)) {
			
			this.setSaldo(this.getSaldo() - valor);
			conta.deposito(valor);
			System.out.printf("\nTransferência realizada com sucesso para a conta:%1$d",numConta);
			
		}
		else if(this.getSaldo()+this.getLimite() >= valor) {
			
			System.out.println("Saldo insuficiente, para esta operação sera usado o seu limite");
			getSaldo();
			getLimite();
			
			double excedente = valor-this.getSaldo();
			this.setSaldo(0);
			double limite = this.getLimite();
			this.setLimite(limite-=excedente);
			conta.deposito(valor);
			System.out.printf("Transferência de %1$f reais realizada para conta %2$d\n",valor,numConta);
			getSaldo();
			getLimite();
			
		}
		else
			System.out.println("Transferência não realizada, saldo insuficiente");
		
	}
	
	public void deposito(double valor) {
		
		valor= this.getSaldo() + valor;
		
		this.setSaldo(valor);
		
		}
	
	public void saque(double valor) {
		
		System.out.printf("Saque de: %1$f\n",valor);
		
		double saldo=this.getSaldo();
		saldo-=valor;
		this.deposito(saldo);
		getSaldo();
		
	}
	
	
	public double getSaldo() {
		
		System.out.printf("Conta:%1$d, Saldo atualizado : %2$f\n",this.getNumeroDaConta(),this.saldo);
		return this.saldo;
	}	
	
	public void setLimite(double limite) {
		
		if(limite>this.getLimite()) {
			this.limite=limite;
			System.out.println("Limite atualizado:\n");
			getLimite();
			}
		else {
			System.out.printf("Conta:%1$d, Limite atual:%2$f é maior que o valor:%3$f\n",this.getNumeroDaConta(), getLimite(),limite);
			
		}

	}
	
	public double getLimite() {
		
		System.out.printf("Conta:%1$d, Limite atual:%2$f\n",this.getNumeroDaConta(), this.limite);
		return this.limite;
		
		}


}
