package br.com.generation;

import java.util.Scanner;

public class IdadeReversa {

	public static void main(String[] args) {
		
		int idadeAnos, idadeMeses, idadeDias, idadeFinal;
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.print("Digite a idade em dias: ");
		idadeDias = ler.nextInt();
		
		idadeAnos = (idadeDias/365);
		idadeMeses = (idadeDias%365)/30;
		idadeFinal = (idadeDias%365)%30;
		
		System.out.println("A idade final é de: " + idadeAnos + " anos, "
		+ idadeMeses + " meses e " + idadeFinal + " dias");
		
		
	}

}
