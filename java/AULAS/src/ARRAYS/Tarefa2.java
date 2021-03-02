package ARRAYS;

import java.util.Random;
import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		/*
		 * dado - 1 e 6
		 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
		 * Fa�a um programa que gere um vetor com os lan�amentos, escreva 
		 * esse vetor. A seguir determine e imprima a m�dia aritm�tica dos
		 *  lan�amentos, contabilize e apresente tamb�m quantas foram as 
		 *  ocorr�ncias da maior pontua��o.
		 */
		Scanner leia = new Scanner(System.in); 
		int lancamentos[]= new int[10];
		double mediaAritmetica=0.00;
		double somaValores = 0.00;
		int maiorPontuacao = 0;
		int contadorMaiorPontuacao = 0;
		Random numeroDado = new Random(); //instanciar - chamar - criar
		
		
		
		for (int x=0; x<lancamentos.length; x++) {
			System.out.printf("Digite o %d� resultado do lancamento :",(x+1));
			//lancamentos[x]=leia.nextInt();
			//lancamentos[x] = (int) (Math.random()*6)+1; //interface
			lancamentos[x] = numeroDado.nextInt(6)+1;
			
		}
		
		for (int x=0; x<lancamentos.length; x++) {
			System.out.printf("O valor do lancamento %d � %d \n", (x+1), lancamentos[x]);
			somaValores = somaValores+lancamentos[x];
			//maiorPontuacao = 0
			// lancamentos[x] = 3
			if (lancamentos[x] >= maiorPontuacao) {
				
				if (lancamentos[x] > maiorPontuacao ) {
					contadorMaiorPontuacao = 0;
				}
				maiorPontuacao = lancamentos[x]; 
				contadorMaiorPontuacao++;
			}
		}
		//processamentos
		mediaAritmetica = somaValores / lancamentos.length;
		
		//saidas
		System.out.printf("Total dos lancamentos digitados: %.0f \n", somaValores);
		System.out.printf("A m�dia � %.2f \n",mediaAritmetica);
		System.out.printf("O maior valor � %d \n", maiorPontuacao);
		System.out.printf("O maior valor aparece %d vez(es)\n",contadorMaiorPontuacao );
	}

}
