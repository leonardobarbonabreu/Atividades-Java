import java.util.Scanner;

public class AtvCarroTabelaParcela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float precoCarro = .2f;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do carro:");
		precoCarro = sc.nextFloat();
		
		System.out.println("-------------------------------");
		System.out.println("Tabela de formas de pagamento");
		System.out.println("-------------------------------");
		System.out.println("À Vista: R$ " + precoCarro * 0.80);
		System.out.println("-------------------------------");
		System.out.println("Parcelado: ");
		System.out.println("6x:  R$ " + precoCarro * 1.03);
		System.out.println("12x: R$ " + precoCarro * 1.06);
		System.out.println("18x: R$ " + precoCarro * 1.09);
		System.out.println("24x: R$ " + precoCarro * 1.12);
		System.out.println("30x: R$ " + precoCarro * 1.15);
		System.out.println("36x: R$ " + precoCarro * 1.18);
		System.out.println("42x: R$ " + precoCarro * 1.21);
		System.out.println("48x: R$ " + precoCarro * 1.24);
		System.out.println("54x: R$ " + precoCarro * 1.27);
		System.out.println("60x: R$ " + precoCarro * 1.30);
		System.out.println("-------------------------------");
	}
}
