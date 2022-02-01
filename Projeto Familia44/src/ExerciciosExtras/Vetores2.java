/*Um dado é lançado 10 vezes e o valor correspondente é anotado. 
Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. ok
A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
e apresente também quantas foram as ocorrências da maior pontuação.*/
package ExerciciosExtras;

import java.util.Scanner;

public class Vetores2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] valorD = new int [10];
		double total = 0, media = 0, maiorP = 0, cont = 0;
		
		for(int x = 0; x < 10; x++) {
			System.out.print("Entre com o valor do dado: ");
			valorD[x]=leia.nextInt();
			
			total = total + valorD[x];
			media = total/10;
			
			if (maiorP < valorD[x]) {
				maiorP = valorD[x];
				
				
				}
			if (maiorP == valorD[x]) {
				cont=cont+1;
			}
			
			
		}System.out.println("A média é: "+media+"\nA maior pontuação é:"+maiorP);
		System.out.println("\nQuantidade de vezer da maior pontuação é: "+cont);
		
	}

}
