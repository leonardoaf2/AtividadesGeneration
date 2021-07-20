programa
{
	
	funcao inicio()
	{

		inteiro idadeAnos, idadeMeses, idadeDias, idadeFinal
		
		escreva("Digite os anos: ")
		leia(idadeAnos)
		escreva("Digite os meses: ")
		leia(idadeMeses)
		escreva("Digite os dias: ")
		leia(idadeDias)

		idadeFinal = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias

		escreva("A idade em dias é: ", idadeFinal)
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 246; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */