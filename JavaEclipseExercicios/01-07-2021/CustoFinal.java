package br.com.generation;

import java.util.Scanner;

public class CustoFinal {

	public static void main(String[] args) {

		double custoFabrica;
		double custoFinal;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o custo de fábrica do carro: ");
		custoFabrica = ler.nextInt();
		
		custoFinal = custoFabrica * 1.73;
		
		System.out.println();
		System.out.println("O custo final com juros e impostos é: " + custoFinal);
	}

}
