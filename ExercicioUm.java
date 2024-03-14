import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
//		Faça um programa que receba como entradas o nome da disciplina e a quantidade de aulas dadas.
//		Além disso, o programa deve solicitar as notas de um aluno nos 4 bimestres, calcular a média e
//		mostrar o total de faltas no ano letivo. O programa deve retornar a média do aluno, indicar se 
//		o aluno foi aprovado considerando a média superior a 6,0 e as presenças superior ou igual a 75% das aulas dadas.
		
		//variáveis
		String disciplina;
		int aulaPresenca, bimestreUm, bimestreDois, bimestreTres, bimestreQuatro;
		float media;
		float presencaPorcentagem;
		float aulaDada;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo ao gestor de desempenho do aluno");
		
		System.out.println("Insira a disciplina: ");
		disciplina = sc.next();
		
		System.out.println("Insira a quantidade de aulas dadas durante o ano letivo: ");
		aulaDada = sc.nextInt();
		
		System.out.println("Agora, informe a quantidade de presenças recebidas nessa disciplina: ");
		aulaPresenca = sc.nextInt();
		
		System.out.println("Informe sua nota em cada Bimestre: ");
		System.out.println("Bim. 1:");
		bimestreUm = sc.nextInt();
		System.out.println("Bim. 2:");
		bimestreDois = sc.nextInt();
		System.out.println("Bim. 3:");
		bimestreTres = sc.nextInt();
		System.out.println("Bim. 4:");
		bimestreQuatro = sc.nextInt();
		
		media = (bimestreUm + bimestreDois + bimestreTres + bimestreQuatro)/4;
		presencaPorcentagem = ((float)aulaPresenca/aulaDada)*100;
		
		System.out.println("---");
		if (aulaPresenca >= (aulaDada*0.75) && media >= 60.0) {
			System.out.println("Parabéns, na discilina de " + disciplina + " você foi aprovado com uma média de " + media + ", e com uma presença de " + presencaPorcentagem + "%.");
		} else {
			System.out.println("você não foi aprovado");
		}
	}

}
