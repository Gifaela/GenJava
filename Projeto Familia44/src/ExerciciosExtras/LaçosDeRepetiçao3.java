/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos ok
 e apresente no final o total do somatório, ok
 a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver 
 fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.*/
package ExerciciosExtras;

import java.util.Scanner;

public class LaçosDeRepetiçao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float valorN = 0, totalS = 0, cont = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while (valorN >= 0) {
			System.out.println("Entre com um valor numérico: ");
			valorN = leia.nextFloat();
			if (valorN >= 0) {
				totalS = totalS + valorN;
				cont = cont+1;
			}		
			
		}
		System.out.println("O total da somatória é :"+totalS);
		System.out.println("A média da soma dos valores é: "+(totalS/cont));
		System.out.println("O total de valor lido é de"+cont);

	}

}
