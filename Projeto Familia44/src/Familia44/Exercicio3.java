/*Faça um sistema que leia o tempo de duração de um evento em uma 
fábrica expressa em segundos e mostre-o expresso em horas, minutos 
e segundos. */ 

package Familia44;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int segT, horas, min, seg;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Entre com a duração em esgundos: ");
	segT = leia.nextInt();
	
	horas = (segT / 3600);
	min = (segT % 3600) / 60;
	seg = (segT % 3600) % 60;
	
	System.out.println("A festa teve duração de \n"+horas+" horas\n"+min+" minutors\n"+seg+" segundos");
	
	leia.close();
	
			

	}

}
