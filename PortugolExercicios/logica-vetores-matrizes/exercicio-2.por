programa
{
	
	funcao inicio()
{
		
		real lancamentos[10], soma = 0.0, media = 0.0, maiorValor = 0.0
		inteiro i, cont = 1

		escreva("Digite os lançamentos: \n")
		para(i = 0; i <= 9; i++){
			leia(lancamentos[i])

			soma += lancamentos[i]
			media = soma / 10

			se(maiorValor < lancamentos[i]){
				maiorValor = lancamentos[i]
			}
			senao se(maiorValor == lancamentos[i]){
				cont++
			}	
		}
		escreva("A média aritmética dos lançamentos é: ", media)
		escreva("\nA maior pontuação obtida foi: ", maiorValor)
		escreva("\nA maior pontuação ocorreu ", cont, " vezes. ")
		}		
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 556; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */