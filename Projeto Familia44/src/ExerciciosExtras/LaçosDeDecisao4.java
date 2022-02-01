/*Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.
*/
package ExerciciosExtras;

import java.util.Scanner;

public class LaçosDeDecisao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		num = leia.nextInt();
		
		if (num%2==0) {
		 System.out.println("O número é Par");
		}else {
			System.out.println("O número é Impar");
		}
	}

}
