programa
{
	
	funcao inicio()
	{
		inteiro idadeAnos, idadeMeses, idadeDias, idadeDias1
		escreva("Digite os dias: ")
		leia(idadeDias)

		idadeAnos = (idadeDias/365)
		idadeMeses = (idadeDias%365)/30
		idadeDias1 = (idadeDias%365)%30

		escreva("A idade é de ", idadeAnos, " anos, ", idadeMeses, " meses e ", idadeDias1, " dias ")

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 284; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */