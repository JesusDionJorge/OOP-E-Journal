public class Calculator {
	double result;
	
	public Calculator(){
		
	}
	
	public double addNumbers(double num1, double num2){
		result = num1+num2;
		return result;
	}
	
	public double square(double num1){
	//	result = num1*num1;
		result = Math.pow(num1, 1);
		return result;
	}
	

}
