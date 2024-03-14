import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int dia;
		
		System.out.println("Insira o valor do dia da semana:");
		dia = sc.nextInt();
		 
		if (dia > 8 || dia < 0) {
			System.out.println("Digite um número entre 1 e 7, por favor");
		} else {
			switch(dia) {
			case 1 :
				dia = 1;
				System.out.println("Domingo");
				break;
			case 2 :
				dia = 2;
				System.out.println("Segunda");
				break;
			case 3 :
				dia = 3;
				System.out.println("Terça");
				break;
			case 4 :
				dia = 4;
				System.out.println("Quarta");
				break;
			case 5:
				dia = 5;
				System.out.println("Quinta");
				break;
			case 6 :
				dia = 6;
				System.out.println("Sexta");
				break;
			case 7 :
				dia = 7;
				System.out.println("Sábado");
				break;
			default :
				System.out.println("Ta errado isso dai em");
		
			} 
		}
		
	}

}
