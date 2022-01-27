/*5-	Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
 * No final, mostre a soma dos números digitados.(DO...WHILE)
 */
package LaçoDeRepetiçao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, somaN=0;
		
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.println("Entra com um número:");
			num = leia.nextInt();
			somaN += num;
		} while(num !=0);
			System.out.println("A soma dos números é de: "+somaN);
			
		
		

	}

}
