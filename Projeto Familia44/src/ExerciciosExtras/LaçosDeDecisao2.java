/*Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.
*/
package ExerciciosExtras;

import java.util.Scanner;

public class LaçosDeDecisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numH, sal, exc, salExc, salT;
		String cod;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Entre com nome do funcionário: ");	
		cod = leia.next();
		System.out.print("Entre com o número de horas trabalhadas: ");
		numH = leia.nextInt();
		
		if (numH > 0 && numH <= 50 ) {
			exc = 0;
			sal = numH * 10;
			System.out.print("Seu salário é de R$: "+sal);
		}else if (numH > 50) {
			exc = numH - 50;
			sal = 50*10;
			salExc = exc*20;
			salT = sal + salExc;
			System.out.print("Horas excedente é de "+exc);
			System.out.print("\nSalário é de R$:"+sal);
			System.out.print("\nSalário com excedente R$:"+salT);
			
		}else if (numH <= 0) {
			System.out.println("Você não trabalhou");
		}
		

	}

}
