package br.com.generation;

import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3;
		double media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a Nota 1: ");
		nota1 = ler.nextDouble();
		
		System.out.print("Digite a Nota 2: ");
		nota2 = ler.nextDouble();
		
		System.out.print("Digite a Nota 3: ");
		nota3 = ler.nextDouble();
		
		media = ((nota1*2)+(nota2*3)+(nota3*5))/10;
		
		System.out.println("A média final do alune é: " + media);

	}

}
