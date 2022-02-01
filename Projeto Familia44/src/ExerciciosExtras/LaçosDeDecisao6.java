/*Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
*/
package ExerciciosExtras;

import java.util.Scanner;

public class LaçosDeDecisao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com a idade: ");
		i = leia.nextInt();
		
		if (i >= 5 && i <=7) {
			System.out.println("Infantil A");			
		} else if (i >= 8 && i <= 11) {
			System.out.println("Infantil B");
		} else if (i >= 12 && i <= 13) {
			System.out.println("Juvenil A");
		} else if (i >= 14 && i <= 17) {
			System.out.println("Juvenil B");
		}else if (i >= 18) {
			System.out.println("Adulto");
		}else {
			System.out.println("Idade insuficiente!");
		}
	}

}
