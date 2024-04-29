import java.util.Scanner;

public class AtvIdadeMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float idade = 0;
		int qtdeIdade = 1;
		float idadeTotal = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe idade para média: ");
		idade += sc.nextFloat();
		idadeTotal += idade;

		while ( idade > 0) {
			qtdeIdade += 1;
			System.out.println("Informe idade para média: ");
			idade = sc.nextFloat();
			idadeTotal += idade;
			float mediaIdade = idadeTotal/qtdeIdade;
			System.out.println("--------------------------------");
			System.out.println("Média das idades: " + mediaIdade);
			System.out.println("--------------------------------");
			
		}
		System.out.println("Fim da Execução.");


		
	}

}
