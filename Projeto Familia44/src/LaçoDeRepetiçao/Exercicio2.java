package LaçoDeRepetiçao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, par=0, imp=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (int cont = 0; cont < 10; cont++) {
			
			System.out.print("Entre com o numero: ");
			num = leia.nextInt();
					
			if (num % 2 == 0) 
			{
			par++;
			}
			else if (num % 2 != 0)
			{
				imp++;
			}
			
		}
		System.out.print("Tem " +par+ " Pares e " +imp+ " Impares");
		

	}

}
