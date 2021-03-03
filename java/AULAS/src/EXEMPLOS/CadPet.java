package EXEMPLOS;

import java.util.Scanner;

import REVISAO.Pessoa;

public class CadPet {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome; //nome da pessoa
		String porte, latido, pelo;
		
		
		System.out.println("Digite o nome: ");
		nome = leia.next();
		 	
		
		Pessoa cliente = new Pessoa(nome);
		
		cliente.setAnoNascimento(1974);
		
		System.out.println("Idade: "+cliente.idade());
		
		
		
		
		
		
		

	}

}
