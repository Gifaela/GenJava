package ProjetoG2;

import java.util.Scanner;

public class codigos {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		// VÁRIAVEIS
		
		String nome, sexo;
		int idade, op = 0, opA = 0, opQ = 0;
		double altura, peso, imc = 0, tmb = 0;
		
		// FIM VARIÁVEIS
		
		System.out.println("\t\tSelecione uma opção");
		System.out.println("1 - Inserir novos dados");
		System.out.println("2 - Já tenho cadastro");
		op = leia.nextInt();
		
		// INÍCIO DO SWITCH
		
		switch (op) {
		
		case 1: // CADASTRO/NOVOS DADOS
		
		System.out.println("Olá! Insira seus dados abaixo.");

		System.out.println("\nNome:");
		nome = leia.next();
		System.out.println("\nIdade:");
		idade = leia.nextInt();
		System.out.println("\nSexo (F ou M):");
		sexo = leia.next();
		System.out.println("\nAltura em cm:");
		altura = leia.nextDouble();
		System.out.println("\nPeso:");
		peso = leia.nextDouble();
		
		imc = peso / (altura*altura);
		
	
		if (sexo.equals("M")) {
			tmb = 66.5 + (13.75 * peso) + (5.003 * altura) - (6.755 * idade);
		}
		else if (sexo.equals("F")) {
			tmb = 655.1 + (9.563 * peso) + (1.850 * altura) - (4.676 * idade);
		}
		// FIM DO CADASTRO
		case 2: 
			
			// OPÇÕES PÓS CADASTRO
			
			System.out.println("\n\n\t\tSelecione uma opção");
			System.out.println("1 - Iniciar um novo dia");
			System.out.println("2 - Adicionar consumo");
			System.out.println("3 - Adicionar gastos");
			System.out.println("4 - Resumo diário");
			System.out.println("5 - Histórico");
			System.out.println("6 - Opções");
			op = leia.nextInt();
			
			if(op == 1) { // INICIAR NOVO DIA (a fazer arrays)
				
				System.out.println("\n\nIniciando um novo dia!");
				
				// ESPAÇO
				// PARA
				// CODAR
				
			}
			
			if(op == 2) { // ADICIONAR CONSUMO
	
				System.out.println("\n\n\t\tOpções de alimento");
					System.out.println("1 - Arroz");
					System.out.println("2 - Feijão");
					System.out.println("3 - Pão");
					System.out.println("4 - Macarrão");
					System.out.println("5 - Carne");
					System.out.println("\n6 - Voltar");
					opA = leia.nextInt();
			
					
					if(opA == 1) { // PARA ARROZ
						System.out.println("\n\t\tEscolha a quantidade de arroz:");
						System.out.println("1 - Escumadeira");
						System.out.println("2 - Concha");
						System.out.println("3 - Unidade");
						opQ = leia.nextInt(); 
						
						double arrozE, arrozC, arrozU; // VÁRIAVEIS QNT. ARROZ
						
						if(opQ == 1) { // PARA ARROZ
							System.out.println("\nQuantas escumadeiras foram consumidas?");
							arrozE = leia.nextDouble(); }
						
							else if(opQ == 2) {
							System.out.println("\nQuantas conchas foram consumidas?");
							arrozC = leia.nextDouble(); }
						
							else if(opQ == 3) {
							System.out.println("\nQuantas unidades foram consumidas?");
							arrozU = leia.nextDouble();
						}
					}	
				}
					
					double feijaoE, feijaoC, feijaoU; // VÁRIAVEIS DA QTD. FEIJÃO
					
					if(opA == 2) { // PARA FEIJÃO
						System.out.println("\n\t\tEscolha a quantidade de feijão:");
						System.out.println("1 - Escumadeira");
						System.out.println("2 - Concha");
						System.out.println("3 - Unidade"); 
						opQ = leia.nextInt();
								
						if(opQ == 1) {
							System.out.println("\nQuantas escumadeiras foram consumidas?");
							feijaoE = leia.nextDouble(); }
						
							else if(opQ == 2) {
							System.out.println("\nQuantas conchas foram consumidas?");
							feijaoC = leia.nextDouble(); }
						
							else if(opQ == 3) {
							System.out.println("\nQuantas unidades foram consumidas?");
							feijaoU = leia.nextDouble(); }
						}
					
					double paoE, paoC, paoU; // VÁRIAVEIS DA QTD. PÃO
					
					if(opA == 3) { // PARA PÃO
						System.out.println("\n\t\tEscolha a quantidade de pão:");
						System.out.println("1 - Escumadeira");
						System.out.println("2 - Concha");
						System.out.println("3 - Unidade"); 
						opQ = leia.nextInt();
								
						if(opQ == 1) {
							System.out.println("\nQuantas escumadeiras foram consumidas?");
							paoE = leia.nextDouble(); }
						
							else if(opQ == 2) {
							System.out.println("\nQuantas conchas foram consumidas?");
							paoC = leia.nextDouble(); }
						
							else if(opQ == 3) {
							System.out.println("\nQuantas unidades foram consumidas?");
							paoU = leia.nextDouble(); }
						}
					
					
					double macarraoE, macarraoC, macarraoU; // VÁRIAVEIS DA QTD. MACARRÃO
					
					if(opA == 4) { // PARA MACARRÃO
						System.out.println("\n\t\tEscolha a quantidade de macarrão:");
						System.out.println("1 - Escumadeira");
						System.out.println("2 - Concha");
						System.out.println("3 - Unidade"); 
						opQ = leia.nextInt();
								
						if(opQ == 1) {
							System.out.println("\nQuantas escumadeiras foram consumidas?");
							macarraoE = leia.nextDouble(); }
						
							else if(opQ == 2) {
							System.out.println("\nQuantas conchas foram consumidas?");
							macarraoC = leia.nextDouble(); }
						
							else if(opQ == 3) {
							System.out.println("\nQuantas unidades foram consumidas?");
							macarraoU = leia.nextDouble(); }
						}
					
					double carneE, carneC, carneU; // VÁRIAVEIS DA QTD. CARNE
					
					if(opA == 5) { // PARA PÃO
						System.out.println("\n\t\tEscolha a quantidade de carne:");
						System.out.println("1 - Escumadeira");
						System.out.println("2 - Concha");
						System.out.println("3 - Unidade"); 
						opQ = leia.nextInt();
								
						if(opQ == 1) {
							System.out.println("\nQuantas escumadeiras foram consumidas?");
							carneE = leia.nextDouble(); }
						
							else if(opQ == 2) {
							System.out.println("\nQuantas conchas foram consumidas?");
							carneC = leia.nextDouble(); }
						
							else if(opQ == 3) {
							System.out.println("\nQuantas unidades foram consumidas?");
							carneU = leia.nextDouble(); }
						}
					}
	}
}
