package br.com.generation;

import java.util.Scanner;
import java.lang.Math;

public class ImparPar {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		numero = read.nextInt();
		
		if (numero%2 == 0) {
			System.out.println("O n�mero " + numero + " � par.");
			System.out.println("Sua raiz quadrada �: " + Math.sqrt(numero));
		}
		else {
			System.out.println("O n�mero " + numero + " � impar.");
			System.out.println("Seu quadrado �: " + Math.pow(numero, 2.0) );
		}
		read.close();
	}
	

}
