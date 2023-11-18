package br.com.vainaweb.backendt3.introduction; 

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class megaSena {
	public static void main(String[] args) {
	
	List<Integer> winNumbers = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < 7; i++) {
    while (true) {
    int winNumber = random.nextInt(99) + 1;
     if (!winNumbers.contains(winNumber))  {
         winNumbers.add(winNumber);
         break;
}
}   
}  
  System.out.println("Por favor, digite 7 números entre 1 e 100");
  Scanner sc = new Scanner(System.in);
  
  List<Integer> selectedNumbers = new ArrayList<>();
  for (int i=0; i<7; i++) {
	//System.out.println("Gabarito para testes: " + winNumbers);
	  System.out.println("\nVocê já selecionou: " + selectedNumbers);
	  System.out.println("Escolha um número entre 1 e 100: ");
	  
 
while (true) {
	
   try {
   String stringNumber = sc.nextLine();
   int number = Integer.parseInt(stringNumber);
   if ((number >= 1 && number <= 100) && (!selectedNumbers.contains(number))) {
   selectedNumbers.add(number);
   
 break;
 
   } else {
   	  System.out.println(number + " não está entre 1 e 100 ou já foi selecionado, tente novamente.");
}
   }
  catch (NumberFormatException noNumber) {
	  System.out.println("Isso não é um número! Tente novamente.");
  }
}
}
  System.out.println("-------------------------------------------------------------\n");
  System.out.println("  Os números sorteados eram: " + winNumbers);
  System.out.println("  Você escolheu: " + selectedNumbers);
  selectedNumbers.retainAll(winNumbers); {
  System.out.println("  Você acertou esse(s) número(s): " + selectedNumbers);
  System.out.println("\n-------------------------------------------------------------");
  
  int count = 0;
  for (Integer n : selectedNumbers) if (winNumbers.contains(n)) count++;
     if (count < 5) {
	  System.out.println("\nVocê não conseguiu nenhum prêmio, mais sorte da próxima vez.");
  } else if (count == 5) {
	  System.out.println("\nParabéns! Você acaba de ganhar 10 mil reais!");
  }else  if (count == 6) {
	  System.out.println("\nParabéns! Você acaba de ganhar 50 mil reais!");
  } else  if (count == 7) {
	  System.out.println("\nInacreditável! Você acertou todos os números e acaba de ganhar 200 mil reais!");
  }
   sc.close();
}
}
}
  	
