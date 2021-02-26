package LISTA3;

import java.util.Scanner;


public class Tarefa4 {

	public static void main(String[] args) {
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as características
		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)
		 o número de pessoas calmas;
		 o número de mulheres nervosas;
		 o número de homens agressivos;
		 o número de outros calmos;
		 o número de pessoas nervosas com mais de 40 anos;
		 o número de pessoas calmas com menos de 18 anos.

		 * 
		 */
		//variaveis
		Scanner leia = new Scanner (System.in);
		int idade;
		char sexo; //(1-feminino / 2-masculino / 3-Outros)
		char humor; //(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva)
		char opcao = 'S';
		int contador = 1;
		int pessoaCalma=0,mulherNervosa=0,homemAgressivo=0,outrosCalmo=0,pessoaNervosaMais40=0, pessoaCalmaMenos18=0;
		
		while(contador <= 150)
		{
			//entradas
			System.out.printf("Digite a idade da pessoa %d: ",contador);
			idade = leia.nextInt();
			
			System.out.print("Digite o sexo da pessoa (1-feminino / 2-masculino / 3-Outros):");
			sexo = leia.next().charAt(0);
			
			System.out.println("A pessoa é:");
			System.out.println("1 - CALMA");
			System.out.println("2 - NERVOSA");
			System.out.print("3 - AGRESSIVA : ");
			humor = leia.next().charAt(0);
			
			if (humor =='1') {
				pessoaCalma++;
			}
			else if(humor == '2' && sexo == '1') {
				mulherNervosa++;
			}
			else if ( humor =='3'&& sexo =='2') {
				homemAgressivo++;
			}
			else if (humor == '1' && sexo =='3') {
				outrosCalmo++;
			}
			else if (humor =='2' && idade >= 40) {
				pessoaNervosaMais40++;
			}
			else if (humor == '1' && idade < 18){
				pessoaCalmaMenos18++;
			}
			
			
			
			
			//opcão para sair do programa a qualquer momento
			System.out.println("Continua S-sim ou N-não: ");
			opcao = leia.next().toUpperCase().charAt(0);
			if (opcao !='S') {
				break;
			}
			//SOMA 1 AO CONTADOR E SE BATE 150 SAE DO LAÇO
			contador++;
		}
		
		System.out.println("Pessoa calma: "+pessoaCalma);
		System.out.println("Mulher nerversosa :"+mulherNervosa);
		System.out.println("Homem agressivo: "+homemAgressivo);
		System.out.println("Outros calmo: "+outrosCalmo);
		System.out.println("Pessoas nervosa acima 40 :"+pessoaNervosaMais40);
		System.out.println("Pessoas calma abaix 18"+pessoaCalmaMenos18);
		
		System.out.println("FIM DA PESQUISA!!!");
		
	}

}
