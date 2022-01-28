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
		int op, constante;
		float[][] m3 = new float [2][2];
		Scanner leia = new Scanner(System.in);
		
		for(int x=0; x<2; x++) {
			for(int y=0; y<2; y++) {
				System.out.print("Entre com o M1: "); //System.out.print("m1[" + x + "]["+ y +"] = "); 
				m1[x][y] = leia.nextFloat(); 
				System.out.print("Entre com o M2: "); //System.out.print("m2[" + x + "]["+ y +"] = "); 
				m2[x][y] = leia.nextFloat(); //poderia ter aberto um 3 e quarto FOR
			}
		}
		do
		{
		System.out.println("Menu de opções");
		System.out.println("1-Somar as duas matrizes");
		System.out.println("2-Subtrair a primeira matriz da segunda");
		System.out.println("3-Sdicionar uma constante as duas matrizes");
		System.out.println("4-Imprimir as matrizes ");
		System.out.println("Escolha uma das opções: \n");
		op=leia.nextInt();
		
		switch(op)
		{
		case 1: 
			System.out.println("Você digitou: 1-somar as duas matrizes");
			for(int x=0; x<2; x++) {
				for(int y=0; y<2; y++) {
					m3[x][y] = m1[x][y]+m2[x][y];
					System.out.println("A soma é: [" + m3[x][y] + "] ");
				}
			}
			break;
		
		case 2: 
			System.out.println("Você digitou: 2-subtrair a primeira matriz da segunda");
			for(int x=0; x<2; x++) {
				for(int y=0; y<2; y++) {
					m3[x][y] = m1[x][y]-m2[x][y];
					System.out.println("A subtração é[" + m3[x][y] + "] ");
				}
			}	
			break;
		
		case 3: 
			System.out.println("Você digitou: 3-adicionar uma constante as duas matrizes");
			System.out.println("Entre com o valor da constante: ");
			constante = leia.nextInt();
						
			System.out.println("Matriz");
			for(int x=0; x<2; x++) {
				for(int y=0; y<2; y++) {
					m1[x][y] =  m1[x][y] + constante;
					m2[x][y] =  m2[x][y] + constante;
					
					System.out.println("\nM1 mais a constante: "+m1[x][y]);
					System.out.println("\nM2 mais a constante: "+m2[x][y]);
					
					
				}
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
					//System.out.println(m2[x][y]);
					System.out.print("[" + m2[x][y] + "]");
					}
				System.out.print("\n");
				
			}
			break;
		
		default: 
			if(op!=0)
			{
				System.out.println("\nOpção inválida!!!");
			}
			else
			{
				System.out.println("\nMuito obrigado por utilizar o nosso sistema!!");
			}
			
		}
		
		}while(op!=0);
		
	}
}	
