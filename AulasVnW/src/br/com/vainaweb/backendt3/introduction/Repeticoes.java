package br.com.vainaweb.backendt3.introduction;

public class Repeticoes {
public static void main(String[] args) {
	//enquanto, faça/enquanto e para
	//while, do/while, for
	byte contador = 0;
		
	while(contador < 5) {
		System.out.println("Dentro do while: " + contador++); //++ significa incremento
	}
		do { 
			System.out.println("\nDentro do do while: " + contador);
		} while (contador < 5);
		System.out.println("Done");
for (int i = 0; i <= 10; i+=2) { //i e j são padrões 	
 System.out.println("\nDentro do for while: " +i);  
 }
}
}

