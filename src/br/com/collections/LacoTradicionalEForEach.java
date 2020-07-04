package br.com.collections;

import java . util . LinkedList ;
import java . util . List ;

public class LacoTradicionalEForEach {

	public static void main ( String [] args ) {
		LinkedList < Integer > linkedList = new LinkedList < Integer >() ;
		int size = 100000;

		for ( int i = 0; i < size ; i++) {
			 linkedList . add(i);
		}

		long tempo = LacoTradicionalEForEach . forTradicional ( linkedList );
		System . out. println ("For Tradicional : " + tempo + "ms");
		
		tempo = LacoTradicionalEForEach . foreach ( linkedList);
		System . out. println (" Foreach : " + tempo + "ms");

		}

	public static long forTradicional (List < Integer > lista ) {
		long inicio = System . currentTimeMillis ();

		for ( int i = 0; i < lista . size (); i ++) {
			int x = lista . get(i);
		}

		long fim = System . currentTimeMillis ();

		return fim - inicio ;
 }

	public static long foreach (List < Integer > lista ) {
		long inicio = System . currentTimeMillis ();

		for ( int x : lista ) {

		}

		long fim = System . currentTimeMillis ();

		return fim - inicio ;
	}
 }
