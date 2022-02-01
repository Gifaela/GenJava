/*Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três e que se 
encontram no conjunto dos números de 1 até 500.*/
package ExerciciosExtras;

public class LaçosDeRepetiçao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,somaI = 0;
		
		for (num = 1; num <= 500; num++) {
			if (num%3==0) { // Muliplo de 3
				somaI = somaI + num;
			}
		}System.out.println(somaI);

	}

}

