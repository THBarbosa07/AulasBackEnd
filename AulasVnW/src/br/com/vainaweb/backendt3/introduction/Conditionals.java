package br.com.vainaweb.backendt3.introduction;

public class Conditionals {

	public static void main(String[] args) {
		        //OPERADORES LÓGICOS
		        // && -> E
				// V && V = V
				// V && F = F
				// F && V = F
				// F && F = F
								
				// || -> OU
				// V || V = V
				// V || F = V
				// F || V = V
				// F || F = F
								
				// ! -> NOT -> !VERDADEIRO = FALSO

		byte idade = 25;
		if (idade < 21) {
			System.out.println("Não pode dirigir o caminhão");
		} else {
	     System.out.println("Pode dirigir o caminhão");
		}
}
}