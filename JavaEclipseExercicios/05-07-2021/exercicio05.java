package br.com.generation;

//Crie um programa que leia um n�mero do teclado at� que encontre um
//n�mero igual a zero. No final, mostre a soma dos n�meros
//digitados.

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			System.out.println("Insira um n�mero do teclado: ");
			numero = read.nextInt();
			soma+=numero;
		}
		while (numero!=0);		
		
		System.out.println("\nA soma de todos os n�meros �: " + soma);
		read.close();
	}
	
}
