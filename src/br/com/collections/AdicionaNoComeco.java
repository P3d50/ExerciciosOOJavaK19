package br.com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AdicionaNoComeco {
	
	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		LinkedList linkedList = new LinkedList();
		
		long tempo = AdicionaNoComeco.adicionaNoComeco(arrayList);
		System.out.println("ArrayList: "+tempo+"ms");
		
		tempo = AdicionaNoComeco.adicionaNoComeco(linkedList);
		System.out.println("LinkedList: "+tempo+"ms");
		
	}
	
	public static long adicionaNoComeco(List lista) {
		
		long inicio = System.currentTimeMillis();
		
		int size = 10000;
		
		for(int i=0; i<size;i++) {
			
			lista.add(i);
		}
		
		long fim = System.currentTimeMillis();
		
		return fim-inicio;
	}

}
