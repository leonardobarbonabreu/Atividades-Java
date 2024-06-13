import java.text.DateFormat;
import java.util.Date;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	private static final int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	/////////////////////////////////////////////////////////////////////////////////
	//CONSTRUTORES
	/////////////////////////////////////////////////////////////////////////////////
	//construtor completo
	public Data(int dia, int mes, int ano) {
		if (dia < 0 || dia > 31 || mes < 0 || mes > 12  ||ano < 0){
		  throw new IllegalArgumentException("dia, mês ou ano incorretos"); 
		}
		//Dia inválidos pela duração do mês
		if (dia > diasPorMes[mes] && !(mes == 2 && dia == 29)) { 
			throw new IllegalArgumentException("O dia" + dia + "ultrapassa o período do mês" + mes);
		}
		
		//Dia inválido devido ao ano bissexto 
		if (mes == 2 && dia == 29 && !(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))) {
			throw new IllegalArgumentException("O dia" + dia + "ultrapassa o período do mês devido ao ano bissexto");
		}
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	//Construtor sem parâmetros
	public Data() {
		this(01,01,1900);
	}
	
	//Construtor com parâmetro de dia
	public Data(int dia) {
		if (dia < 0 || dia > 31){
			  throw new IllegalArgumentException("dia excede o número máximo"); 
			}
		this.dia = dia;
	}
	
	//Construtor com parâmetros de dia e mês
	public Data(int dia, int mes) {
		if ((dia < 0 || dia > 31) && (dia > diasPorMes[mes] && !(mes == 2 && dia == 29))){
			  throw new IllegalArgumentException("dia excede o número máximo do mês"); 
			}
		this.dia = dia;
		this.dia = mes;
		
	}
	
	
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//OBTER VALOR
	//////////////////////////////////////////////////////////////////////////////////
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
    public int getAno(int ano) {
    	if (dia < 0 || dia >= 31 || mes < 0 || mes > 12) {
			throw new IllegalArgumentException("dia tem que estar entre 1-31");
		}
    	return ano;	
    }

    /////////////////////////////////////////////////////////////////////////////////
    // CONVERÇÔES PARA STRING
    /////////////////////////////////////////////////////////////////////////////////
    // converte em String no formato de data universal (dd/m/aaaa)
    public String DataCompleta(int dia, int mes, int ano){
     return String.format("%02d/%02d/%02d", dia, mes, ano);
    }
    
    //Converte Dia em STr
    public String DataDia(int dia){
        return String.format("%02d", dia);
    }
    
    //Converte Dia e Mes em STR
    public String DataDia_Mes(int dia, int mes){
        return String.format("%02d/%02d", dia, mes);
    }
    
    //Data completa Simplificada
    public String DataCompletaSimplificada(int dia, int mes, int ano){
		return String.format("%d/%d/%02d", dia, mes, ano-2000);
	}
    
    //Data extensa inacabada
    public String DataCompletaExtensa(int dia, int mes, int ano){
    	return String.format("%d do %d de %02d", dia, mes, ano);
	}
    
    
}
