package desafioTemperatura;

public class Converter_FahrenheitToCelsius {
	public static void main(String[] args) {
final double X = 32.0;
final double Y = 5.0 / 9.0;
double fahrenheit = 158; //Inserir qualquer valor
double celsius = (fahrenheit - X) * Y; //Cálculo/Resultado
 System.out.println("Está fazendo " + celsius + " ºC. lá fora!");
}
}
