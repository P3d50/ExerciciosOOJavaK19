package br.com.cartao;

abstract class Cartao{
	
	private int numero;
	private String dataDeValidade;
	
	public Cartao(int numero, String dataDeValidade){
		
		this.numero = numero;
		this.dataDeValidade = dataDeValidade;
		
		System.out.println(
				"Número do cartão do cliente: "+getNumero()
				+", validade: "+getValidade()
				);
	
		}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getValidade() {
		return this.dataDeValidade;
	}
	

}