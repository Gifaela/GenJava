package LaçosDeDecisao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Entre com o Primeiro número: ");
		n1 = leia.nextInt();
		System.out.print("Entre com o Segundo número: ");
		n2 = leia.nextInt();
		System.out.print("Entre com o Terceiro número: ");
		n3 = leia.nextInt();
		
		 if(n1<=n2 && n2<=n3) {
	            System.out.println("A ordem crescente é: "+n1+", "+n2+", "+n3);
	        }else if(n1 <= n3 && n3 <= n2){
	            System.out.println("A ordem crescente é: "+n1+", "+n3+", "+n2);
	        }else if(n2 <= n1 && n1 <= n3){
	            System.out.println("A ordem crescente é: "+n2+", "+n1+", "+n3);
	        }else if(n2 <= n3 && n3 <= n1){
	            System.out.println("A ordem crescente é: "+n2+", "+n3+", "+n1);
	        }else if(n3 <= n2 && n2 <= n1){
	            System.out.println("A ordem crescente é: "+n3+", "+n2+", "+n1);
	        }else if(n3 <= n1 && n1 <= n2){
	            System.out.println("A ordem crescente é: "+n3+", "+n1+", "+n2);
			
	        }

	}

}
