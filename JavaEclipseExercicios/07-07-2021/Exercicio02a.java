package OrientacaoObjeto;

//Crie uma classe avi�o e apresente os atributos e m�todos referentes
//esta classe, em seguida crie um objeto avi�o, defina as instancias deste
//objeto e apresente as informa��es deste objeto no console.

import java.util.Scanner;

public class Exercicio02a {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		//criando objeto aviao
		Exercicio02b aviao = new Exercicio02b();
		
		System.out.print("Digite o modelo do avi�o (BOEING = 1 | JATO = 2): ");
		aviao.modelo = read.nextInt();
		
		System.out.print("Digite a quantidade de passageiros: ");
		aviao.quantidadePassageiro = read.nextInt();
		
		System.out.print("Digite o tempo de voo: ");
		aviao.tempoVoo = read.nextDouble();
		
		System.out.print("Digite o volume inicial de combust�vel: ");
		aviao.combustivelInicio = read.nextDouble();
		
		//chamando o m�todo "COMBUSTIVEL" de "Exercicio02b"
		aviao.combustivel();
		
		read.close();

	}

}
