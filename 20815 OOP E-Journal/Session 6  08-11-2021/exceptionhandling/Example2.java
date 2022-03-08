package exceptionhandling;

public class Example2 {

	
	public static void main(String[] args) {
		
		int num1 [] = {2,3,5,6};
		
		try{
			for (int i=0; i<=num1.length; i++){
				System.out.print("["+ num1[i]+"]");
			}
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}

	}

}
