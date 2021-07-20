programa
{
	
	funcao inicio(){
		
		real pontuacao = 0.0, maiorValor = 0.0

		real vetor[5]

		inteiro i 
		
		escreva("Digite as 5 pontuações: \n")
		para(i = 0; i <= 4; i++){
			leia(vetor[i])
		
			se(maiorValor < vetor[i]){
				maiorValor = vetor[i]
			}
		}
		escreva("O maior valor digitado é: ", maiorValor)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 253; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */