package br.com.generation;

import java.util.Scanner;

public class CategoriaIdade {

	public static void main(String[] args) {

		int idade;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = read.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Sua categoria é: INFANTIL");
			
		} else if (idade >= 15 && idade <= 17) {
				System.out.println("Sua categoria é: JUVENIL");
		
		} else if (idade >= 18 && idade <= 25) {
				System.out.println("Sua categoria é: ADULTO");
		} else {
			System.out.println("Sua idade está fora das categorias!");
		}
		read.close();
		
	}

}
