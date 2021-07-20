programa
{

	funcao inicio()
{

		inteiro n1[2][3], n2[2][3], l , c  
			 
		inteiro m1[2][3], m2[2][3]	

		para(l = 0; l <= 1; l++){

			para(c = 0; c <= 2; c++){
				escreva("Digite os valores da matriz N1: \n")
				leia(n1[l][c])
				escreva("Digite os valores da matriz N2: \n")
				leia(n2[l][c])

				m1[l][c] = n1[l][c] + n2[l][c]
				m2[l][c] = n1[l][c] + n2[l][c]
			}	
		}
		
		para(l = 0; l <= 1; l++){

			para(c = 0; c <= 2; c++){
				escreva("\nA matriz M1 é: ", m1[l][c])
				escreva("\nA matriz M2 é: ", m2[l][c])
			}
		}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */