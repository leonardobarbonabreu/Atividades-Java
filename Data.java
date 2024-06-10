
public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public void setDate(int dia, int mes, int ano) {
		if (dia < 0 || dia > 31 || mes < 0 || mes > 12  ||ano < 0){
		  throw new IllegalArgumentException("dia, mês ou ano incorretos"); 
		}
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(int dia) {
		if (dia < 0 || dia >= 31) {
			throw new IllegalArgumentException("dia tem que estar entre 1-31");
		}
		
		this.dia = dia;
	}
	
	public Data(int dia, int mes) {
		if (dia < 0 || dia >= 31 || mes < 0 || mes > 12) {
			throw new IllegalArgumentException("dia tem que estar entre 1-31");
		}
		
		this.mes = mes;
		this.dia = dia;	
	}
	
	public Data() {
		this.dia = 1;
		this.mes = 1;
		this.ano = 1900;
	}
}
