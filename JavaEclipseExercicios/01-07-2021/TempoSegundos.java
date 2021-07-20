package br.com.generation;

import java.util.Scanner;

public class TempoSegundos {

	public static void main(String[] args) {
		
		int segundos, horas, minutos, segundos1;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o tempo em segundos: ");
		segundos = ler.nextInt();
		
		horas = segundos/3600;
		minutos = (segundos%3600)/60;
		segundos1 = (segundos%3600)%60;
		
		System.out.println("O tempo é de " + horas + " horas, "
		+ minutos + " minutos e " + segundos1 + " segundos");
		
		

	}

}
