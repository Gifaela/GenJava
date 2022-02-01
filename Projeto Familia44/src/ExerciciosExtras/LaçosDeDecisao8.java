/*Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
for maior que 100, caso contrário imprimi-la com o valor zero.*/
package ExerciciosExtras;

import java.util.Scanner;

public class LaçosDeDecisao8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float N;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		N = leia.nextFloat();
		
		if(N > 100) {
			System.out.println(N);
		}else {
			N = 0;
			System.out.println(N);
		}

	}

}
