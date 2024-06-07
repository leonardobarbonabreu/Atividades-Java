
public class Teste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hora2 t1 = new Hora2(); // 00:00:00 ÿ
		Hora2 t2 = new Hora2(2); // 02:00:00 ÿ
		Hora2 t3 = new Hora2(21, 34); // 21:34:00 ÿ
		Hora2 t4 = new Hora2(12, 25, 42); // 12:25:42ÿ
		Hora2 t5 = new Hora2(t4); // 12:25:42 ÿ
	
		System.out.println("Constructed with:");
		displayTime("t1: all default arguments", t1);
		displayTime("t2: hour specified; default minute and second", t2);
		displayTime("t3: hour and minute specified; default second", t3);
		displayTime("t4: hour, minute and second specified", t4);
		displayTime("t5: Time2 object t4 specified", t5);
		
		try
		{
		Hora2 t6 = new Hora2(27, 74, 99); // valores inválidosÿ
		}
	    catch (IllegalArgumentException e)
		{
		 System.out.printf("%nException while initializing t6: %s%n",e.getMessage());
		}
	}
	
	private static void displayTime(String header, Hora2 t){
	 System.out.printf("%s%n %s%n %s%n",
	header, t.toUniversalString(), t.toString());
	}

}
