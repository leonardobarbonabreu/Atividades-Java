import java.util.Scanner;

public class AtvVetPrimo {
	public static void main(String[] args) {
		int numero[] = new int[9],
			primo = 0;

		Scanner sc = new Scanner(System.in);
		
		// INPUT DOS VALORES DO VETOR
		for (int i = 0; i < 9; i++) {
			System.out.println("Digite o número da posição " + (i+1) +" do vetor: ");
			numero[i] = sc.nextInt();
		}
		//VALIDAÇÃO DE PRIMO
		for (int i = 0; i < 9; i++) {
			int contPrimo = 0;
			for (int i2 = 1; i2 <= numero[i]; i2++) {
				if (numero[i] % i2== 0) {
					contPrimo++;
					primo = 1;
				}
			}
			if (contPrimo <= 2) {
				System.out.println("O número " + numero[i] + " na posição " + (i + 1) + " é primo.");
			}			
		}
		if (primo == 0) {
			System.out.println("Não há números primos nesse vetor.");
		}
	}

}
