package br.com.IO;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class In {

	public static void main(String[] args) {
		
		InputStream teclado = System.in;
		Scanner sc = new Scanner(teclado);
		
		while(sc.hasNextLine()) {
			String linha = sc.nextLine();
			System.out.println(linha);
		}
		
		sc.close();
	}
}
