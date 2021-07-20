package br.com.generation;

//Informar todos os números de 1000 a 1999 que quando divididos por 11
//obtemos resto = 5.

public class exercicio01 {

	public static void main(String[] args) {

		int i, n = 11;
		
		for (i=1000; i<=1999; i++) {
			if (i%n==5) {
				System.out.println(i + " atende às especificações");
			}
		}
	}

}
