package fundamentos;

public class Tipos_Primitivos {
 public static void main(String[] args) {
	//Informações do funcionário
	 
	 //Tipos numéricos inteiros
	 byte anosDeEmpresa = 23;
	 short numeroDeVoos = 524;
	 int id = 42589;
	 long pontosAcumulados = 3_453_252_697L; //L para forçar a definição como um long
	 
	 //Tipos numéricos reais
	 float salario = 11_400_50F; //F para forçar a definição como um float 
	 double vendasAcumuladas = 2_345_124_523.01;
	 
	 //Tipo booleano
	 boolean estaDeFerias = false; //Ou true, java não aceita 0 e 1
	 
	 //Tipo caractere
	 char status = 'A'; //Para "ativo" como exemplo, só uma letra. Também entende unicode, ex:\u0010
	 
	 //Dias de empresa
	 System.out.println("Dias na empresa:" + anosDeEmpresa * 365);
	 
	 //Número de viagens
	 System.out.println("Número de viagens:" + numeroDeVoos /2);
	 
	 //Pontos por real
	 System.out.println("Pontos por real:" + pontosAcumulados / vendasAcumuladas);
	 System.out.println("ID: " + id + " salário -> " + salario);
	 System.out.println("Está de férias:" + estaDeFerias);
	 System.out.println("Status: " + status + " (A = Ativo I = Inativo)");
}
}
