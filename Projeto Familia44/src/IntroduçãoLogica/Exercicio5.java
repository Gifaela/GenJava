/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
 */
package IntroduçãoLogica;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, mediaP;
		
		
		System.out.print("Valor primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.print("Valor segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.print("Valor terceira nota: ");
		nota3 = leia.nextFloat();
		
		mediaP = ((nota1*2) + (nota2*3) + (nota3*5))/10; //
		
		System.out.print("A média ponderada é:"+mediaP);
		
		leia.close();
		
	}

}
