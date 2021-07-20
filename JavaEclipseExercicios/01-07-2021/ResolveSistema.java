package br.com.generation;

import java.util.Scanner;

public class ResolveSistema {

	public static void main(String[] args) {

		double a, b , c , d , ee , f;
		double x,y;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		a = ler.nextInt();
		
		System.out.print("Digite o valor de B: ");
		b = ler.nextInt();
		
		System.out.print("Digite o valor de C: ");
		c = ler.nextInt();
		
		System.out.print("Digite o valor de D: ");
		d = ler.nextInt();
		
		System.out.print("Digite o valor de E: ");
		ee = ler.nextInt();
		
		System.out.print("Digite o valor de F: ");
		f = ler.nextInt();
		
		x = ((c*ee)-(b*f))/((a*ee)-(b*d));
		y= ((a*f)-(c*d))/((a*ee)-(b*d));
		
		System.out.println();
		System.out.println("O valor de X é: " + x);
		System.out.println();
		System.out.println("O valor de Y é: " + y);
	}

}
