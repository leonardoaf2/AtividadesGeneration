package OrientacaoObjeto;

import java.util.Scanner;

public class Exercicio01a {

	//Crie uma classe cliente e apresente os atributos e m�todos referentes
	//esta classe, em seguida crie um objeto cliente, defina as instancias deste
	//objeto e apresente as informa��es deste objeto no console.
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		//criando objeto c1 --> CLIENTE
		Exercicio01b c1 = new Exercicio01b();
		
		System.out.println("Para saber se voc� tem um voucher dispon�vel, informe seus dados: \n");
		
			//solicitando dados ao usu�rio
			System.out.print("Digite o seu nome: ");
			c1.nome = read.nextLine();
			
			System.out.print("Digite o seu email: ");
			c1.email = read.nextLine();
			
			System.out.print("Digite a sua categoria (NORMAL = 1; VIP = 2): ");
			c1.categoria = read.nextInt();
			
			System.out.print("Digite o seu m�todo de pagamento (DINHEIRO = 1; CART�O = 2): ");
			c1.metodoPagamento = read.nextInt();
			
			//chamando o m�todo VOUCHER de "Exercicio01b"
			c1.voucher();
			
			read.close();

	}

}


