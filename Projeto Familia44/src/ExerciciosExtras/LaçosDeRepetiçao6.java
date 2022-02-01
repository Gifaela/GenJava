/*Faça um programa que pegue um número do teclado e calcule a soma de todos os números
 de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28*/
package ExerciciosExtras;

import java.util.Scanner;

public class LaçosDeRepetiçao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dig, soma = 0, cont = 0; //contador conta quantas vezes está passando.
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		dig = leia.nextInt();
		
		do
		{
			soma = soma + cont; 
			cont++; // Contar quantas vezes pessa no laço e Amarzena no cont.
			
			
		}while(cont<=dig);
		
		System.out.println(soma);
		System.out.println(cont);

	}

}
