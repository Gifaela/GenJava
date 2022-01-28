package Vetores;

import java.util.Scanner;

public class AulaVerores {
	
	public static void main(String[] args) {
		
		int[] numeros = new int[3];//3 casas
		//
		//numeros[0] = 200; //1 casa
		//numeros[1] = 201; //2 casa
		//numeros[2] = 202; //3 casa
		//System.out.println(numeros[2]);
		
		//para
		
		Scanner leia = new Scanner(System.in);
		
		
// receber 3 numero e multiplicar por 6, depois exibir todos os resultados 		
		for(int x=0; x<=2; x++) {  //0,1,2 = 3 casas
		
			System.out.println("Digite um valor: ");
			numeros[x] = leia.nextInt();
			// muneros[x] *= 6;       ou        numeros[x] = numeros[x] * 6;
		
			
			//System.out.println("O valor de indice é: " + x + " = " + numeros[x]);
		}
		System.out.println("Resposta");
			for(int a = 0; a <= 2; a++) {
			System.out.println(numeros[a]*6);
		}
	} 

}