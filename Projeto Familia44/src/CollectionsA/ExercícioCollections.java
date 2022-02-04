/*xCrie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com 
Collection do tipo List do Java para manipular os dados desse estoque, o programa deverá 
atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/



package CollectionsA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercícioCollections {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		List <String> estoque = new ArrayList();
		
		int op;
		do
		{
			System.out.println("1 - Entre com um produto");
			System.out.println("2 - Retire um produto");
			System.out.println("3 - Atualize o estoque");
			System.out.println("4 - Apresente o estoque");
			System.out.println("0 - Deseja enserrar o programa");
			
			op = leia.nextInt();
			
			switch (op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar no estoque: ");
				String produto1 = leia.nextLine(); // verificase o usuárioentroucomumconteúdo do tipoString
				estoque.add(produto1);//adiciono o produtoparadentro do 
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para removelo do estoque: ");
				String produto2 = leia.nextLine();
					if (estoque.contains(produto2)) //x.contains ->verifica a lista 
					{
						estoque.remove(produto2);
					}else
						{
							System.out.println("\nProduto inexistente");
						}				
				break;
				
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar");
				String verifique = leia.nextLine();
				System.out.println("\nDigite o produto que entrará no lugar do "+verifique);
				String novoProduto = leia.nextLine();
				
					if(estoque.contains(verifique))
					{
						estoque.remove(verifique);
						estoque.add(novoProduto);
					} else
						{
						System.out.println("\nProduto inexistente");
						}
					System.out.println(estoque);
				break;
			case 4: 
				leia.nextLine();
				System.out.println(estoque);
				break;
			
			default:
				if(op==0) {
					System.out.println("nMuito obrigado por utilizar o nosso sistema...");
				}else
				{
					System.out.println("nOpção inexistente, por favor digite a opção correta...");
				}
				
				
			}
			
		}while (op!=0);
		
	}

}
