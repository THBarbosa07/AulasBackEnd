package br.com.vainaweb.backendt3.introduction;

import java.util.Arrays;

public class ForEach { //Métodos e atributos
 public static void main(String[] args) {
	
	
	 int [] vetor = {10,20,30,40};
	int[][] matriz = {{10,20,30},{40,50,60}};
	 
	 for(int i=0; i<vetor.length;i++) {
		System.out.println(vetor[i]);
	}
	System.out.println("\nImprimindo com for-each");
	for(int v : vetor) {
	System.out.println(v);
}
	System.out.println("\nImprimindo matriz");
	System.out.println(Arrays.toString(vetor));
	System.out.println(Arrays.deepToString(matriz));
	
}
}
