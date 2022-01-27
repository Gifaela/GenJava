package LaçoDeRepetiçao;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		
		int idade = 0, menor21 = 0, maior50 =0; 
		
		Scanner leia = new Scanner(System.in);
		
		while(idade!=-99){
			System.out.print("Entre com a idade: ");
			idade = leia.nextInt();
			
			if(idade < 21 && idade !=-99){
				menor21++;
				
			}if(idade > 50)
				maior50++;
			}
		System.out.print("O total de Menor de 21 = " +menor21+
				"\nO total de Maiores de 55 = "+maior50);
	}

}
