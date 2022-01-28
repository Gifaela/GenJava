/*Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes ok
(2) subtrair a primeira matriz da segunda ok
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser
lido e o resultado da adição da constante deve ser armazenado na própria matriz.
*/
package Matrizes;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		float[][] m1 = new float [2][2];
		float[][] m2 = new float [2][2];
		int op;
		float[][] m3 = new float [2][2];
		Scanner leia = new Scanner(System.in);
		
		for(int x=0; x<2; x++) {
			for(int y=0; y<2; y++) {
				System.out.print("m1[" + x + "]["+ y +"] = ");
				m1[x][y] = leia.nextFloat(); 
				System.out.print("m2[" + x + "]["+ y +"] = ");
				m2[x][y] = leia.nextFloat(); //poderia ter aberto um 3 e quarto FOR
			}
		}
		System.out.println("Menu");
		System.out.println("1-somar as duas matrizes");
		System.out.println("2-subtrair a primeira matriz da segunda");
		System.out.println("3-adicionar uma constante as duas matrizes");
		System.out.println("4-imprimir as matrizes ");
		System.out.println("Escolha uma das opções: \n");
		op=leia.nextInt();
		
		switch(op)
		{
		case 1: 
			System.out.println("Você digitou: 1-somar as duas matrizes");
			for(int x=0; x<2; x++) {
				for(int y=0; y<2; y++) {
					m3[x][y] = m1[x][y]+m2[x][y];
					System.out.println("[" + m3[x][y] + "] ");
				}
			}
			break;
		
		case 2: 
			System.out.println("Você digitou: 2-subtrair a primeira matriz da segunda");
			for(int x=0; x<2; x++) {
				for(int y=0; y<2; y++) {
					m3[x][y] = m1[x][y]-m2[x][y];
					System.out.println("[" + m3[x][y] + "] ");
				}
			}	
			break;
		
		case 3: 
			System.out.println("Você digitou: 3-adicionar uma constante as duas matrizes");
			System.out.println("Informe um valor para primeira matriz: ");
			m1[0][0] = leia.nextFloat();
			System.out.println("Informe um valor para segunda matriz: ");
			m2[0][0] = leia.nextFloat();
			
			System.out.println("Matriz");
			for(int x=0; x<2; x++) {
				for(int y=0; y<2; y++) {
					//System.out.println(m1[x][y]);
					System.out.print("[" + m1[x][y] + "]");
					}
				System.out.print("\n");
				
			}
			for(int x=0; x<2; x++) {
				for(int y=0; y<2; y++) {
					//System.out.println(m2[x][y]);
					System.out.print("[" + m2[x][y] + "]");
					}
				System.out.print("\n");
			
			}
		break;
			
		case 4: 
			System.out.println();
			for(int x=0; x<2; x++) {
				for(int y=0; y<2; y++) {
					//System.out.println(m1[x][y]);
					System.out.print("[" + m1[x][y] + "]");
					}
				System.out.print("\n");
				
			}
			for(int x=0; x<2; x++) {
				for(int y=0; y<2; y++) {
					//System.out.println(m1[x][y]);
					System.out.print("[" + m2[x][y] + "]");
					}
				System.out.print("\n");
				
			}
			break;
		
		default: 
			System.out.println("\nOpção inválida!!!");
			break;
		}
		
		
		
		

		
	}

}

