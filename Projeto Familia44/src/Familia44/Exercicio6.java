/*Construa um programa em que, tendo como dados de entrada dois pontos quaisquer no
 *  plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua 
 *  tal cálculo é
 */
package Familia44;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		double x1P,x2P,y1P,y2P,d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Qual o valor do X do P1: ");
		x1P = leia.nextDouble();
		System.out.print("Qual o valor do X do P2: ");
	 	x2P = leia.nextDouble();
		System.out.print("Qual o valor do Y do P1: ");
		y1P = leia.nextDouble();
		System.out.print("Qual o valor do Y do P1: ");
		y2P = leia.nextDouble();
		
		d = Math.sqrt(Math.pow((x2P - x1P), 2) + Math.pow((y2P - y1P),2));
		
		System.out.printf("\nO valor é %.2f ",d);
		
		
		
		leia.close();
	}
			
}
