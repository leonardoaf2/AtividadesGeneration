package br.com.generation;

//Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
//que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
//imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
//quantas foram as ocorr�ncias da maior pontua��o.

import java.util.Scanner;

public class ExercicioVetor02 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int[] arrayVetor = new int[4];
		int i, maior = 0, maiorOcorrencia = 1, soma = 0;
		double media = 0.0;
		
		for (i = 0; i < arrayVetor.length; i++) {
			System.out.print("Digite o " + (i+1) + "� lan�amento: ");
			arrayVetor[i] = read.nextInt();
			soma += arrayVetor[i];
			media = soma/arrayVetor.length;
			
			if (arrayVetor[i] > maior ) {
				maior = arrayVetor[i];
			}
			else if (arrayVetor[i] == maior) {
				maiorOcorrencia++;
			}
		}
		System.out.println("\nA m�dia dos lan�amentos � :" + media);
		System.out.println("O maior valor apareceu " + maiorOcorrencia + " vezes");
		read.close();
	}	

}
