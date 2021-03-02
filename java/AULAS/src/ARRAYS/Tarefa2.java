package ARRAYS;

import java.util.Random;
import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		/*
		 * dado - 1 e 6
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado. 
		 * Faça um programa que gere um vetor com os lançamentos, escreva 
		 * esse vetor. A seguir determine e imprima a média aritmética dos
		 *  lançamentos, contabilize e apresente também quantas foram as 
		 *  ocorrências da maior pontuação.
		 */
		Scanner leia = new Scanner(System.in); 
		int lancamentos[]= new int[10];
		double mediaAritmetica=0.00;
		double somaValores = 0.00;
		int maiorPontuacao = 0;
		int contadorMaiorPontuacao = 0;
		Random numeroDado = new Random(); //instanciar - chamar - criar
		
		
		
		for (int x=0; x<lancamentos.length; x++) {
			System.out.printf("Digite o %dº resultado do lancamento :",(x+1));
			//lancamentos[x]=leia.nextInt();
			//lancamentos[x] = (int) (Math.random()*6)+1; //interface
			lancamentos[x] = numeroDado.nextInt(6)+1;
			
		}
		
		for (int x=0; x<lancamentos.length; x++) {
			System.out.printf("O valor do lancamento %d é %d \n", (x+1), lancamentos[x]);
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
		System.out.printf("A média é %.2f \n",mediaAritmetica);
		System.out.printf("O maior valor é %d \n", maiorPontuacao);
		System.out.printf("O maior valor aparece %d vez(es)\n",contadorMaiorPontuacao );
	}

}
