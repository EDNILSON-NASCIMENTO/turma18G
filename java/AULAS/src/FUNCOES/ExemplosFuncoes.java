package FUNCOES;

import java.util.Locale;
import java.util.Scanner;

public class ExemplosFuncoes {
	
	// aqui - fora da função inicio - principal
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);  // instaciar - tipo de layout define o padrão de tela/teclado americano
		Scanner leia = new Scanner(System.in); //instanciar
		
		int numero;
		String nome;
		char genero; 
		String tratamento = "";//M - F - O 
		int tamanho;
		
		
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next().toUpperCase();
		System.out.println("Vc se define M-masculino, F-Feminino ou O-outrx: ");
		genero = leia.next().toUpperCase().charAt(0);
		
		System.out.println("Digite o tamanho da linha:");
		tamanho = leia.nextInt();
		
		showLinha(tamanho);
		pula();
		
		System.out.println("Digite um numero inteiro positivo: ");
		numero = leia.nextInt();
		parImpar(numero);
		
		System.out.printf("A raiz quadrada do numero é %.2f",raiz(numero));
		pula();
		// Sr - masculino, Sra Feminino - Srx - Outros
		tratamento = tipo(genero);
		System.out.printf("Bom dia %s %s, este é um teste de retorno\n", tratamento, nome);		
	
		
				

	}
	
	public static double raiz(double numero) {
		
		return Math.sqrt(numero);
	}
	
	public static String tipo(char genero) {
		
		String vocativo=""; //
		
		if (genero == 'M')
		{
			vocativo = "Sr";
		}
		else if (genero =='F')
		{
			vocativo = "Sra";
		} 
		else if (genero =='O')
		{
			vocativo ="Srx";
		} 
		else
		{
			vocativo = "N/D";
		}
		
		return vocativo;
	}
	
	public static void pula() {
			System.out.println();
	}
	
	public static void parImpar(int numero) {
		
		if ( (numero%2) ==0 ) 
		{
			System.out.printf("O numero %d é par!!!",numero);
			pula();
		} 
		else
		{
			System.out.printf("O numero %d é impar!!!",numero);
			pula();
		}
		System.out.printf("E a raiz quadrada do numero é %.2f", raiz(numero));
		pula();
		
	}
	
	public static void showLinha(int tamanho)
	{
		
		
		for (int x=1;x<=tamanho; x++) 
		{
			System.out.print("-");
		}
		
		
	}
	
 
	

}
