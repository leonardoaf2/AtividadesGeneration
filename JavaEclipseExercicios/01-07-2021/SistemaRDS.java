package br.com.generation;

import java.util.Scanner;
import java.lang.Math;

public class SistemaRDS {
	
	public static void main(String[] args) {
	
	double a,b,c;
	double r,s;
	double d;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.print("Digite o valor de A: ");
	a = ler.nextInt();
	
	System.out.print("Digite o valor de B: ");
	b = ler.nextInt();
	
	System.out.print("Digite o valor de C: ");
	c= ler.nextInt();
	
	r = Math.pow((a+b), 2.0);
	s = Math.pow((b+c), 2.0);
	d = (r+s)/2;
	
	System.out.println("Com base nos valores de A, B e C, R = " + r);
	
	
	}
}
