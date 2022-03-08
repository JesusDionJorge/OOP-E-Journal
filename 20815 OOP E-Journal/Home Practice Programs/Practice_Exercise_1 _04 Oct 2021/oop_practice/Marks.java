package oop_practice;
//19.Class to find total marks obtained and percentage when marks of any 5 subjects are given. Consider 100 to be maximum marks of each subject
import java.util.Scanner;

public class Marks {
	
	private int T,P;
	static int a;
	static int b;
	static int c;
	static int d;
	static int e;
	private Scanner sc;
	
	public void getmarks() {
		
		sc = new Scanner(System.in);
				
		System.out.print("Input marks of CP subject: ");
		a=sc.nextInt();
		
		System.out.print("\nInput marks of DM subject: ");
		b=sc.nextInt();
		
		System.out.print("\nInput marks of DBMS subject: ");
		c=sc.nextInt();
		
		System.out.print("\nInput marks of OOC subject: ");
		d=sc.nextInt();
		
		System.out.print("\nInput marks of Advertising subject: ");
		e=sc.nextInt();
	}
	
	public void setmarks() {
		T = a+b+c+d+e;
		
		if (T<=500) {
			System.out.println("\nTotal Marks: "+T);
			P = T*100/500;
			System.out.println("Percentage: "+P);
		}
		
		else {
			System.out.println("\n Check your marks and enter again.");
		}
	}
	

	
}