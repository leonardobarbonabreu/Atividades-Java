import java.util.Scanner;

public class AtvConcatenador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vet1[], vet2[], vet3[],i,j,k,m = 0;
		vet1 = new int[5];
		vet2 = new int[5];
		vet3 = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for (k = 0; k < 5; k++) {
			System.out.println("Digite os números das posições dos vetores 1 e 2: ");
			vet1[k] = sc.nextInt();
			vet2[k] = sc.nextInt();
		
		}
		
		for (i = 0; i < 5; i++) { // Realizar duas Incrementações ao Vetor 3
			vet3[m] = vet1[i];
			System.out.println("De vet1 -> vet3["+m+"]="+vet3[m]);
			m += 1;
			vet3[m] = vet2[i];
			System.out.println("De vet2 -> vet3["+m+"]="+vet3[m]);
			m += 1;
		}
		
		for(j = 0; j< 10; j++) {
			System.out.println(vet3[j]);
		}
	}
}
