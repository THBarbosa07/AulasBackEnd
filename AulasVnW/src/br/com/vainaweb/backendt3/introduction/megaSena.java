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
  System.out.println("Por favor, digite 7 números entre 1 e 100\n");
  Scanner sc = new Scanner(System.in);
  
  List<Integer> selectedNumbers = new ArrayList<>();
  for (int i=0; i<7; i++) {
	  System.out.println("Você já selecionou: " + selectedNumbers);
	  System.out.println("Escolha um número entre 1 e 100: ");
	  
 
while (true) {
	
 
   try {
   String stringN = sc.nextLine();
   int number = Integer.parseInt(stringN);
   if(number >= 1 && number <= 99) {
   selectedNumbers.add(number);
 break;
  }
  
  else {
	  System.out.println(number + " não está entre 1 e 100, tente novamente.");
}
  
   }
  catch (NumberFormatException noNumber) {
	  System.out.println("Isso não é um número! Tente novamente.");
  }
}
}
  System.out.println("Os números sorteados eram: " + winNumbers);
  System.out.println("Você escolheu: " + selectedNumbers);
  selectedNumbers.retainAll(winNumbers); {
  System.out.println("Você acertou esses números: " + selectedNumbers);
  
   if (selectedNumbers.retainAll(winNumbers)) {
	  System.out.println("Wow! Você realmente conseguiu? Meus parabéns!");
  }else {
	  System.out.println("Vish, mais sorte da próxima vez...");
  }
    }
  sc.close();
  	}
	}