package br.com.generation;

//Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
//final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
//0(zero).

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {

Scanner read = new Scanner(System.in);
		
		int numero,	cont = 0, div = 0;
		int media = 0;
		
		
		do {
			System.out.println("Insira um n�mero do teclado: ");
			numero = read.nextInt();
			
			if (numero%3==0 && numero!=0) {
				div+=numero;
				cont++;
			}
		}	
		while (numero!=0);
		
		media = div / cont;

		System.out.println("\nA m�dia dos m�ltiplos de 3 �: " + media);
		read.close();
	
	
	}	
}
