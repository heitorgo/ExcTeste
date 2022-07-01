import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numeroEscolhido=0;
		int numero1=0;
		int numero2=1;
		int numero3=0;
		System.out.println("Informe um número inteiro");
		numeroEscolhido = leitor.nextInt();
		leitor.close();
		while(numero1<=numeroEscolhido) {
			numero3 = numero1+numero2;
			if(numeroEscolhido == numero1 || numeroEscolhido == numero2 || numeroEscolhido == numero3 ) {
				System.out.println("Esse número pertence a sequencia de fibonacci");
				return;
				
			}
			numero1=numero2;
			numero2=numero3;
			
		}
		System.out.println("Esse número não pertence a sequencia de fibonacci");
	}

}
