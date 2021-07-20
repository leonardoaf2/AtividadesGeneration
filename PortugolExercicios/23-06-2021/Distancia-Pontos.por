programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
	real x1, x2, y1, y2
	real d, potenciaX, potenciaY

	escreva("Digite o valor de x1 do P1 ")
	leia(x1)
	
	escreva("Digite o valor de y1 do P1 ")
	leia(y1)

	escreva("Digite o valor de x2 do P2 ")
	leia(x2)
	
	escreva("Digite o valor de y2 do P2 ")
	leia(y2)

	potenciaX = mat.potencia((x2-y2), 2.0)
	potenciaY = mat.potencia((y2-y1), 2.0)
	d = mat.raiz((potenciaX + potenciaY), 2.0)

	escreva("A distância entre os pontos P1 e P2 é de ", d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 514; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */