package br.com.generation;

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int i, numero = 0;
		
		for (i=1; i<=10; i++) {
			System.out.println("\nEscreva o " + i + "� n�mero: ");
			numero = read.nextInt();
			
			if (numero%2 == 0) {
				System.out.println("O n�mero " + numero + " � par");
			}
			else {
				System.out.println("O n�mero " + numero + " � impar");
			}
		}
		System.out.println("\nLeitura finalizada......");
		read.close();
	}

}
