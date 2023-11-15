package fundamentos;

//import java.util.Scanner;

public class Wrapper {
 public static void main(String[] args) {
	 
	 //Scanner entrada = new Scanner(System.in);
	//byte
	 Byte b = 100;
	 Short s = 1000;
	 Integer i = 10000; //int
			     //Integer.parseInt(entrada.next()); 
	 Long l = 100000L;
	 
	 System.out.println(b.byteValue());
	 System.out.println(s.toString());
	 System.out.println(i * 5);
	 System.out.println(l / 2);
	//entrada.close();
}
}
