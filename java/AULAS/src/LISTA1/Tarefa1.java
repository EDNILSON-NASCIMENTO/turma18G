package LISTA1;

import java.util.Scanner;

public class Tarefa1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int anosIdade;  //camelCase
		int mesesIdade;
		int diasIdade;
		int diasTotais;
		
		System.out.print("Por favor informe os anos da pessoa:");
		anosIdade = leia.nextInt();
		System.out.print("Por favor informe os meses da pessoa:");
		mesesIdade = leia.nextInt();
		System.out.print("Por favor informe os dias da pessoa:");
		diasIdade =leia.nextInt();
		//processamento
		diasTotais = (anosIdade*365)+(mesesIdade*30)+diasIdade;
		//saida
		System.out.printf("O resultado em dias é : %d",diasTotais);
	}
	

}
