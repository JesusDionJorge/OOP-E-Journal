package oop_practice;
//11.	Find out factorial of a number.
public class Factorial {

		private int number = 7;			
		private int fact = 1;

		public void findFactorial(){	
			int count =0;				
			
			for(count=1; count<=number; count++){
				
				fact = fact * count; 
			}
					
			System.out.println("Factorial of " + number + " is: " + fact);
	}

}
