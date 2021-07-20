programa
{
	
	funcao inicio(){
	//Programa que lê um número e diz se é par ou impar
		inteiro numero, divisao

		escreva("Digite um número inteiro: ")
		leia(numero)
		limpa()

		divisao = numero % 2

		se(divisao == 0){
			escreva("O número ", numero, " é par")
		}
		senao{
			escreva("O número ", numero, " é impar")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 180; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */