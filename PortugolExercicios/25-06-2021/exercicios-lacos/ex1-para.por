programa
{
	
	funcao inicio(){

	real salario, somaSalario = 0.0, filhos, somaFilhos = 0.0
	real mediaFilhos = 0.0, maiorSalario = 0.0, ate100 = 0.0
	inteiro cont

	para(cont = 1; cont <= 2; cont++){
		escreva("Digite o salario: ")
		leia(salario) 
		somaSalario = somaSalario + salario 

		se(salario <= 100){
			ate100 = ate100 + 1 
		}
		se(salario > maiorSalario){   
			maiorSalario = salario
		}
	
		escreva("Digite o numero de filhos: ")
		leia(filhos)
		somaFilhos = somaFilhos + filhos 
	}
		
		mediaFilhos = somaFilhos / 20

		limpa()
		escreva("Média de filhos: ", mediaFilhos)
		escreva("\nMédia do salario: ", somaSalario / 20)
		escreva("\nMaior salário: R$ ", maiorSalario)
		escreva("\nPercentual até R$ 100: ", (ate100 / 20) * 100, "%")
		
	}

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 765; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */