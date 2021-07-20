package br.com.generation;

//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99.

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
Scanner read = new Scanner(System.in);
		
		int i = 1, numero = 0, menor = 0, maior = 0;
		
		System.out.println("O programa encerra-se ao digitar -99\n");
		
		while (numero != -99) {
			System.out.println("Escreva a idade da " + i + "ª pessoa: ");
			numero = read.nextInt();
			i++;
			
			if (numero<=21 && numero!=-99) {
				menor++;
			}
			else if (numero>=50) {
				maior++;
			}	
		}
		System.out.println("Total de pessoas com menos de 21 anos: " + menor);
		System.out.println("\nTotal de pessoas com mais de 50 anos: " + maior);
		read.close();

	}

}
