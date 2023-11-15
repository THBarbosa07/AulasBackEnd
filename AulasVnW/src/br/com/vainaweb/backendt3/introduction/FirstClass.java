package br.com.vainaweb.backendt3.introduction;
//import java.util.*; //Puxa todas as uteis 
import java.util.Scanner;

public class FirstClass {
public static void main(String[] args) {
	double money = 1.2345235;
	System.out.printf("%.2f \n", money); //f de formatação %.2f formatar em duas casa decimais
	System.out.println("My name is Thiago \n\n");
	
	Scanner sc = new Scanner(System.in);
    System.out.println("Thiago is in love with: " + sc);
    //Int idade = sc.next.Inteiro(); 
    
    sc.close();
}
}
