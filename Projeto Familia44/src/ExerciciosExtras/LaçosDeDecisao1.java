/*João, homem de bem, comprou um microcomputador para controlar o rendimento diário
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
ZERO.
 * 
 */
package ExerciciosExtras;

import java.util.Scanner;

public class LaçosDeDecisao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float P, E, M;  // renDi,maior50, multa, 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Entre com o peso do tomate: ");
		P = leia.nextFloat();
		
		if (P > 50){
			E = (P - 50);
			M = E * 4;
			System.out.print("Excesso de peso de: " +E+" \nValor da multa é de R$: "+M);
		}else if (P <= 50){
			E = 0;
			M = 0;
			System.out.println("Excesso de peso de: " +E+" \nValor da multa é de R$: "+M);
		}

			
			
		

	}

}
