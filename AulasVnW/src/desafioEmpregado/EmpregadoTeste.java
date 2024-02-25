package desafioEmpregado;

import java.util.Locale;
import java.util.Scanner;

public class EmpregadoTeste {
	    public static void main(String[] args) {
	       	
	    	Locale.setDefault(new Locale("en", "US"));
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.println("Informe os dados dos funcionários:");
	    	System.out.print("\n\nDigite o nome do primeiro funcionário: ");
	    	String nome1 = sc.next();
	    	System.out.print("Informe o CPF: ");
	    	String cpf1 = sc.next();
	    	System.out.print("Informe o salário: ");
	    	String s1 = sc.next().replace(",",".");
	    	
	    	System.out.print("\nDigite o nome do segundo funcionário: ");
	    	String nome2 = sc.next();
	    	System.out.print("Informe o CPF: ");
	    	String cpf2 = sc.next();
	    	System.out.print("Informe o salário: ");
	    	String s2 = sc.next().replace(",",".");
	    
	    	
	    	System.out.print("\nDigite o nome do terceiro funcionário: ");
	    	String nome3 = sc.next();
	    	System.out.print("Informe o CPF: ");
	    	String cpf3 = sc.next();
	    	System.out.print("Informe o salário: ");
	    	String s3 = sc.next().replace(",",".");
	    	
	    	double salario1 = Double.parseDouble(s1);
	    	double salario2 = Double.parseDouble(s2);
	    	double salario3 = Double.parseDouble(s3);
	    	    	
	        Empregado empregado1 = new Empregado(nome1, cpf1, salario1);
	        Empregado empregado2 = new Empregado(nome2, cpf2, salario2);
	        Empregado empregado3 = new Empregado(nome3, cpf3, salario3);

	        System.out.printf("\nSalário anual do empregado 1: R$ %. 2f" + empregado1.calcularSalarioAnual());
	        System.out.printf("Salário anual do empregado 2: R$ %. 2f" + empregado2.calcularSalarioAnual());
	        System.out.printf("Salário anual do empregado 3: R$ %. 2f" + empregado3.calcularSalarioAnual());

	        empregado1.aplicarAumento();
	        empregado2.aplicarAumento();
	        empregado3.aplicarAumento();
	        
	        System.out.printf("\nSalário anual do empregado 1 após aumento: R$ %. 2f" + empregado1.calcularSalarioAnual());
	        System.out.printf("Salário anual do empregado 2 após aumento: R$ %. 2f" + empregado2.calcularSalarioAnual());
	        System.out.printf("Salário anual do empregado 3 após aumento: R$ %. 2f" + empregado3.calcularSalarioAnual());
	        
	        sc.close();
	    }
}
