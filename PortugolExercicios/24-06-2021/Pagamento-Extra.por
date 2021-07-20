programa
{
	
	funcao inicio(){
		//Programa que lê código do funcionário e horas 
		//trabalhadas para calcular salário
		real codigo, horas 
		real horasExtra, pagamentoExtra, salario
		
		escreva("Informe o código do funcionário: ")
		leia(codigo)
		 
		escreva("Informe as horas trabalhadas: ")
		leia(horas)

		se(horas <= 50){
			salario = horas * 10.0	
		}
		senao{
			salario = 500.0
		}
		horasExtra = horas - 50

		se(horasExtra > 0){
		 	pagamentoExtra = horasExtra * 20.0
		 	escreva("Salário total: ", (pagamentoExtra + salario), "\nSalário excedente: ", pagamentoExtra)
		}
		senao{
		 	pagamentoExtra = 0.0
		 	escreva("Salário total: ", (pagamentoExtra + salario), "\nSalário excedente: ", pagamentoExtra)	
		}
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 395; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */