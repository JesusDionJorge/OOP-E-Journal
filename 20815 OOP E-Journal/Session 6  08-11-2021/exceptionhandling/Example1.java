package exceptionhandling;

public class Example1 {

	
	public static void main(String[] args) {
		
		int num1 = 4;
		int num2 = 0;
		int result=0;
		
		System.out.println("Welcome");
		
		
		try{
			result = num1/num2;
		}catch(Exception ex){
			System.out.println("You have "+ex.getMessage()+" Please Enter non-zero number");
		} 
		
		
		System.out.println("Good Bye");
		
		System.out.println("Result:"+ result);

	}

}
