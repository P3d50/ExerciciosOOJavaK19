package br.com.conta;

public interface ContaInterface {
	
	//informa se a conta foi criada com sucesso
	void contaCriada();
	 
	//atualiza o número total de contas
	void updateContas();
	
	int getNumeroDaConta();
	
	 void transferencia(Conta conta,double valor);
	
	 void deposito(double valor);
	
	 void saque(double valor);
	
	 double getSaldo();
	
	 void setLimite(double limite);
	
	 double getLimite();
	
	
}
