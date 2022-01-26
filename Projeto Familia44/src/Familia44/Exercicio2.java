/*Faça um sistema que leia a idade de uma pessoa expressa em dias e 
 * mostre-a expressa em anos, meses e dias. 
 */
package Familia44;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int dias, meses, anos, diasT;
	
	Scanner leia = new Scanner(System.in);
	
	
	System.out.println("Quantos dias você tem? ");
	diasT = leia.nextInt();
	
	anos = diasT /365;
	meses = (diasT % 365)/30;
	dias = (diasT % 365) % 30;
	
	System.out.println("Você tem "+anos+ " anos, \n"+meses+" meses \n"+dias+" dias");
	
	leia.close();

	}

}
