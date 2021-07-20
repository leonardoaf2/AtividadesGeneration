programa
{
	
	funcao inicio()
	{
		real nota1, nota2
		real media

		escreva("Digite a Nota 1: ")
		leia(nota1)

		escreva("Digite a Nota 2: ")
		leia(nota2)

		media = (nota1 + nota2) / 2
		limpa()

		escreva("Média final: ", media)	

		se(media >= 7){
			escreva("\nAprovado")
		}
		senao se(media >= 3.0 e media < 6.0){
			escreva("\nRecuperação")
		}
		senao{
			escreva("\nReprovado")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 213; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */