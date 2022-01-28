/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */
package Matrizes;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz = new int [3][3];
		int cont=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (int x = 0; x < 3; x++) { //linhas
			for (int y = 0; y < 3; y++) { //colunas
				System.out.print("Entre com o valor: ");
				matriz[x][y]=leia.nextInt();
				
				if(matriz[x][y] > 10) {
					cont++;
				}
				
			}
		}
		System.out.print("Possui"  + cont + "valores maiores que 10");
		leia.close();
		

	}

}
