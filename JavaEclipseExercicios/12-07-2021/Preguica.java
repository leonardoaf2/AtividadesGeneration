package polimorfismo;

public class Preguica implements Animal{

	@Override
	public void nomeAnimal() {
		System.out.println("\nNome do preguica : Mafalda");
		
	}

	@Override
	public void idadeAnimal() {
		System.out.println("Idade da preguica : 13");
		
	}

	@Override
	public void somAnimal() {
		System.out.println("Som da preguiça : ZzzZZZZzz");
		
	}

	@Override
	public void acaoAnimal() {
		System.out.println("Ação da preguiça : Dormir");
		
	}

}