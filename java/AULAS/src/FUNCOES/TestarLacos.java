package FUNCOES;

import java.util.Scanner;

public class TestarLacos {

	public static void main(String[] args) {
		
		
		//para - tem numero definido de vezes
		// enquanto - testar no inicio
		//faça .... enquanto - testar no final
		
		
		/*
		cadeia nome
		caracter sexo

		escreva("Digite o nome: ")
		leia(nome)
		escreva("Digite M/F :")
		leia(sexo)
		enquanto(sexo!='M' e sexo !='F')
		{
			escreva("Voce digitou errado, tente de novo M/F:")
			leia(sexo)
		}}
		 * 
		 */
		Scanner leia = new Scanner(System.in);
		String nome;
		char genero;
		
		System.out.print("Digite o nome ");
		nome = leia.next().toUpperCase();
		System.out.print("Digite o genero M/F/O:");
		genero =  leia.next().toUpperCase().charAt(0);
		
		while(genero != 'M' && genero!= 'F' && genero != 'O') {
			System.out.println("Vc digitou errado!!! Tente de novo M/F/O: ");
			genero = leia.next().toUpperCase().charAt(0);
		}
		
		System.out.println("Fim do programa!");
		
		
		
		
		
		
		
		
		
		
		
	}

	public static void showLinha(int tamanho)
	{
		
		
		for (int x=1;x<=tamanho; x++) 
		{
			System.out.print("-");
		}
		
		
	}
	public static void pula() {
		System.out.println();
}
}
