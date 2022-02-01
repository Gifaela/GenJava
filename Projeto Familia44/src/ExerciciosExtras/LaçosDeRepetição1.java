/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e
 número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00

*/

package ExerciciosExtras;

import java.util.Scanner;

public class LaçosDeRepetição1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hab, numF;
		double sal, mediaS = 0, mediaF = 0, maiorS = 0, totalM100 = 0, percM100 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for (hab = 0; hab < 20; hab++) {
			System.out.println("Entre com Sálario: ");
			sal = leia.nextDouble();
			System.out.println("Entre com a quantidade de filhos: ");
			numF = leia.nextInt();
			
			mediaS = (sal + sal)/20;
			mediaF = (numF + numF)/20;
			
			if(maiorS < sal) {
				maiorS = sal;
			}
			
			if(sal > 100) {
				totalM100 = totalM100 + 1;
				percM100 = (totalM100*100)/20;
				
			}
			
			
			
		}
		System.out.println("Média de sálario: "+mediaS);
		System.out.println("Média de filhos: "+mediaF);
		System.out.println("O maior salário é: "+maiorS);
		System.out.println("Total de pessoas com sálario maior que R$: 100 é de: "+totalM100);
		System.out.println("Porcwntage de pessoas com sálario maior que R$: 100 é de: "+percM100);
		
		

	}

}
