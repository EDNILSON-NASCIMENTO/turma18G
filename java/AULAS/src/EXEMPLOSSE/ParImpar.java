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
		System.out.println(( (valorDigitado%2) == 0) ? "O NUMERO � PAR!!!":"O NUMERO � IMPAR!!!");
	
		/*
		
		if (valorDigitado%2 == 0) 
		{
			System.out.println("O n�mero "+valorDigitado+" � par!!!");
			
		} 
		else 
		{
			System.out.printf("\nO n�mero %d � impar",valorDigitado);
		}
		
		*/
		
		// %d - numero inteiro - tipo int
		// %s - tipo String - cadeia de caracteres
		// %f - tipo real - tipo double -- %.2f fazendo com duas casas
		
		// && - e || ou e != diferente ou n�o
		
		
		
		
		
		
	}
	
}
