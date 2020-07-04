package br.com.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;


public class ReadFile {
	
	public static void main(String[] args) throws IOException {
		InputStream arquivo = new FileInputStream("ReadFile.java");
		Scanner sc = new Scanner(arquivo);
		
		
		while(sc.hasNextLine()) {
			String linha = sc.nextLine();
			System.out.println(linha);
		}
		
		sc.close();
	}

}
