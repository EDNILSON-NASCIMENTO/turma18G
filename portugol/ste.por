programa
{
	
	funcao inicio()
	{
		real nota =0.00
		real somatorio = 0.00
		real media=0.00

		para (inteiro y=1;y<=4; y++)
		{
			escreva("digite a nota "+y+" :")
			leia(nota)
			somatorio = somatorio + nota
			
			
		}
		media = somatorio / 4.00
		escreva("o total dos valores foi "+somatorio+" e a media é "+media)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 254; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */