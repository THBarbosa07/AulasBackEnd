package br.com.vainaweb.backendt3.introduction;

import java.util.Scanner;

public class Catch {
public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 	 
	 try {
			int nome = Integer.parseInt("Thiago");
			System.err.println(nome);
		}catch(NumberFormatException e) {
			System.err.println(e.getMessage());
		}
	 sc.close();
}
}

//try {
	
//}catch(nomeDaException variavelAuxiliar) {
	
//}