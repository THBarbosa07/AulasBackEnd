package br.com.vainaweb.backendt3.introduction.calculadora;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class DesafioCalculadora {
	
	 public static double somar(double x, double y) {
	        return x + y;
	    }

	  public static double subtrair(double x, double y) {
	        return x - y;
	    }

     public static double multiplicar(double x, double y) {
        return x * y;
    }

     public static double dividir(double x, double y) {
        return x / y;
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
        
    public static double lerDouble(Scanner sc) {
        return Double.parseDouble(sc.nextLine());
    }

    public static int lerInt(Scanner sc) {
        return Integer.parseInt(sc.nextLine());
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        boolean maisUma = true;
        while (maisUma) {
            System.out.println("Escolha a opção: \n");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Resto da divisão");
            System.out.println("6 - Potenciação");
            System.out.println("7 - Juros Simples");
            System.out.println("8 - Juros Compostos");
            System.out.println("9 - Área do retângulo");
            System.out.println("10 - Perímetro do retângulo");
            System.out.println("11 - Volume");
         
            int escolha = lerInt(sc);
            double numero;
               
            switch (escolha) {
                               
               case 1:
            	   Scanner somaSc = new Scanner(System.in);
            	   double soma = 0;
                   

                   do {
                       System.out.print("Digite um número (ou 0 para calcular): ");
                       while (!somaSc.hasNextDouble()) {
                           System.out.println("Entrada inválida. Por favor, digite um número válido.");
                           somaSc.next();
                       }

                       numero = somaSc.nextDouble();
                       soma += numero;

                   } while (numero != 0);

                   System.out.println("A soma dos números inseridos é: " + soma);
                  break;
                
                case 2:
             	   Scanner subSc = new Scanner(System.in);
            	   double subtracao = 0;
            	   boolean primeiroNumero = true; 

                   do {
                       System.out.print("Digite um número (ou 0 para calcular): ");
                       while (!subSc.hasNextDouble()) {
                           System.out.println("Entrada inválida. Por favor, digite um número válido.");
                           subSc.next();
                       }
                       numero = subSc.nextDouble();
                       if (primeiroNumero) {
                           subtracao = numero;
                           primeiroNumero = false;
                       } else {
                           subtracao -= numero; 
                       }
                                } while (numero != 0);
                   System.out.println("A subtração dos números inseridos é: " + subtracao);
                   break;
                
                case 3:
                	  Scanner multSc = new Scanner(System.in);
                	  double multiplicacao = 1;
                      do {
                          System.out.print("Digite um número (ou 0 para calcular): ");
                          while (!multSc.hasNextDouble()) {
                              System.out.println("Entrada inválida. Por favor, digite um número válido.");
                              multSc.next();
                          }
                          numero = multSc.nextDouble();
                          if (numero != 0) {
                              multiplicacao *= numero;
                          }
                      } while (numero != 0);
                      System.out.println("A multiplicação dos números inseridos é: " + multiplicacao);
                      break;
                
                case 4:
                	  System.out.println("Digite o dividendo número: ");
                      double div1 = lerDouble(sc);
                      System.out.println("Digite o divisor número: ");
                      double div2 = lerDouble(sc);
                    System.out.println("Resultado: " + dividir(div1, div2));
                    break;
                
                case 5:
                	  System.out.println("Digite o dividendo número: ");
                      double res1 = lerDouble(sc);
                      System.out.println("Digite o divisor número: ");
                      double res2 = lerDouble(sc);
                    System.out.println("Resto: " + resto(res1, res2));
                    break;
                
                case 6:
                	  System.out.println("Digite o número base: ");
                      double pot1 = lerDouble(sc);
                      System.out.println("Digite o expoente: ");
                      double pot2 = lerDouble(sc);
                    System.out.println("Resultado: " + potencia(pot1, pot2));
                    break;
               
                case 7:
              	  System.out.println("Digite o capital: ");
                    double js1 = lerDouble(sc);
                    System.out.println("Digite a taxa de juros: ");
                    double js2 = lerDouble(sc);
                    System.out.println("Digite o tempo: ");
                    double js3 = lerDouble(sc);
                  System.out.println("Resultado: " + jurosSimples(js1, js2, js3));
                  break;
                  
                case 8:
                	  System.out.println("Digite o capital: ");
                      double jc1 = lerDouble(sc);
                      System.out.println("Digite a taxa de juros: ");
                      double jc2 = lerDouble(sc);
                      System.out.println("Digite o tempo: ");
                      double jc3 = lerDouble(sc);
                    System.out.println("Resultado: " + jurosCompostos(jc1, jc2, jc3));
                    break;
                    
                case 9:
              	  System.out.println("Digite o comprimento: ");
                    double ar1 = lerDouble(sc);
                    System.out.println("Digite a largura: ");
                    double ar2 = lerDouble(sc);
                    System.out.println("Resultado: " + areaRetangulo(ar1, ar2));
                  break;
              
                case 10:
                	  System.out.println("Digite o comprimento: ");
                      double pr1 = lerDouble(sc);
                      System.out.println("Digite a largura: ");
                      double pr2 = lerDouble(sc);
                      System.out.println("Resultado: " + perimetroRetangulo(pr1, pr2));
                    break;
                    
                case 11:
              	  System.out.println("Digite a aresta: ");
                    double a = lerDouble(sc);
                   System.out.println("Resultado: " + volume(a));
                  break;
                                           
                default:
                    System.out.println("\nOpção inválida!");
            }
        
            while (true) {
                System.out.println("\nDeseja fazer mais alguma operação? (s/n)");
                String captcha = sc.nextLine();
                if (List.of("s", "S", "n", "N").contains(captcha)) {
                    maisUma = List.of("s", "S").contains(captcha);
                    break;
                } else {
                    System.out.println("Opção inválida!");
                    sc.close();
                }

                }
            }
    }   
    }



