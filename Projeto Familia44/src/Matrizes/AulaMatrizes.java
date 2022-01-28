package Matrizes;

import java.util.Scanner;

public class AulaMatrizes {

	public static void main(String[] args) {
		                       //L /C -> linha e coluna
		int [][]matriz = new int[3][2];
		
		//matriz [0][0]=20;
		//matriz [0][1]=23;
		//matriz [1][0]=67;
		//matriz [1][1]=90;
		//matriz [2][0]=98;
		//matriz [2][1]=98;
		
		Scanner leia = new Scanner(System.in);
		
		
		for(int x = 0; x < 3; x++) { // //salvando os valores 	digitados na minha matriz
			
			for(int y = 0; y < 2; y++){//L/C
				System.out.println("Entre com o valor: ");
				matriz[x][y] = leia.nextInt();
				//matriz[x][y] = matriz[x][y]*2;  
						System.out.println(matriz[x][y]*2);
				
				
			}
		}
	
	}	
}
