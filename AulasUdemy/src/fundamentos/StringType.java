package fundamentos;

public class StringType {
public static void main(String[] args) {
	System.out.println("Olá pessoal".charAt(5)); //Pegar só o quinto caracter, a contagem começa do zero
	
	String s = "Boa noite";
	System.out.println(s.concat("~"));
	System.out.println(s + "!");
	System.out.println(s.startsWith("Boa"));
	System.out.println(s.toLowerCase().startsWith("boa"));
	System.out.println(s.endsWith("dia"));
	System.out.println(s.length());
	System.out.println(s.equals("boa noite"));
	System.out.println(s.equalsIgnoreCase("boa noite")); //Ignora letras maiúsculas ou minúsculas
}
}
