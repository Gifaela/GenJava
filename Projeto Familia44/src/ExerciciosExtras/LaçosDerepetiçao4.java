/*Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  (imprimindo o novo valor) 
 até que ele seja maior do que 100. Ex.: se o usuário digita 5,  deveremos observar na tela a seguinte 
 sequência: 5 15 45 135.*/
package ExerciciosExtras;

import java.util.Scanner;

public class LaçosDerepetiçao4 {

	public static void main(String[] args) {
		
		double num = 0 ;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número:");	
		num = leia.nextDouble();
		while (num <= 100) {
			num = num *3;
			System.out.println(num);		
		}
		
	}
}
