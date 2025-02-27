package br.com.petshop;

import java.util.ArrayList;
import java.util.Scanner;

public class Petshop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Animal> animais = new ArrayList<>();
		int opcao;
		
		do {
			System.out.println("\n=== MENU ===");
			System.out.println("1 - Cadastrar Cachorro");
			System.out.println("2 - Cadastrar Gato");
			System.out.println("3 - Exibir Animais");
			System.out.println("4 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextInt();
		switch (opcao) {
		case 1:
			System.out.print("Nome do cachorro:");
			String nomecachorro = scanner.nextLine();
			System.out.print("Idade do Cachorro:");
			int idadeCachorro = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Raça do cachorro");
			String raca = scanner.nextLine();
			animais.add(new Cachorro(nomecachorro, idadeCachorro, raca));
			System.out.println("Cachorro cadastrado com sucesso!");
			break;
			
		case 2:
			System.out.println("Nome Do Gato: ");
			String nomeGato = scanner.nextLine();
			System.out.println("Idade do Gato");
			int idadeGato = scanner.nextInt();
			System.out.println("cor do pelo: ");
		    String corPelo = scanner.nextLine();
			scanner.nextLine();
			animais.add(new Gato(nomeGato, idadeGato, corPelo));
			System.out.println("Gato cadastrado com sucesso!");
			break;
			
		case 3:
			System.out.println("\nLista de Animais");
			for(Animal animal : animais) {
				animal.exibirInfo();
				
			}
			break;
		case 4:
			System.out.println("Encerrando o programa");
			break;
			default:
				System.out.println("opção inválida! tente novamente:");
			}
		} while (opcao != 4);
	}
}