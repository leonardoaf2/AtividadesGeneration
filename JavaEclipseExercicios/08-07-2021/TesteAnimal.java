package heranca_polimorfismo;

//import heranca_polimorfismo.Cachorro;
//import heranca_polimorfismo.Cavalo;
//import heranca_polimorfismo.Preguica;

public class TesteAnimal {
	
	public static void main(String args[])
	{
		Cachorro cachorro = new Cachorro("Paulo", 22, "AuAuAuAu");
		Cavalo cavalo = new Cavalo("Newton", 15, "Iiiihhhhhh");
		Preguica preguica = new Preguica("Paulinha", 21, "ZzzzzZZzzzZ");
	
	System.out.printf("O cachorro %s tem %d anos e faz %s", cachorro.getNome(), cachorro.getIdade(), cachorro.getSom());
	System.out.printf("\nO cavalo %s tem %d anos e faz %s", cavalo.getNome(), cavalo.getIdade(), cavalo.getSom());
	System.out.printf("\nA pregui�a %s tem %d anos e faz %s", preguica.getNome(), preguica.getIdade(), preguica.getSom());
	}
	

}
