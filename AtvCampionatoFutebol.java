import java.util.Scanner;

public class AtvCampionatoFutebol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int contadorTime = 5,
			contadorJogador = 11,
			totalJogadores = 55,
			idade,
			qtdeMenor;
		
		float peso = 0.2f, 
		      altura = 0.2f,
		      mediaIdade = 0.2f;
		float mediaAltura = 0.2f;
		float total80kg = 0.2f;
		float porcentagem = (total80kg/totalJogadores)*100;
		
		qtdeMenor = 0;
		total80kg = 0;
		
		for(contadorTime = 1; contadorTime <= 3; contadorTime++) {
			mediaIdade = 0;
			for(contadorJogador = 1; contadorJogador <= 3; contadorJogador++){
				System.out.println("\nJogador "+contadorJogador +"-------------------------");
				System.out.println("Digite a idade do jogador: ");
				idade = sc.nextInt();
				System.out.println("Digite o peso do jogador: ");
				peso = sc.nextFloat();				
				System.out.println("Digite a altura do jogador: ");
				altura = sc.nextFloat();
				
				
				mediaIdade += idade;
				mediaAltura += altura;
				
				if (idade <= 18) {
					qtdeMenor += 1;
				}
				
				if (peso > 80) {
					total80kg += 1;
				}
			}
			System.out.println("Time "+contadorTime + "----------------------------------------------");
			System.out.printf("\nQuantidade de jogadores com idades inferiores à 18: %d ", qtdeMenor);
			System.out.printf("\nMédia de idades do time %d: %.2f anos", contadorTime, mediaIdade/3);
		}
		System.out.printf("\nA média de altura de todos os jogadores: %.2f cm", (mediaAltura/totalJogadores));
		System.out.printf("\nPorcentagem de Jogadores acima dos 80kg: %f %", porcentagem);
	}

}
