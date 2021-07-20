programa
{
	//Programa que lê o salario/código e define se haverá aumento
	funcao inicio(){
		
		real salario
		real aumento
		real codigo
		
		escreva("Qual o salário atual? ")
		leia(salario)
		
		escreva("Qual o respectivo código? ")
		leia(codigo)
		
		limpa()

		se(codigo == 1){
			aumento = salario * 1.05
			escreva("Você recebeu um aumento! Seu novo salário é de R$", aumento)
		}
		senao se(codigo == 2){
			aumento = salario * 1.075
			escreva("Você recebeu um aumento! Seu novo salário é de R$", aumento)
		}
		senao se(codigo == 3){
			aumento = salario * 1.1
			escreva("Você recebeu um aumento! Seu novo salário é de R$", aumento)
		}
		senao{
			escreva("Seu salário é de R$", salario)
		}

		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 49; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */