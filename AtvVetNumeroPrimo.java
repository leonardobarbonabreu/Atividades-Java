import java.util.Scanner;

public class AtvVetNumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posicao[], i = 0, contPrimo = 0 ,primo = 0, i2 = 0, i3 = 0;
		posicao = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for (i = 0; i < 5; i++) {
			System.out.println("Digite os números da posição " + i +" do vetor: ");
			posicao[i] = sc.nextInt();
		}
		for (i3 = 1; i3 < 6; i3++) {
			for (i2 = 0; i2 < 5; i2++) {
				contPrimo = 0;
				if ((posicao[i3]/i2)== 0) {
					contPrimo +=1;
					primo = 1;
				};
			if (contPrimo >= 2) {
				System.out.println("Na posição "+ i2 +", o número"+ posicao[i2] +"é primo.");
			}
		}
		if (primo == 0) {
			System.out.println("Não há números primos nesse vetor.");
		}
					
			
		}
		
	}

}
