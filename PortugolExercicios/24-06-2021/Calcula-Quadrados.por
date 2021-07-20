programa
{
	
	funcao inicio(){
		
		real a, b, c, d, aa, bb, cc, dd
		
		escreva("Informe o valor de A: ")
		leia(a)
		limpa()
		escreva("Informe o valor de B: ")
		leia(b)
		limpa()
		escreva("Informe o valor de C: ")
		leia(c)
		limpa()
		escreva("Informe o valor de D: ")
		leia(d)
		limpa()
		
		aa = a * a
		bb = b * b
		cc = c * c
		dd = d * d

		se(cc >= 100.0){
			escreva("O quadrado de C é: ", cc)
		}
		senao{
			escreva("A: ", a, "; Seu quadrado é:", aa)
			escreva("\nB: ", b, "; Seu quadrado é:", bb)
			escreva("\nC: ", c, "; Seu quadrado é:", cc)
			escreva("\nD: ", d, "; Seu quadrado é:", dd)	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 582; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */