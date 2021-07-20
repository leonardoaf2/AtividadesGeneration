package br.com.generation;

import java.util.Scanner;
import java.lang.Math;

public class DistanciaPontos {

	public static void main(String[] args) {
		
		//double x1, x2, y1, y2;
		double d, potenciaX, potenciaY;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor de x1 do P1:  ");
		double x1 = ler.nextDouble();
		
		System.out.print("Digite o valor de y1 do P1:  ");
		double y1 = ler.nextDouble();
		
		System.out.print("Digite o valor de x2 do P2:  ");
		double x2 = ler.nextDouble();
		
		System.out.print("Digite o valor de y2 do P2:  ");
		double y2 = ler.nextDouble();
		
		potenciaX = Math.pow((x2-y2), 2.0);
		potenciaY = Math.pow((y2-y1), 2.0);
		d = Math.sqrt(potenciaX+potenciaY);
		
		System.out.println("A distância entre os pontos P1 e P2 é de: " + d);
		
		
		
	}

}
