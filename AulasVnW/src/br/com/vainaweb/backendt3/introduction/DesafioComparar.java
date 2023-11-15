package br.com.vainaweb.backendt3.introduction;

import java.util.Locale;
import java.util.Scanner;

public class DesafioComparar {
public static void main(String[] args) {
	Locale.setDefault(new Locale("en", "US"));
	
	Scanner entrada = new Scanner(System.in);
	System.out.print("Digite o primeiro número: ");
	String primeiro = entrada.next().replace(",",".");
	
	System.out.print("Digite o segundo número: ");
	String segundo = entrada.next().replace(",",".");
	
	System.out.print("Digite o terceiro número: ");
	String terceiro = entrada.next().replace(",",".");
	
	double n1 = Double.parseDouble(primeiro);
	double n2 = Double.parseDouble(segundo);
	double n3 = Double.parseDouble(terceiro);
	
	if( n1 > n2 && n1 > n3) {
		System.out.println("\nO maior é: " + n1);
	} else if (n2 > n1 && n2 > n3) {
		System.out.println("\nO maior é: " + n2);
	} else if (n3 > n2 && n3 > n1) {
		System.out.println("\nO maior é: " + n3);
	}
	
	entrada.close();
	}
	}




