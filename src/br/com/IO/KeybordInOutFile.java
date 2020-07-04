package br.com.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class KeybordInOutFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStream teclado = System.in;
		Scanner sc = new Scanner(teclado);
		
		
		FileOutputStream arquivo = new FileOutputStream("saida.txt");
		PrintStream printStream = new PrintStream(arquivo);
		
		while(sc.hasNextLine()) {
			printStream.println(sc.nextLine());
		}

	}

}
