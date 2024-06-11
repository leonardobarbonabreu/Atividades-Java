import java.util.Scanner;

public class TesteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();	
		Scanner sc = new Scanner(System.in);
		int diaSc = 0, mesSc, anoSc, dia = 0, mes =0, ano = 0;
		
		
		
		
		System.out.println("Informe um dia: ");
		diaSc = sc.nextInt();
		dia = data.getDia(diaSc);
		
		System.out.println("Informe um mes: ");
		mesSc  = sc.nextInt();
		mes = data.getMes(mesSc);
		
		System.out.println("Informe um ano: ");
		anoSc  = sc.nextInt();
		ano = data.getAno(anoSc);
		
		String conteudo = data.toUniversalString(dia, mes, ano);
		System.out.println(conteudo);
		
	}

}
