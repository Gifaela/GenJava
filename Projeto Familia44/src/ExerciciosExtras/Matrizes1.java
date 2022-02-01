/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma 
posição das matrizes N1 e N2.*/

package ExerciciosExtras;

import java.util.Scanner;

public class Matrizes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[][] n1 = new float [4][6];
		float[][] n2 = new float [4][6];
		float[][] m1 = new float [4][6];
		float[][] m2 = new float [4][6];
		
		Scanner leia = new Scanner(System.in);
		
		for(int l = 0; l < 4; l++) { //Linha n1
			for(int c = 0; c < 6; c++) { //coluna n1
				System.out.println("Entre com os números do N1: ");
				n1[l][c] = leia.nextFloat();
				
			} 
		}
		for(int l = 0; l < 4; l++) { //Linha n2
			for(int c = 0; c < 6; c++) { //coluna n2
		System.out.println("Entre com os números do N2: ");
		n2[l][c] = leia.nextFloat();
			}
		}
		for(int l = 0; l < 4; l++) { //Linha m1
			for(int c = 0; c < 6; c++) { //coluna m1
				m1[l][c] = n1[l][c] + n2[l][c];
			}
		}
		for(int l = 0; l < 4; l++) { //Linha m2
			for(int c = 0; c < 6; c++) { //coluna m2
				m2[l][c] = n1[l][c] - n2[l][c];
				System.out.println("M1: "+m1[l][c]);
				System.out.println("M2: "+m2[l][c]);
			}
		}
	}

}
