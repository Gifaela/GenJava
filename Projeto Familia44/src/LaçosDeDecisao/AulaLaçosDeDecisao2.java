package La�osDeDecisao;

import java.util.Scanner;

public class AulaLa�osDeDecisao2 {
	public static void main(String[] args) {
		
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n\t\tMenu de op��es carinhosas");
		System.out.println("\n1-N�o desista dos seus sonhos...");
		System.out.println("\n2-Voc� � capaz...");
		System.out.println("\n3-Seja perseverante...");
		System.out.println("\n4-Seus sonhos s�o poss�veis...");
		System.out.println("\n5-Persista, resista e n�o desista...");
		System.out.println("\nDigite a sua op��o: ");
		op = ler.nextInt();
		
		switch(op)
		{
		case 1:
			System.out.println("\n1-N�o desista dos seus sonhos...");
			break;
		case 2:
			System.out.println("\n2-Voc� � capaz...");
			break;
		case 3:
			System.out.println("\n3-Seja perseverante...");
			break;
		case 4:
			System.out.println("\n4-Seus sonhos s�o poss�veis...");
			break;
		case 5:
			System.out.println("\n5-Persista, resista e n�o desista...");
			break;
		default:
				System.out.println("\nOp��o inv�lida!!!");
		}

	}
}