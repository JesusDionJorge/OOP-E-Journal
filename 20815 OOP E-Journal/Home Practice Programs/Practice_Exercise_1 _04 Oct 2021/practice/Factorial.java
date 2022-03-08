package practice;
//2.Find out factorial of a number.
public class Factorial {

	public static void main(String[] args) {
		int i,fact=1,num1=9;
		for(i=1;i<=num1;i++) {
			fact=fact*i;
		}
			System.out.println("Factorial of "+num1+" is "+fact);
	}

}
