package desafioConversaoMedia;
import java.util.Scanner;
import java.util.Locale; //Mudar localização do programa para formatação

public class DesafioConversao {
public static void main(String[] args) {
	Locale.setDefault(new Locale("en", "US"));
		
	Scanner entrada = new Scanner(System.in);
	System.out.println("Informe seus três últimos salários");
	System.out.print("\n\nDigite seu primeiro salário: R$ ");
	String primeiro = entrada.next().replace(",","."); //Substituir qualquer vírgula por ponto
	
	System.out.print("Digite seu segundo salário: R$ ");
	String segundo = entrada.next().replace(",",".");
	
	System.out.print("Digite seu terceiro salário: R$ ");
	String terceiro = entrada.next().replace(",",".");
	
	double s1 = Double.parseDouble(primeiro); //Converter string para double
	double s2 = Double.parseDouble(segundo);
	double s3 = Double.parseDouble(terceiro);
	
	System.out.println("\n\nA média dos seus três últimos salários é de: R$ " + (s1 + s2 + s3)/3 );
	
	entrada.close();
	
}
}
