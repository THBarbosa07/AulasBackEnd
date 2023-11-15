package fundamentos;

public class NotacaoPonto {
 public static void main(String[] args) {
	String s = "Bom dia X";
	s = s.toUpperCase();
	s = s.replace("X", "senhora"); //Precisa estar em cima para tomar o efeito do Uppercase (Ler de cima para baixo)
	s = s.concat(", como posso ajudar? ");
	System.out.println(s);
	
	String a = "Thiago".toUpperCase();
	System.out.println(a);
	
	String b = "Boa tarde X".replace("X","Luana").toUpperCase().concat(" <3");
	System.out.println(b);
}
}
//Note: Tipos primitivos não podem ser usados nesse método