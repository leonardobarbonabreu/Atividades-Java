import java.util.Scanner;

public class AtvMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numero;
		double cubo;
		double raiz;
		double quadrado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha um número: ");
		numero = sc.nextFloat();

				
		while ( numero > 0) {
			
			quadrado = Math.pow(numero,2);
			raiz = Math.sqrt(numero);
			cubo = Math.pow(numero,3);
			
			System.out.println("Quadrado: " + quadrado);
			System.out.println("Cubo: " + cubo);
			System.out.println("Raiz: " + raiz);
			System.out.println("--------------");
			System.out.println("Escolha um número: ");
			numero = sc.nextFloat();
			
		}
		
	}

}
