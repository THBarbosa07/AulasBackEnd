package fundamentos;

//import java.math.BigDecimal; (Limitar números decimais)
import javax.swing.JOptionPane; //Puxar pop up para inserir valores

public class ConversaoString_Numero {
public static void main(String[] args) {
	
	String valor1 = JOptionPane.showInputDialog(
			"Digite o primeiro número: ");
	String valor2 = JOptionPane.showInputDialog(
			"Digite o segundo número: ");
    System.out.println(valor1 + valor2); //Considerado uma concatenação
//-------------------------------------------------    
    double n1 = Double.parseDouble(valor1);
    double n2 = Double.parseDouble(valor2);
    double soma = n1 + n2;
    System.out.println("Soma é " + soma);
    System.out.println("Média é " + soma/2);
    
    //BigDecimal
	
}
}
