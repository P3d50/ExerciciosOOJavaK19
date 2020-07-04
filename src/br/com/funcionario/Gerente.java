package br.com.funcionario;

public class Gerente extends Funcionario {
	
	private String user;
	private String senha;
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String toString() {
		
		return super.toString()+"\nUsuário:"+getUser()+", Senha:"+getSenha();

	}
	
	@Override
	protected void calculaBonificacao() {
		this.salario+=(this.salario*=0.03);
		
	}

}
