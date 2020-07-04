package br.com.cliente;

public class Cliente {
	
	private String nome;
	private int codigo;
	static int numeroDeClientes; 
	
	public Cliente(String nome) {
		this.codigo = updateClientes();
		this.nome = nome;
		System.out.println("Nome do cliente: "+this.nome+", código do cliente: "+this.codigo);

		
	}
	
	public Cliente(String nome,int codigo) throws Exception {
		int cod = updateClientes(codigo);
		if(cod !=0) {
			this.codigo = cod;
			this.nome = nome;
			System.out.println("Nome do cliente: "+this.nome+", código do cliente: "+this.codigo);
		}else {
			throw new Exception();
		}
		
	}
	
	public int updateClientes(){
			Cliente.numeroDeClientes++;
		
		return Cliente.numeroDeClientes;
	}
	
	public int updateClientes(int codigo){
		if(codigo > Cliente.numeroDeClientes)
			return codigo;
		else
			return 0;
}
	
	public String getNome() {
		return this.nome;
		
	}

	public Object getCodigo() {
		// TODO Auto-generated method stub
		return this.codigo;
	}
	
	
}
