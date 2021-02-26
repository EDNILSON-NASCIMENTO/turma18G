package EXEMPLOSSE;

import java.util.Scanner;

public class ParImpar //PascalCase
{
	public static void main(String[] args) 
	{
	
		Scanner ler = new Scanner(System.in);
		int valorDigitado=0;  //camelCase
		
	
		
		
		System.out.println("Digite um valor inteiro positivo: ");
		valorDigitado = ler.nextInt();
		System.out.println(( (valorDigitado%2) == 0) ? "O NUMERO É PAR!!!":"O NUMERO É IMPAR!!!");
	
		/*
		
		if (valorDigitado%2 == 0) 
		{
			System.out.println("O número "+valorDigitado+" é par!!!");
			
		} 
		else 
		{
			System.out.printf("\nO número %d é impar",valorDigitado);
		}
		
		*/
		
		// %d - numero inteiro - tipo int
		// %s - tipo String - cadeia de caracteres
		// %f - tipo real - tipo double -- %.2f fazendo com duas casas
		
		// && - e || ou e != diferente ou não
		
		
		
		
		
		
	}
	
}
