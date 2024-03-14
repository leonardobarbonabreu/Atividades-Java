import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		//variáveis
		double salario,imposto;
		
		System.out.println("Insira o valor que vocẽ ganha para descobrir o imposto de renda da sua faixa: ");
		salario = sc.nextDouble();
		
		if (salario <= 1903.98) {
			
			System.out.println("Na sua faixa salarial, não é cobrado imposto ");
			
		} else if( salario <= 2826.65) {
			
			imposto = (salario * 0.075);
			System.out.println("Na sua faixa salarial,o imposto seria de R$" + formatador.format(imposto));
			
		} else if( salario <= 3751.06) {
			
			imposto = (salario * 0.15);
			System.out.println("Na sua faixa salarial,o imposto seria de R$" + formatador.format(imposto));
			
		} else if( salario <= 4664.68) {
			
			imposto = (salario * 0.225);
			System.out.println("Na sua faixa salarial,o imposto seria de R$" + formatador.format(imposto));
			
		} else if( salario > 4664.68) {
			
			imposto = (salario * 0.275);
			System.out.println("Na sua faixa salarial, o imposto seria de R$" + formatador.format(imposto));
		}
		
		
	}

}
