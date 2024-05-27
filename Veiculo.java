
public class Veiculo {
	public float qtdeCombustivel, autonomia, kmDistancia;
	public String marca, modelo;
	
	public float identificarAutonomia(String modelo) {
		if (modelo == "popular") {
			return autonomia = 10.3f;
		} else if (modelo == "SUV") {
			return autonomia = 14.3f;
		} else { // Caso for miniVan
			return autonomia = 7;
		}
	}
	
	public float calcularLitros(float kmDistancia, float autonomia) {
		return kmDistancia/autonomia;
	};
	
	
	
}
