programa
{
	
	funcao inicio()
	{
		inteiro segundos, horas, minutos, segundos1

		escreva("Digite o tempo em segundos: ")
		leia(segundos)

		horas = segundos/3600
		minutos = (segundos%3600)/60
		segundos1 = (segundos%3600)%60

		escreva("O tempo é de ", horas, " horas, ", minutos, " minutos e ", segundos1, " segundos ")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 335; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */