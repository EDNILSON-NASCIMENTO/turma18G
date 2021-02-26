package FUNCOES;

import java.util.Scanner;

public class TesteSenha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int senha =123;
		String nome; //String é uma classe
		char opcao;

		
		do
		{
			System.out.println("Digite o seu nome: ");
			nome = leia.next().toUpperCase();
			System.out.println("Digite a senha");
			senha = leia.nextInt();
			System.out.println("Continua 1- sim ou 2- não: ");
			opcao = leia.next().charAt(0);
								
		} while (opcao == '1');
		System.out.println("fim do programa");
		
		
		

	}

}
