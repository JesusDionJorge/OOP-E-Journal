package methodoverloading;

public class CalculatorUser {

	
	public static void main(String [] args){
		Calculator cal;
		
		cal = new Calculator();
		
		cal.add(3, 3);
		
		System.out.println(cal.getResult());
		
		cal.add(3.3, 4.3);
		System.out.println(cal.getResult());
		
		cal.add(3.3, 4);
		System.out.println(cal.getResult());
		
		cal.add(3.3, 4.3, 7);
		System.out.println(cal.getResult());
		
		System.out.println(cal.add("Good", "Morning"));
	}
}
