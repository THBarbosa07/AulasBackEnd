package fundamentos;

public class OperadoresLogicos {
public static void main(String[] args) {
	boolean condicaoUm = true;
	boolean condicaoDois = false;
	
	System.out.println(condicaoUm && condicaoDois);
	System.out.println(condicaoUm && !condicaoDois);
	System.out.println(condicaoUm || condicaoDois);
	System.out.println(condicaoUm ^ condicaoDois);
	System.out.println(!!condicaoUm);
	System.out.println(!condicaoDois);
	
	System.out.println("\nTabela verdade E (AND)");
	System.out.println(true && true);
	System.out.println(true && false);
	//System.out.println(false && true);
	//System.out.println(false && false);
	
	System.out.println("\nTabela verdade OU (OR)");
	//System.out.println(true || true);
	//System.out.println(true || false);
	System.out.println(false || true);
	System.out.println(false || false);
	

	System.out.println("\nTabela verdade OU Exclusivo (XOR)");
	System.out.println(true ^ true);
	System.out.println(true ^ false);
	System.out.println(false ^ true);
	System.out.println(false ^ false);
	
	System.out.println("\nTabela verdade NOT ");
	System.out.println(!true);
	System.out.println(!false);
	
}
}
