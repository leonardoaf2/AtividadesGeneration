package OrientacaoObjeto;

public class Exercicio01b {
	
	//definindo atributos para o cliente
	String nome;
	String email;
	//CATEGORIA: separada em NORMAL/VIP
	int categoria;
	//METODOS: DINHEIRO/CART�O
	int metodoPagamento;
	
	//definindo METODO "VOUCHER"
	void voucher() {
		
		//criando condi��es para distribuir vouchers de valores diferentes (quando aplic�vel)
		if (categoria == 2 && metodoPagamento == 2 ) {
			System.out.println("\nOl�, " + nome + ". Verificamos seu email " + email 
					+ " e voc� receber� um voucher de R$100,00!!!");

		}
		else if (categoria == 1 && metodoPagamento == 2) {
			System.out.println("\nOl�, " + nome + ". Verificamos seu email " + email 
					+ " e voc� receber� um voucher de R$50,00!!!");
		}
		else {
		
		System.out.println("\nOl�, " + nome + ". Verificamos seu email " + email 
				+ " e voc� n�o tem direito ao voucher... continue comprando para acumular pontos!!!");
		}
	
	}
		

}
