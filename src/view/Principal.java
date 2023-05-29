package view;

import br.com.serialexperimentscarina.arvoreint.ArvoreInt;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {30, 15, 60, 10, 20, 40, 80};
		ArvoreInt arvore = new ArvoreInt();
		
		for (int valor : vetor) {
			arvore.insert(valor);
		}
		
		try {
			arvore.prefixSearch();
			System.out.println("\n\n(Ordem crescente)");
			arvore.infixSearch();
			System.out.println("\n");
			arvore.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
