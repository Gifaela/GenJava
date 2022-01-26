/* O custo ao consumidor de um carro novo é a soma do custo de fábrica com a 
 * percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
 * escrever um sistema que leia o custo de fábrica de um carro e escreva o custo 
 * ao consumidor. 
 */
package Familia44;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double custoF,custCarrN, custoImost, custoDist;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Entre com o valor do cusro de fabrica: ");
		custoF = leia.nextDouble();
		
		custoImost = (custoF/100)*45;
		custoDist = (custoF/100)*28;
		
		custoF = custoImost + custoF + custoDist;
		
		System.out.println("O valor do custo final é: "+custoF);
		
		
		
		
		
		

	}

}
