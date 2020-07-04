package br.com.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Out {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream arquivo = new FileOutputStream("saida.txt");
		PrintStream printStream = new PrintStream(arquivo);
		
		printStream.println("linha 4");
		printStream.println("linha 5");
		printStream.println("linha 6");
		printStream.close();
		
		
		InputStream arquivoIn = new FileInputStream("saida.txt");
		Scanner sc = new Scanner(arquivoIn);
		
		
		while(sc.hasNextLine()) {
			String linha = sc.nextLine();
			System.out.println(linha);
		}
		
		sc.close();
		
		
	}

}
