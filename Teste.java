
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hora hora = new Hora(); //Instanciando a classe Hora, atribuindo como hora
		displayTime("Depois do objeto criado", hora);
		System.out.println();
		
		hora.setTime(13,27,6);
		displayTime("Depois de chamar a função setTime", hora);
		System.out.println();
		
		try
		{
			hora.setTime(99, 99, 99);
		}
		catch (IllegalArgumentException e){
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}
		
		displayTime("Depois de chamar o setTime com valores inválidos", hora);
	}
	
	private static void displayTime(String header, Hora t){
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.toUniversalString(),t.toString());

						
	}

}
