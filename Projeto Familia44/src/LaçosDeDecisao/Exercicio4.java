package LaçosDeDecisao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		double num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		num = leia.nextDouble();
		
		if(num%2!=0)
		{
			System.out.println("O numero é Impar é potencia ao quadrado é" +Math.pow(num, 2));
			
		}
		else if (num%2==0)
		{
			System.out.println("O número é Par e sua raiz é " +Math.sqrt(num));
			
		}
		
			
	
	}
}
