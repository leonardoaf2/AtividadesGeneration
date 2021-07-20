programa
{
	
	funcao inicio(){

	real valorDigitado, media = 0.0, soma = 0.0 
	inteiro cont = 0 

	escreva("Digite um valor para a soma: ")
	leia(valorDigitado)

	enquanto(valorDigitado > 0){
		soma += valorDigitado
		cont += 1
		
		escreva("\nDigite um valor para a soma: ")
		leia(valorDigitado)
		limpa()
		}
	
	media = soma / cont 
	
	escreva("Soma dos números: ", soma)
	escreva("\nMédia dos números: ", media)
	escreva("\nTotal de números inseridos: ", cont)
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 232; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */