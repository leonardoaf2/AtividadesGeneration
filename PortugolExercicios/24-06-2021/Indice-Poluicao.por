programa
{
	
	funcao inicio(){
		
		real indice
		
		escreva("Informe o índice: ")
		leia(indice)
		limpa()

		se(indice >= 0.3 e indice < 0.4){
			escreva("O Grupo 1 deve suspender suas atividades ")
		}
		senao se(indice >= 0.4 e indice < 0.5){
			escreva("Os Grupos 1 e 2 devem suspender suas atividades ")
		}
		senao se(indice >= 0.5){
			escreva("Todos os Grupos devem suspender suas atividades ")
		}
		senao{
			escreva("O índice de poluição é aceitável")	
		}
	}
	
}	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 112; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */