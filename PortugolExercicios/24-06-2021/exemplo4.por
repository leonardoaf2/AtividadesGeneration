programa
{
	
	funcao inicio(){
		
		real numero1, numero2, resultado = 0.0
		caracter operacao
		
		escreva("Digite o 1º número: ")
		leia(numero1)
		
		escreva("Digite o o operador aritmético: ")
		leia(operacao)
		
		escreva("Digite o 2º número: ")
		leia(numero2)
		
		escolha(operacao){
			caso '+':
			resultado = numero1 + numero2
			escreva("Resultado: ", resultado)
			
			caso '-':
			resultado = numero1 - numero2
			escreva("Resultado: ", resultado)

			caso '*':
			resultado = numero1 * numero2
			escreva("Resultado: ", resultado)
			
			caso '/':
			resultado = numero1 / numero2
			escreva("Resultado: ", resultado)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 154; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */