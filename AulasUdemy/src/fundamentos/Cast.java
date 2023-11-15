package fundamentos;

public class Cast {
 public static void main(String[] args) {
	double a = 1; //Conversão implícita
	System.out.println(a);
	
	float b = (float) 1.23634563777; //Conversão explicita (Cast), perde informação
	System.out.println(b);
	
	int j = 4;
	int i = 130;
	byte d = (byte) j;
	byte e = (byte) i;
	System.out.println(d);
	System.out.println(e);
	
	double n = 1.999999;
	int m = (int) n;
	System.out.println(m);
}
}
//Cast é bom evitar o máximo possível, pode gerar problemas