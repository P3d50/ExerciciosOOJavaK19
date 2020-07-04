package br.com.string;
public class TestaPoolDeStrings {

public static void main ( String [] args ) {

String nome1 = " Rafael Cosentino " ;

String nome2 = " Rafael Cosentino " ;


// exibe true

// exibe true

System.out.println( nome1.equals ( nome2 ) ) ;

String nome3 = new String ( " Rafael Cosentino " ) ;

String nome4 = new String ( " Rafael Cosentino" ) ;

// exibe false

System.out.println( nome3 == nome4 ) ;

// exibe true
System.out.println( nome3.equals( nome4 ));

}

}