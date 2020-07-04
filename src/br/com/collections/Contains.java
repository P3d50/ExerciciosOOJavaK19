package br.com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Contains {
	
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		HashSet hashSet = new HashSet();
		
		long tempo = Contains.contains(arrayList);
		System.out.println("ArrayList: "+tempo+"ms");
		
		tempo = Contains.contains(hashSet);
		System.out.println("HashSet: "+tempo+"ms");
	}
	
		public static long contains(Collection collect) {
			
			int size = 100000;
			
			for(int i =0;i<size;i++) {
				collect.add(i);
			}
			
			long inicio = System.currentTimeMillis();
			
			for(int i =0;i<size;i++) {
				collect.contains(i);
			}
			
			long fim = System.currentTimeMillis();
			
			return fim-inicio;

		}
}
