package fundamentos;

public class ConversaoNumero_String {
 public static void main(String[] args) {
	Integer num1 = 10000; //Class wrapper que envolve tipos primitivos
	System.out.println(num1.toString().length()); //Convertendo int para string e pedindo o tamanho dessa string
    
	int num2 = 1000;                                     //Chamar o Integer dentro da função, sem precisar da
	System.out.println(Integer.toString(num2).length()); // variável previamente definida como Integer
	
	System.out.println(("" + num1).length()); //Outro método funcional
	System.out.println(("" + num2).length()); //Porém menos usado
	
 }
}
