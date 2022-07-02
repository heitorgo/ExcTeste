package exercicio5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			System.out.println("Informe qualquer palavra sem espaçamento");
			String palavra = leitor.next();
			leitor.close();
			System.out.println("Palavra: "+palavra);
			String palavraInvertida = ReverterPalavra.reverterPalavra(palavra, palavra.length()-1);
			System.out.println("Palavra invertida: "+palavraInvertida);

	}

}
