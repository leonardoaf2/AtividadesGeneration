package polimorfismo;

public class Cachorro implements Animal{

	@Override
	public void nomeAnimal() {
		System.out.println("O nome do cachorro � : Lessie");
		
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
		System.out.println("A��o do cachorro : Correr");
		
	}

}
