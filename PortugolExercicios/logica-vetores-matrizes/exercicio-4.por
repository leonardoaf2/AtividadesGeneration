programa
{
	
	funcao inicio(){
		
		real matriz[3][3], soma = 0.0, somaD = 0.0
		inteiro l, c
		
		//escreva("\nDigite os valores da matriz: \n")
		para(l = 0; l <= 2; l++){

			para(c = 0; c <= 2; c++){
				escreva("Digite os valores da matriz: \n")
				leia(matriz[l][c])

				soma += matriz[l][c]
			}
		}
		para(l = 0; l <= 2; l++){

			para(c = 0; c <= 2; c++){
				se(l == c){
					somaD += matriz[l][c]
				}
			}
		}
		escreva("A soma dos valores da matriz é: ", soma)
		escreva("\nA soma dos valores da diagonal principal é: ", somaD)
	}
}

			
				

		
		
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 494; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */