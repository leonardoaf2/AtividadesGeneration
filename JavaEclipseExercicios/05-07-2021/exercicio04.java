package br.com.generation;

import java.util.Scanner;

//Uma empresa desenvolveu uma pesquisa para saber as características
//psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
//era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
//(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
//agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
//pessoas, calcule e mostre:
//o número de pessoas calmas;
//o número de mulheres nervosas;
//o número de homens agressivos;
//o número de outros calmos;
//o número de pessoas nervosas com mais de 40 anos;
//o número de pessoas calmas com menos de 18 anos.

public class exercicio04 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int i = 1, idade, sexo, opcao, calmasPessoas = 0, nervosasM = 0, nervososH = 0, 
				calmosO = 0, nervosas40mais = 0, calmas18menos = 0;
		
		while (i<=150) {
			System.out.println("Digite a " + i + "ª idade: ");
			idade = read.nextInt();
			System.out.println("Digite o " + i + "º gênero: ");
			sexo = read.nextInt();
			System.out.println("Digite a " + i + "ª opção: ");
			opcao = read.nextInt();
			i++;
			
			if (opcao==1) {
				calmasPessoas++;
			}
			else if (sexo==1 && opcao==2) {
				nervosasM++;
			}
			else if (sexo==2 && opcao==3) {
				nervososH++;
			}
			else if (sexo==3 && opcao==1) {
				calmosO++;
			}
			else if (opcao==3 && idade>40) {
				nervosas40mais++;
			}
			else if (opcao==1 && idade<18) {
				calmas18menos++;
			}
		}
		System.out.println("\nO número de pessoas calmas é: " + calmasPessoas);
		System.out.println("O número de mulheres nervosas é: " + nervosasM);
		System.out.println("O número de homens nervosos é: " + nervososH);
		System.out.println("O número de 'outros' calmos é: " + calmosO);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é: " + nervosas40mais);
		System.out.println("O número de pessoas calmas com menos de 18 anos é: " + calmas18menos);
		
		read.close();
	}

}
