import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variáveis
		int anterior = 0, proximo = 1, limite;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de termos para a sequência de fibonacci: ");
		limite = sc.nextInt();
		System.out.println("------------------------------------------------------------");
		for(int i = 0; i <= limite; i++) {
			int resultado = anterior + proximo;
			anterior = proximo;
			proximo = resultado;
			System.out.println(resultado);
		}
		System.out.println("termino da sequência.");
	}

}
