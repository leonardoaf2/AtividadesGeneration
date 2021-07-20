package br.com.generation;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares.

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int i, numero = 0;
		
		for (i=1; i<=10; i++) {
			System.out.println("\nEscreva o " + i + "º número: ");
			numero = read.nextInt();
			
			if (numero%2 == 0) {
				System.out.println("O número " + numero + " é par");
			}
			else {
				System.out.println("O número " + numero + " é impar");
			}
		}
		System.out.println("\nLeitura finalizada......");
		read.close();
	}

}
