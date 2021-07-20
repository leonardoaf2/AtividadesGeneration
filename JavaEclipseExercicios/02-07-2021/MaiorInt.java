package br.com.generation;

import java.util.Scanner;

public class MaiorInt {

	public static void main(String[] args) {
		
		int numero, i,  maior = 0;
		
		Scanner read = new Scanner(System.in);
		
		for (i=0;i<=2;i++) {
		System.out.println("Escreva um número: ");
		numero = read.nextInt();
		
		if (numero > maior) {
			maior = numero;
		}
		
		}
		System.out.println("O maior valor é: " + maior);
		read.close();
	}
}


