package br.com.generation;

//Crie um programa que leia um número do teclado até que encontre um
//número igual a zero. No final, mostre a soma dos números
//digitados.

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			System.out.println("Insira um número do teclado: ");
			numero = read.nextInt();
			soma+=numero;
		}
		while (numero!=0);		
		
		System.out.println("\nA soma de todos os números é: " + soma);
		read.close();
	}
	
}
