package br.com.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class InOutOther {

		
		public static void main(String[] args) throws IOException {
			
			
			
			
			InputStream arquivoIn = new FileInputStream("ReadFile.java");
			Scanner sc = new Scanner(arquivoIn);
			
			
			FileOutputStream arquivo = new FileOutputStream("saida.txt");
			PrintStream printStream = new PrintStream(arquivo);
			
			while(sc.hasNextLine()) {
				printStream.println(sc.nextLine());
			}
			
			
			
			
		
			
			
		}

	}
