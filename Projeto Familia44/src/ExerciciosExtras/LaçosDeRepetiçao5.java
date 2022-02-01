/*Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando de 3 em 3 quando estiver entre 300 
e 400 e de 5 em 5 quando não estiver.*/
package ExerciciosExtras;

import java.util.Scanner;

public class LaçosDeRepetiçao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 233;
		
		Scanner leia = new Scanner(System.in);
		do
		{
			System.out.println(n);
			 if (n >= 300 && n <= 400) {
				 n = n + 3;
			 }else {
				 n = n+5;
			 }
		} while( n <=456);
		
		
		


	}

}
