package br.com.generation;

import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {

		double a, b, c;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Escreva o valor de A: ");
		a = read.nextDouble();
		
		System.out.println("Escreva o valor de B: ");
		b = read.nextDouble();
		
		System.out.println("Escreva o valor de C: ");
		c = read.nextDouble();
		
		 if((a>b) && (a>c)) {
	            if(b>c) {
	                System.out.println("A ordem crescente dos números é: " + c + ", " + b + " e " + a + ".");
	            }
	            else if(c>b) {
	                System.out.println("A ordem crescente dos números é: " + b + ", " + c + " e " + a + ".");
	            }
	        }
	        else if((b>a) && (b>c)) {
	            if(a>c) {
	                System.out.println("A ordem crescente dos números é: " + c + ", " + a + " e " + b + ".");
	            }
	            else if(c>a) {
	                System.out.println("A ordem crescente dos números é: " + a + ", " + c + " e " + b + ".");
	            }
	        }
	        else if((c>a) && (c>b)) {
	            if(a>b) {
	                System.out.println("A ordem crescente dos números é: " + b + ", " + a + " e " + c + ".");
	            }
	            else if(b>a) {
	                System.out.println("A ordem crescente dos números é: " + a + ", " + b + " e " + c + ".");
	            }
	        }
		 read.close();
	   }
}

