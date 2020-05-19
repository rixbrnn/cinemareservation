package laboratorio2;

import java.util.Formatter;

public class Mapa {
	private static final Assento[][] mapa = new Assento[12][14];
	private static final char[] linha = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L' };

	// construtor preenche o mapa com todos assentos vazios para nao ficar nulo
	public Mapa() {

		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa[0].length; j++) {
				mapa[i][j] = new Assento();
			}
		}
	}

	// exibir a tabela, com um * no lugar se estiver ocupad
	public String toString() {
		System.out.println("----------------------------------------------------------");
		String str = "";
		str = str + linha[0];
		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa[0].length; j++) {

				str = str + " | " + mapa[i][j].toString();
				if (j == mapa[0].length - 1) {
					str = str + " |\n";
					str = str + "----------------------------------------------------------\n";
					if (i + 1 < linha.length) {
						str = str + linha[i + 1];
					}

				}
			}

		}
		// so tava faznedo uns testes de formatacao mas acabou q fiz na mao msm
		Formatter fmt = new Formatter();
		fmt.format("    1   2   3   4   5   6   7   8   9  10   11  12  13  14");

		str = str + fmt.toString();
		fmt.close();
		return str;

	}

	public Assento[][] getMapa() {
		return mapa;
	}
}
