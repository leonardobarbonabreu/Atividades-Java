import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OBJETIVO: Utilização do laço de repetição for para a criação da tabuada 
		
		Scanner sc = new Scanner(System.in);
		//TABUADA INTEIRA DO 1 AO 10
		for(int i=1; i<= 10; i++) {
			System.out.printf("\n tabuada do %d", i);
			for (int e=1; e <=10; e++) {
				System.out.printf("\n %d X %d = %d", i, e, i*e);
			}
				
		}
			
				
		//TABUADA ESPECÍFICA 
//		System.out.println("Informe o número da tabuada: ");
//		int tabuada = sc.nextInt();
//		
//		for(int cont = 1; cont<= 10; cont++)
//			System.out.printf("\n %d X %d = "+ tabuada*cont +"", tabuada, cont);
//			
			sc.close();
	}

}
