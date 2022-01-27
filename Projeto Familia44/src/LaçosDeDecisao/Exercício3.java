package LaçosDeDecisao;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int idade = 0;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Qual a idade? ");
	idade = leia.nextInt();
	
	if(idade >= 10 && idade <= 14)
	{
		System.out.println("Infantil");
	} 
	
	else if (idade >=15 && idade <= 17)
	{
		System.err.println("Juvenil");
	}
	else if(idade >= 18 && idade <= 25)
	{
		System.out.println("Adulto");
	}
	}

}
