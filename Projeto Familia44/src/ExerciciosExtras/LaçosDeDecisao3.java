/*Desenvolva um sistema em que:
Leia 4 (quatro) números;ok
Calcule o quadrado de cada um;ok
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;ok
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
 * 
 */
package ExerciciosExtras;

import java.util.Scanner;

public class LaçosDeDecisao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1, n2, n3, n4, q1, q2, q3, q4;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a N1: ");
		n1 = leia.nextDouble();
		System.out.println("Entre com a N2: ");
		n2 = leia.nextDouble();
		System.out.println("Entre com a N3: ");
		n3 = leia.nextDouble();
		System.out.println("Entre com a N4: ");
		n4 = leia.nextDouble();
		
		q1 = Math.pow(n1, 2);
		q2 = Math.pow(n2, 2);
		q3 = Math.pow(n3, 2);
		q4 = Math.pow(n4, 2);
		
		if (q3 >= 1000) {
			System.out.println("O valor resultante do quadrado do terceiro é de: "+q3);
		}else {
			System.out.println("Valor entrado: "+n1+". Valor ao quadrado: "+q1);
			System.out.println("Valor entrado: "+n2+". Valor ao quadrado: "+q2);
			System.out.println("Valor entrado: "+n3+". Valor ao quadrado: "+q3);
			System.out.println("Valor entrado: "+n4+". Valor ao quadrado: "+q4);
		}
		

		

		

	}

}
