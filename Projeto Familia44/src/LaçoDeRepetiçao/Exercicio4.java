/*Uma empresa desenvolveu uma pesquisa para saber as características 
 * psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas 
 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era 
 * agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
 *  pessoas, calcule e mostre: (WHILE)
•	o número de pessoas calmas; V
•	o número de mulheres nervosas; 
•	o número de homens agressivos; 
•	o número de outros calmos;
•	o número de pessoas nervosas com mais de 40 anos; 
•	o número de pessoas calmas com menos de 18 anos
*/
package LaçoDeRepetiçao;

import java.util.Scanner;

public class Exercicio4 {

	   public static void main(String[] args) {

	        int idade, sexo, opc, totalCalm=0, mulherNerv=0, homemAgro=0; 
	        int outroCalm=0, nerv40=0, calm18=0, totalPe=0;

	        Scanner leia = new Scanner(System.in);

	        while(totalPe<5) {
	            System.out.println("Informe a sua idade:");
	            idade = leia.nextInt();
	            System.out.println("Informe o seu sexo(1-feminino / 2-masculino / 3-Outros):");
	            sexo = leia.nextInt();
	            System.out.println("Informe a opção (1-calma; 2-nervosa e 3-agressiva):");
	            opc = leia.nextInt();

	            if(opc == 1) {
	                totalCalm++;
	                if (sexo == 3) {
	                    outroCalm++;
	                }
	                if (idade < 18) {
	                    calm18++;
	                }
	            }

	            if(opc == 2) {
	                if(sexo == 1) {
	                    mulherNerv++;
	                }
	                if(idade > 40) {
	                    nerv40++;
	                }
	            }

	            if(sexo == 2 && opc ==3) {
	                homemAgro++;
	            }
	            totalPe++;
	        }

	        System.out.println("O número de pessoas calmas é de: "+totalCalm);
	        System.out.println("O número de mulheres nervosas é de: "+mulherNerv);
	        System.out.println("O número de homens agressivos é de: "+homemAgro);
	        System.out.println("O número de outros calmos é de: "+totalCalm);
	        System.out.println("O número de pessoas nervosas com mais de 40 anos é de: "+totalCalm);
	        System.out.println("O número de pessoas calmas com menos de 18 anos é de: "+totalCalm);

	    }

	}
