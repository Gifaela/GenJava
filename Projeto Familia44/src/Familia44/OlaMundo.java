package Familia44;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double nota1,nota2,nota3,media;
	//int -> inteito
	//char -> uma letra
	//String -> cadeia
	//float -> double/real    float é menor que o double 
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nEntre com a nota1: ");
	nota1 = leia.nextFloat();
	System.out.println("\nEntre com a nota2: ");
	nota2 = leia.nextFloat();
	System.out.println("\nEntre com a nota3: ");
	nota3 = leia.nextFloat();
	
	media = (nota1+nota2+nota3)/3;
	
	System.out.println("\nMédia aritimética: "+media+" e a nota1:"+nota1);
	System.out.printf("\nMédia aritimética: %2.2f",media, "e a nota1 %2.2f",nota1); //função arredondar
	
	nota1 = Math.sqrt(nota2); //raiz quadrada 
	nota2 = Math.pow(nota3, 3); //potencia
	nota1 = nota2 % nota3; //resto da divisão 
	
	
 
	}

}
