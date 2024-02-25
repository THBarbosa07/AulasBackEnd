package br.com.vainaweb.backendt3.introduction.calculadora;

public class CalculadoraLib {
	   public static double somar(double... numeros) {
	        double resultado = 0;
	        for (double numero : numeros) {
	            resultado += numero;
	        }
	        return resultado;
	   }
	   
	   public static double subtrair(double... numeros) {
	        if (numeros.length == 0) {
	            throw new IllegalArgumentException("Pelo menos um número deve ser fornecido para a subtração.");
	        }

	        double resultado = numeros[0];
	        for (int i = 1; i < numeros.length; i++) {
	            resultado -= numeros[i];
	        }
	        return resultado;
	    }

	   public static double multiplicar(double... numeros) {
	        double resultado = 1;
	        for (double numero : numeros) {
	            resultado *= numero;
	        }
	        return resultado;
	    }


	   public static double dividir(double... numeros) {
	        if (numeros.length == 0) {
	            throw new IllegalArgumentException("Pelo menos um número deve ser fornecido para a divisão.");
	        }

	        double resultado = numeros[0];
	        for (int i = 1; i < numeros.length; i++) {
	            if (numeros[i] != 0) {
	                resultado /= numeros[i];
	            } else {
	                throw new ArithmeticException("Não é possível dividir por zero.");
	            }
	        }
	        return resultado;
	    }
	   
 public static double resto(double x, double y) {
     return x % y;
 }

 public static double potencia(double x, double y) {
     return Math.pow(x, y);
 }
 
 public static double jurosSimples(double x, double y, double z) {
     return x*y*z;
 }
 
 public static double jurosCompostos(double x, double y, double z) {
     return x * Math.pow(1 + y, z) - x;
 }
 
 public static double areaRetangulo(double x, double y) {
 return x * y;
 }
 
 public static double perimetroRetangulo(double x, double y) {
 return 2* (x + y);
}
 
 public static double volume(double x) {
     return Math.pow(x, 3);
 }
    
}
