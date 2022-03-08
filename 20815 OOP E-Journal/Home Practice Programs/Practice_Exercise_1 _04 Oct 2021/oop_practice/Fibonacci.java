package oop_practice;
//12.Generate Fibonacci series till a given number.
public class Fibonacci {
	private int n;
	private int x;
	private int y;
	
	public Fibonacci() {
		n = 20;
		x = 0;
		y = 1;
	}
	
	public void showFibonacci() {
		System.out.println("Fibonacci Series:");
		for (int i = 2; i <= n; ++i) {
			System.out.print(x+" ");
			int sum = x + y;
			y = x;
			x = sum;
		}
		
	}
}
