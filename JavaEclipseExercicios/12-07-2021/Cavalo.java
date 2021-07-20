package polimorfismo;

public class Cavalo implements Animal{

	@Override
	public void nomeAnimal() {
		System.out.println("\nNome do cavalo : Atlas");
		
	}

	@Override
	public void idadeAnimal() {
		System.out.println("Idade do cavalo : 12");
		
	}

	@Override
	public void somAnimal() {
		System.out.println("Som do cavalo : Pocotó pocotó");
		
	}

	@Override
	public void acaoAnimal() {
		System.out.println("Ação do cavalo : Correr");
		
	}

}
