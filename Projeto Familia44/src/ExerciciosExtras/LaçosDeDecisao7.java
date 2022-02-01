/*Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.*/

package ExerciciosExtras;

import java.util.Scanner;

public class LaçosDeDecisao7 {
	public static void main(String[] args) {
		
		float b,a,aT;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a base: ");
		b = leia.nextFloat();
		System.out.println("Entre com a altura: ");
		a = leia.nextFloat();
		
		if (b > 0 && a > 0) {
			aT = (b*a)/2;
			System.out.println("Valido! A área do triângulo é: "+aT);
		}else {
			System.out.println("Número informado Invalido!");
		}
	}

}
