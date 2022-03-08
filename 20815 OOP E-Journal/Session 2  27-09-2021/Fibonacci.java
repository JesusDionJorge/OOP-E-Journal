
//Generate Fibonacci series till a given number.
public class Fibonacci {

	public static void main(String[] args) {
		int num1=0,num2=1,num3,i,n=10;
		System.out.println(num1);
		System.out.println(num2);
		
		for(i=2;i<n;i++) {
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}

	}

}
