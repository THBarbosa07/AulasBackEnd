package br.com.vainaweb.backendt3.introduction;

import java.util.Scanner;

public class Catch {
public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 	 
	 try {
			int idade = Integer.parseInt("19");
			System.err.println(idade);
		}catch(NumberFormatException e) {
			System.err.println(e.getMessage());
		}
	 sc.close();
}
}

//try {
	
//}catch(nomeDaException variavelAuxiliar) {
	
//}