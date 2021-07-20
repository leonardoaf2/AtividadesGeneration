programa
{
	
	funcao inicio(){
		//Programa que recebe peso e define se há multa a
		//ser aplicada e seu respectivo valor
		real peso = 0.0, excesso, multa

		escreva("Digite o Peso: ")
		leia(peso)

		se(peso - 50 > 0){
			excesso = peso - 50
			multa = excesso * 4.00
			escreva("Excesso de peso: ", excesso, "\nVocê será multado em R$", multa)
		}
		senao{
			excesso = 0.0
			multa = 0.0
			escreva("Excesso: ", excesso, "\nMulta: ", multa)
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 434; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */