package br.com.generation;

//Escreva um programa que l� duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o
//das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de mesma
//posi��o das matrizes N1 e N2.

import java.util.Scanner;

public class ExercicioMatriz01 {

	public static void main(String[] args) {
		
		//criando matrizes a sertem preenchidas pelo usu�rio
		Scanner read = new Scanner(System.in);
		double[][] n1 = new double[4][6];
		double[][] n2 = new double[4][6];
		double[][] m1 = new double[4][6];
		double[][] m2 = new double[4][6];
		
		//solicitando valores ao usu�rio
		for(int l = 0; l < n1.length; l++) {
			for(int c = 0; c < n1[l].length; c++) {
				System.out.printf("Insira os valores da Matriz N1: [%d][%d]", l,c);
				n1[l][c] = read.nextDouble();
				System.out.printf("Insira os valores da Matriz N2: [%d][%d]", l,c);
				n2[l][c] = read.nextDouble();
				
				//calculando matrizes m1 e m2
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];

			}
			System.out.println("");
		}
		//printando matriz M1
		System.out.print("===Matriz M1====\n");

		for(int l = 0; l < n1.length ; l++) {
			for(int c = 0; c < n1[l].length; c++) {
				System.out.print(m1[l][c]+ " | ");	
			}
			System.out.print("\n");

		}
		//printando matriz M2
		System.out.print("\n===Matriz M2====\n");

		for(int l = 0; l < n2.length ; l++) {
			for(int c = 0; c < n2[l].length; c++) {
				System.out.print(m2[l][c]+ " | ");	
			}
			System.out.println("");
		}
		read.close();
	}
}