package oop_practice;
//17.Find out Area, Circumference, and Diameter of a Circle with a given radius.
import java.util.Scanner;
public class CircleDemo {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in); 
		double radius;

		System.out.print("Enter the radius: "); 
		radius =sc.nextDouble();

		Circle c=new Circle(); 
		double ar = c.area(radius);
		System.out.println("Area: " +ar);

		double cir = c.Circumference(radius);
		System.out.println("Circumference: " +cir);

		double di = c.diameter(radius);
		System.out.println("Diameter: " +di);


	}

}