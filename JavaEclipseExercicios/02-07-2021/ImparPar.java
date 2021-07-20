package br.com.generation;

import java.util.Scanner;
import java.lang.Math;

public class ImparPar {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um número");
		numero = read.nextInt();
		
		if (numero%2 == 0) {
			System.out.println("O número " + numero + " é par.");
			System.out.println("Sua raiz quadrada é: " + Math.sqrt(numero));
		}
		else {
			System.out.println("O número " + numero + " é impar.");
			System.out.println("Seu quadrado é: " + Math.pow(numero, 2.0) );
		}
		read.close();
	}
	

}
