package polimorfismo;

public class Cachorro implements Animal{

	@Override
	public void nomeAnimal() {
		System.out.println("O nome do cachorro é : Lessie");
		
	}

	@Override
	public void idadeAnimal() {
		System.out.println("Idade do cachorro : 12");
	}

	@Override
	public void somAnimal() {
		System.out.println("Som do cachorro : Au au au");
		
	}

	@Override
	public void acaoAnimal() {
		System.out.println("Ação do cachorro : Correr");
		
	}

}
