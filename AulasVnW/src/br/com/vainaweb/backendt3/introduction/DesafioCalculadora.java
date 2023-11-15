package br.com.vainaweb.backendt3.introduction;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class DesafioCalculadora {

    public static double somar(double x, double y) {
        return y + x;
    }

    public static double multiplicar(double x, double y) {
        return x * y;
    }

    public static double subtrair(double x, double y) {
        return x - y;
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
            System.out.println("Escolha a opção:");
            System.out.println("1 Adição");
            System.out.println("2 Subtração");
            System.out.println("3 Multiplicação");
            System.out.println("4 Divisão");
            System.out.println("5 Resto da divisão");
            System.out.println("6 Potenciação");

            int escolha = lerInt(sc);
            System.out.println("Digite os valores: ");
            double var1 = lerDouble(sc);
            double var2 = lerDouble(sc);

            switch (escolha) {
                case 1:
                    System.out.println("Resultado: " + somar(var1, var2));
                    break;
                case 2:
                    System.out.println("Resultado: " + subtrair(var1, var2));
                    break;
                case 3:
                    System.out.println("Resultado: " + multiplicar(var1, var2));
                    break;
                case 4:
                    System.out.println("Resultado: " + dividir(var1, var2));
                    break;
                case 5:
                    System.out.println("Resultado: " + resto(var1, var2));
                    break;
                case 6:
                    System.out.println("Resultado: " + potencia(var1, var2));
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            while (true) {
                System.out.println("Deseja fazer mais alguma operação? (s/n)");
                String captcha = sc.nextLine();
                if (List.of("s", "S", "n", "N").contains(captcha)) {
                    maisUma = List.of("s", "S").contains(captcha);
                    break;
                } else {
                    System.out.println("Opção inválida");
                }
            }
        }
        System.out.println("Obrigado :D");
    }
}