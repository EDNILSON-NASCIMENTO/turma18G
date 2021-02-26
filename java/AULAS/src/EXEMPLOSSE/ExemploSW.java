package EXEMPLOSSE;

import java.util.Scanner;

public class ExemploSW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner leia = new Scanner(System.in);
			int numeroMes;
			System.out.println("Digite o numero do mês[1-12]: ");
			numeroMes = leia.nextInt();
			/*
			if (numeroMes == 1) {
				System.out.println("JANEIRO");
				
			}
			else if (numeroMes == 2) {
				System.out.println("FEVEREIRO");
			}
			*/
			switch (numeroMes)
			{
				case 1:
				{
					System.out.println("JANEIRO");
				}
				break;
				case 2:
				{
					System.out.println("FEVEREIRO");
				}
				break;
				
			}
				
			
			
			
	}

}
