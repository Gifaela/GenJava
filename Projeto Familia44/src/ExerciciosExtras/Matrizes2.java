/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira 
diagonal, ou seja, diagonal principal.*/
package ExerciciosExtras;

import java.util.Scanner;

public class Matrizes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float [][] valores = new float [3][3];
		float somaT = 0, somaD = 0;
		
		Scanner leia = new Scanner(System.in);
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				System.out.println("Entre com o valor");
				valores[l][c] = leia.nextFloat();
				somaT = somaT + valores[l][c];
				
				if (l==c) {
					somaD = somaD + valores[l][c];
				}
				
			}
		}
		System.out.println("Soma Total é: "+somaT);
		System.out.println("Soma Diagonal é: "+somaD);

	}

}
