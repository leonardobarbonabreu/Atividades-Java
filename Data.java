
public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public void setData(int dia, int mes, int ano) {
		if (dia < 0 || dia > 31 || mes < 0 || mes > 12  ||ano < 0){
		  throw new IllegalArgumentException("dia, mês ou ano incorretos"); 
		}
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////
	// MUDANÇAS
	///////////////////////////////////////////////////////////////////////////////////////////////////
	// Métodos get
    // obtém valor do dia
    public int getDia(int dia){
    	if (dia < 0 || dia >= 31) {
			throw new IllegalArgumentException("dia tem que estar entre 1-31");
		}
    	return dia;
    }
    //obtém o valor do mes
    public int getMes(int mes){
    	if (dia < 0 || dia >= 31) {
			throw new IllegalArgumentException("dia tem que estar entre 1-31");
		}
    	return mes;
    }
    //obtém o valor do ano
    public int getAno(int ano){
    	if (dia < 0 || dia >= 31 || mes < 0 || mes > 12) {
			throw new IllegalArgumentException("dia tem que estar entre 1-31");
		}
    	return ano;
    }
    
    // converte em String no formato de data universal (dd/m/aaaa)
    public String toUniversalString(int dia, int mes, int ano){
     return String.format("%02d/%02d/%02d", dia, mes, ano);
    }
    
    // converte em String no formato padrão de data/hora (H:MM:SS AM ou PM)
//    public String toString(){
//     return String.format("%d/%02d/%02d %s",
//     ((getDia() == 0 || getDia() == 31 || (getMes() == 2 && getDia() == 29))) ? 12 : getHour() % 12),getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	

	//////////////////////////////////////////////////////////////////////////////////////////////////
	//CASO SOMENTE UM INPUT SEJA DADO
	public Data(int dia) {
		
		
		this.dia = dia;
	}
	
	public Data(int dia, int mes) {
		
		
		this.mes = mes;
		this.dia = dia;	
	}
	
	public Data() {
		this.dia = 1;
		this.mes = 1;
		this.ano = 1900;
	}
}
