package laboratorio2;


public class Opcoes {

	public  boolean funcaoReservaCancela(Assento[][] m, char l, int c, String funcao) {
		int linha = 0;
		boolean erro = true;

		if (l == 'a' || l == 'A')
			linha = 0;
		else if (l == 'b' || l == 'B')
			linha = 1;
		else if (l == 'c' || l == 'C')
			linha = 2;
		else if (l == 'd' || l == 'D')
			linha = 3;
		else if (l == 'e' || l == 'E')
			linha = 4;
		else if (l == 'f' || l == 'F')
			linha = 5;
		else if (l == 'g' || l == 'G')
			linha = 6;
		else if (l == 'h' || l == 'H')
			linha = 7;
		else if (l == 'i' || l == 'I')
			linha = 8;
		else if (l == 'j' || l == 'J')
			linha = 9;
		else if (l == 'k' || l == 'K')
			linha = 10;
		else if (l == 'l' || l == 'L')
			linha = 11;
		else {
			if (funcao.equalsIgnoreCase("reservar")) {
				//System.out.println("\nErro ao reservar.\n");
				return erro = false;
			} else {
				//System.out.println("\nErro ao cancelar reserva.\n");
				return erro = false;
			}
		}

		if (erro) {
			if (funcao.equalsIgnoreCase("reservar"))
				reservar(m, linha, c - 1);
			else
				cancelar(m, linha, c - 1);
		}
		
		return erro;
//		TESTE
//		System.out.println("l: " + l + " linha:" + linha);
	}

	private void reservar(Assento[][] m, int l, int c) {
//		troca de public p private
//		l--;
//		c--;
		try {
			if (m[l][c].isOcupado()) {
				//System.out.println("\nPosição já ocupada.");
			} else {
				m[l][c].setOcupado(true);
				//System.out.println("\nReservado com sucesso!");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nErro ao reservar. " + e);
		}
	}

	private void cancelar(Assento[][] m, int l, int c) {
//		troca de public p private
//		l--;
//		c--;
		try {
			if (m[l][c].isOcupado()) {
				m[l][c].setOcupado(false);
				//System.out.println("\nCancelado com sucesso!");
			} else {
				//System.out.println("\nPosição não estava reservada.");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nErro ao cancelar reserva.");
		}

	}

	public void mostraMapa(Mapa m) {
		System.out.println(m);
	}

	public String quantidades(Assento[][] a) {
		int ocupados = 0;
		int tamanho = a.length * a[0].length;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j].isOcupado() == true) {
					ocupados++;
				}
			}
		}
		int disponiveis = tamanho - ocupados;
		String qtd = "Disponíveis: " + disponiveis;
		qtd += "\nOcupados: " + ocupados;
		return qtd;

	}

}
