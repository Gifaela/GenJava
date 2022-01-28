/*- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  ok
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados
*/
package Vetores;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		int[] numeros = new int[6];
		int somaP=0, contI=0;
		Scanner leia = new Scanner(System.in);
		
		//Bloco de leitura 
		for(int x=0;x<=5;x++) {
			System.out.println("Entre com um valo: ");
			numeros[x]=leia.nextInt();
			
		}
		//Bloco de exibição
		for(int y=0; y<6; y++) {
			
			if(numeros[y]%2==0) {
				System.out.println("Os números pares são: "+numeros[y]);
				somaP = somaP + numeros[y];
			}
			else if (numeros[y]%2!=0) {
				System.out.println("Os números impares são: "+numeros[y]);
				contI++;   //contI= contI + 1
			
			}
			
		}
		
		System.out.println("As soma dos numeros pares é: "+somaP);
		System.out.println("Quantidade de Impar é: "+ contI);
		
		
		
		
	}

}
