package tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.cliente.Cliente;

public class ShellClienteTest {
	
	
	Cliente cliente1;
	Cliente cliente2;
	Cliente cliente3;
	Cliente cliente4;
	Cliente cliente5;
	List<Cliente> clientes;
	
	@Before
	public void Scenario() {
		
		try {
			this.cliente1= new Cliente("Pedro",1);
			this.cliente2= new Cliente("Ana",2);
			this.cliente3= new Cliente("Maria",3);
			this.cliente4= new Cliente("Jose",4);
			this.cliente5= new Cliente("Andrea",5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		this.clientes = new ArrayList<>();
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);
		clientes.add(cliente5);
		
	}
	
	@After
	public void cleanScenary() {
		this.clientes.removeAll(this.clientes);
		cliente1=null;
		cliente2=null;
		cliente3=null;
		cliente4=null;
		cliente5=null;
		
	}
	
	@Test
	public void testPesquisaCliente(){
	
	//teste do m�todo de busca do shellCliente
	Cliente cliente = cliente1;
	assertThat(cliente1.getCodigo(),is(1));
	assertThat(cliente1.getNome(),is("Pedro"));	
	}
	
	
}
