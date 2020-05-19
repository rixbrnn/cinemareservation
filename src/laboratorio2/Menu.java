package laboratorio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	static Scanner scan = new Scanner(System.in);

	private static void printMenu() {
		System.out.println(
				"\n___MENU___\n1 - Mostrar Mapa\n2 - Assentos Livres\n3 - Reservar\n4 - Cancelar Reserva\n0 - Finalizar");
	}

	public static void main(String[] args) {
		// testes q eu tava fazendo
//		Mapa mapa = new Mapa();
//		Opcoes opcoes = new Opcoes();
//		System.out.println(mapa);
//		opcoes.reservar(mapa.getMapa(), 0, 0);
//		System.out.println(mapa);

		Mapa mapa = new Mapa();
		Opcoes opcoes = new Opcoes();

// 		TESTES DE CONVERSÃO
//		opcoes.converteCharInt('A');
//		opcoes.converteCharInt('B');
//		opcoes.converteCharInt('C');
//		opcoes.converteCharInt('D');
//		opcoes.converteCharInt('E');
//		opcoes.converteCharInt('F');
//		opcoes.converteCharInt('G');
//		opcoes.converteCharInt('H');
//		opcoes.converteCharInt('I');
//		opcoes.converteCharInt('J');
//		opcoes.converteCharInt('K');
//		opcoes.converteCharInt('L');
//		opcoes.converteCharInt('a');
//		opcoes.converteCharInt('b');
//		opcoes.converteCharInt('c');
//		opcoes.converteCharInt('d');
//		opcoes.converteCharInt('e');
//		opcoes.converteCharInt('f');
//		opcoes.converteCharInt('g');
//		opcoes.converteCharInt('h');
//		opcoes.converteCharInt('i');
//		opcoes.converteCharInt('j');
//		opcoes.converteCharInt('k');
//		opcoes.converteCharInt('l');

		int menu = 1;

		while (menu != 0) {

			printMenu();

			boolean passou = false;
			try {
				menu = scan.nextInt();
				passou = true;
			} catch (InputMismatchException e) {
				System.out.println("\nErro!" + e);
				scan.nextLine();
			}

			if (passou) {
				switch (menu) {

				case 1:

					opcoes.mostraMapa(mapa);
					break;

				case 2:

					System.out.println("\n" + opcoes.quantidades(mapa.getMapa()) + "\n");
					break;

				case 3:

					try {
						System.out.print("Informe a Linha desejada (A até L): ");
						char linha = scan.next().charAt(0);
						System.out.print("Informe a Coluna desejada (1 até 14): ");
						int coluna = scan.nextInt();
						String funcao = "reservar";
						
						if(opcoes.funcaoReservaCancela(mapa.getMapa(), linha, coluna, funcao)) {
							//System.out.println("Concluído com sucesso!");
						}else{
							//System.out.println("Não foi possível concluir!");
						};
						// opcoes.reservar(mapa.getMapa(), linha, coluna);
					} catch (InputMismatchException e) {
						System.out.println("\nErro!" + e);
						scan.nextLine();
					}

					break;

				case 4:

					try {
						System.out.print("Informe a Linha desejada (A até L): ");
						char linhaCancela = scan.next().charAt(0);
						System.out.print("Informe a Coluna desejada (1 até 14): ");
						int colunaCancela = scan.nextInt();
						String funcao = "cancelar";

						if(opcoes.funcaoReservaCancela(mapa.getMapa(), linhaCancela, colunaCancela, funcao)) {
							//System.out.println("Concluido com sucesso!");
						}else{
							//System.out.println("Não foi possível concluir!");
						};
						// opcoes.cancelar(mapa.getMapa(), linhaCancela, colunaCancela);
					} catch (InputMismatchException e) {
						System.out.println("\nErro!" + e);
						scan.nextLine();
					}

					break;

				case 0:

					System.out.println("\nFinalizado");
					menu = 0;

					break;

				default:

					System.out.println("\nInválido. Selecione outra opção!");

					break;
				}
			}
		}
	}
}
