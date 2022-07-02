package exercicio5;

public abstract class ReverterPalavra {
	
	public static String reverterPalavra(String palavra, int index) {
		if(index == 0) {
			return palavra.charAt(0) + "";
		}
		char letra = palavra.charAt(index);
		return letra + reverterPalavra(palavra, index-1);
	}

}
