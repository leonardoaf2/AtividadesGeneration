package polimorfismo;

public class TestaAnimal {

	public static void main(String[] args) {

		Cachorro meuCachorro = new Cachorro();
		Cavalo meuCavalo = new Cavalo();
		Preguica meuPreguica = new Preguica();
		
		meuCachorro.nomeAnimal();
		meuCachorro.idadeAnimal();
		meuCachorro.somAnimal();
		meuCachorro.acaoAnimal();
		
		meuCavalo.nomeAnimal();
		meuCavalo.idadeAnimal();
		meuCavalo.somAnimal();
		meuCavalo.acaoAnimal();
		
		
		meuPreguica.nomeAnimal();
		meuPreguica.idadeAnimal();
		meuPreguica.somAnimal();
		meuPreguica.acaoAnimal();
		
	}

}
