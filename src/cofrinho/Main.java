package cofrinho;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean loop = true;
		int opcao;
		Scanner teclado = new Scanner(System.in);
		System.out.println("COFRINHO");
		Cofrinho cofre = new Cofrinho();
	
		while(loop){
			System.out.println(
								  "\n1 - Adicionar moeda \n"
								+ "2 - Remover moeda \n"
								+ "3 - Listar moedas \n"
								+ "4 - Calcular total convertido para real \n"
								+ "0 - Encerrar" );
			
			opcao = teclado.nextInt();
			
			switch(opcao) {
			case 1: //Adicionar moedas
				System.out.println("Qual moeda voce deseja adicionar? \n"
						+ "1 - Real\n"
						+ "2 - Dolar\n"
						+ "3 - Euro\n");
				opcao = teclado.nextInt();
				
				if(opcao == 1) {
					System.out.println("Qual a quantidade de reais que voce deseja adicionar?");
					cofre.adicionar(new Real(teclado.nextDouble()));
					System.out.println("Valor adicionado com sucesso!");
					break;
				}
				
				else if(opcao == 2) {
					System.out.println("Qual a quantidade de dolares que voce deseja adicionar?");
					cofre.adicionar(new Dolar(teclado.nextDouble()));
					System.out.println("Valor adicionado com sucesso!");
					break;
				}
				
				else if(opcao == 3) {
					System.out.println("Qual a quantidade de euros que voce deseja adicionar?");
					cofre.adicionar(new Euro(teclado.nextDouble()));
					System.out.println("Valor adicionado com sucesso!");
					break;
				}
				else {
					System.out.println("Valor invalido! Voltando ao menu principal...");
					break;
				}
			
			case 2: //Remover moedas
				if(!cofre.podeRemover()) {
					System.out.println("Nao tem moedas no cofre para remover");
					break;
				}
				System.out.println("Qual moeda voce deseja remover? \n"
						+ "1 - Real\n"
						+ "2 - Dolar\n"
						+ "3 - Euro\n");
				opcao = teclado.nextInt();
				
				if(opcao == 1) {
					System.out.println("Qual moeda de real que voce deseja remover?");
					cofre.removerMoeda(new Real(teclado.nextDouble()));
					System.out.println("Valor removido com sucesso!");
					break;
				}
				
				else if(opcao == 2) {
					System.out.println("Qual moeda de dolar que voce deseja remover?");
					cofre.removerMoeda(new Dolar(teclado.nextDouble()));
					System.out.println("Valor removido com sucesso!");
					break;
				}
				
				else if(opcao == 3) {
					System.out.println("Qual moeda de euros que voce deseja remover?");
					cofre.removerMoeda(new Euro(teclado.nextDouble()));
					System.out.println("Valor removido com sucesso!");
					break;
				}
				else {
					System.out.println("Valor invalido! Voltando ao menu principal...");
					break;
				}
				
				
			case 3: //Listar moedas
				System.out.println("Lista de moedas no cofrinho:");
				System.out.println("-------------------------------------------");
				cofre.listar();
				System.out.println("-------------------------------------------");
				break;
				
			case 4: //Converter moedas
				System.out.println("Total convertido:");
				System.out.printf("R$ %.2f", cofre.totalConvertido(), "\n");
				break;
			
			case 0:
				loop = false;
				break;
				
			default:
				System.out.println("Opcao invalida");
			}
		}

}
}


