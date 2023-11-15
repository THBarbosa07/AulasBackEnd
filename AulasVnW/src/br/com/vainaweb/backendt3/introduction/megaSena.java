package br.com.vainaweb.backendt3.introduction;  //Tentando fazer
import java.lang.Math;
import java.util.Scanner;
//import java.util.Arrays;


public class megaSena {
public static void main(String[] args) {
	 
int r1 = (int)(Math.random() * 100 ) + 1;  
int r2 = (int)(Math.random() * 100 ) + 1;  
int r3 = (int)(Math.random() * 100 ) + 1;  
int r4 = (int)(Math.random() * 100 ) + 1;  
int r5 = (int)(Math.random() * 100 ) + 1;  
int r6 = (int)(Math.random() * 100 ) + 1;  
int r7 = (int)(Math.random() * 100 ) + 1;


int random[] = {r1, r2, r3, r4, r5, r6, r7};
//System.out.println(Arrays.toString(random));
		
Scanner sc = new Scanner(System.in);
System.out.println("Digite seis valores entre 0 e 100!\n");

System.out.print("Digite o primeiro número: ");
String primeiro = sc.next();

System.out.print("Digite o segundo número: ");
String segundo = sc.next();

System.out.print("Digite o terceiro número: ");
String terceiro = sc.next();

System.out.print("Digite o quarto número: ");
String quarto = sc.next();

System.out.print("Digite o quinto número: ");
String quinto = sc.next();

System.out.print("Digite o sexto número: ");
String sexto = sc.next();

System.out.print("Digite o sétimo número: ");
String setimo = sc.next();

int n1 = Integer.parseInt(primeiro);
int n2 = Integer.parseInt(segundo);
int n3 = Integer.parseInt(terceiro);
int n4 = Integer.parseInt(quarto);
int n5 = Integer.parseInt(quinto);
int n6 = Integer.parseInt(sexto);
int n7 = Integer.parseInt(setimo);

int selected[] = {n1, n2, n3, n4, n5, n6, n7};
//System.out.println(Arrays.toString(selected));
sc.close();
}
}
    

