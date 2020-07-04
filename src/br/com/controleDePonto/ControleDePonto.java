package br.com.controleDePonto;

import java.text.SimpleDateFormat;
import java.util.Date;
import br.com.funcionario.Funcionario;

public class ControleDePonto {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date agora = new Date();


	public String registraEntrada(Funcionario f) {
		
		String registroFormatado = "Funcionário:"+f.getNome()+" Entrada:"+sdf.format(agora);
		return registroFormatado;
		
	}
	
	public String registraSaida(Funcionario f) {
		
		String registroFormatado = "Funcionário:"+f.getNome()+" Saída:"+sdf.format(agora);
		return registroFormatado;

	}

}
