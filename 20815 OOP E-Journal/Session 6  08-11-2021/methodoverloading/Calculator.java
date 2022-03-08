package methodoverloading;

public class Calculator {
	private double result;
	
	
	public Calculator(){
		result = 0.0;
	}
		
	public void add(int a, int b){
		result = a+b;
	}
	
	/*
	 * Method with same name but different signature - method overloading
	 * Signature means method name + arguments list, but not return type is not part of signature
	 */
	public void add(double a, int b){
		result = a+b;
	}
	/*
	 * Method with same name but different signature - method overloading
	 */
	public void add(double a, double b){
		result = a+b;
	}
	
	/*
	 * Method with same name but different signature - method overloading
	 */
	public double add(double a, double b, int c){
		result = a+b+c;		// + operator is adding 2 numbers,
		
		return result;
	}
	
	public String  add(String a, String b){
		return a+b;					// + operator is adding 2 strings, so operator overloading
	}
	
	public double getResult(){
		return result;
	}

}
