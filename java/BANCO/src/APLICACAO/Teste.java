package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;
import CLASSES.ContaEspecial;

public class Teste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); // teste de programador
		
		
		System.out.println("Digite o numero da conta: ");
		int numero = leia.nextInt();
		System.out.println("Digite o cpf da conta: ");
		String cpf = leia.next();
		System.out.println("Digite 1-conta ativa ou 2-conta inativa:");
		char tipo = leia.next().charAt(0);
		boolean ativa;
		if (tipo == '1')
		{
			ativa = true;
		} else 
		{
			ativa = false;
		}
		System.out.println("CONTA NORMAL OU ESPECIAL N/E:");
		char contaTipo = leia.next().toUpperCase().charAt(0);
		
		Conta cliEspecial1 = new Conta(numero, cpf, ativa);
		
		
		System.out.println("Digite o valor:");
		double valor = leia.nextDouble();
		System.out.println("Debito ou Credito? D/C:");
		char opcao = leia.next().toUpperCase().charAt(0);
		if (opcao =='D')
		{
			cliEspecial1.debito(valor);
		}
		else if (opcao =='C') {
			
			cliEspecial1.credito(valor);
		} else
		{
			System.out.println("Opção invalida!!!");
		}
		System.out.println("Saldo atual: "+cliEspecial1.getSaldo());
		
		
		
		
		
		
		
		
		

	}

}
