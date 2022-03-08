package oop_practice;
//13.Find out maximum of 3 numbers.
public class MaximumOfThree {
	private int a;
	private int b;
	private int c;
	private int large;
	
	public MaximumOfThree() {
		a = 215;
		b = 649;
		c = 462;
	}
	
	public void findMaximumOfThree() {
		{
			large = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		}
		System.out.println("1st number: "+a);
		System.out.println("2nd number: "+b);
		System.out.println("3rd number: "+c);
		System.out.println("------------------------------------");
		System.out.print(+large+" is the Maximum of the 3 numbers");
	}
}