package fundamentos;

import java.util.Scanner;

public class Console {
 public static void main(String[] args) {
	System.out.print("Bom");
	System.out.print(" dia!\n\n"); //\n %n quebra de linha
	
	System.out.println("Boa");
	System.out.println("tarde!");
	
	System.out.printf("Megasena: %d %d %d %d %d %d %n",
			1, 2, 3, 4, 5, 6);
	
	System.out.printf("Salário: %.1f%n", 1253.6542);
	System.out.printf("Nome: %s%n", "João");
    
	
	Scanner entrada = new Scanner(System.in);
	System.out.print("Digite seu nome: ");
	String nome = entrada.nextLine();
	
	System.out.print("Digite seu sobrenome: ");
	String sobrenome = entrada.nextLine();
	
	System.out.print("Digite sua idade: ");
	int idade = entrada.nextInt();
	
	System.out.println("\n\nNome: " + nome + " " + sobrenome + "\nIdade: " + idade);
	
	entrada.close();
}
}
