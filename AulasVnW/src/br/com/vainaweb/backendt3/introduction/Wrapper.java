package br.com.vainaweb.backendt3.introduction;

public class Wrapper {
public static void main(String[] args) {
	//Interger e demais wrapper classes funcionam como uma classe, com métodos exclusivos como .toString, .compareTo(copareTome), varName.concat(name)
	
	Integer numUm=10;
	Integer numDois=10;
	
	int numUmP=10;
	int numDoisP=12;
	
	System.out.println(numUm.compareTo(numDois));
	
	if (numUmP==numDoisP) {
		System.err.println(0);
	}else if (numUmP > numDoisP) {
		System.out.println(1);
	}else {
		System.out.println(-1);
	}
}
}
