import java.util.Scanner;

public class atividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salario_carlos, salario_joao;
		int meses = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário do Carlos: ");
		salario_carlos = sc.nextFloat();
		
		salario_joao = salario_carlos/3;
		while (salario_joao < salario_carlos) {
			salario_carlos += (salario_carlos * 0.6f / 100);
			salario_joao += (salario_joao * 1/100);
			meses += 1;
			System.out.print("\n --------------------------------------------------------------------");
			System.out.printf("\n No mês %d, o salário de carlos é R$ %.2f | salário do joão é R$ %.2f ", meses, salario_carlos, salario_joao);
		}
		System.out.print("\n --------------------------------------------------------------------");
		System.out.println("\n Quantidade de meses necessários para que joao ultrapasse carlos: " + meses);
	}

}
