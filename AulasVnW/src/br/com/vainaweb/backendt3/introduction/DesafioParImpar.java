package br.com.vainaweb.backendt3.introduction;

import java.util.Scanner;

public class DesafioParImpar {
public static void main(String[] args) {
	
	
	Scanner entrada = new Scanner(System.in);
	System.out.print("Digite um número: ");
			
	int i = entrada.nextInt();

     if(i % 2 == 0)
     System.out.println("É par !");

     else
     System.out.println("É impar!");
	
	entrada.close();
	}
	}
