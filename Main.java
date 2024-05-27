import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo v = new Veiculo();
		Scanner dado = new Scanner(System.in);
		
		float kmDistancia , autonomia, litrosUsados;
		String modelo, marca, combustivel;
		
		System.out.println("Digite a marca do veículo: ");
		marca = dado.next();
		
		System.out.println("Digite o modelo do veículo: ");
		modelo = dado.next();
		
		System.out.println("Digite o tipo de combustível: ");
		combustivel = dado.next();
		
		System.out.println("Digite a distância que deseja percorrer: ");
		kmDistancia = dado.nextFloat();
		
		//Processamento
		v.modelo = modelo;
		autonomia = v.identificarAutonomia(modelo);
		litrosUsados = v.calcularLitros(kmDistancia, autonomia);
		
		//Saída
		System.out.printf("Marca: %s| Modelo: %s| Combustível: %s|Trajeto: %.2f|Qtde. em litos p/ conclusão: %.2f L ", marca, modelo, combustivel, kmDistancia, litrosUsados );
	}

}
