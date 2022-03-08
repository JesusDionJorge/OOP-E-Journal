package oop_practice;
//17.Find out Area, Circumference, and Diameter of a Circle with a given radius.
public class Circle {
final double pi=3.14;      
	
	public double area(double r) {
		double ar=pi*r*r; 
		return ar;
	}
	
	public double Circumference(double r) {
		double ci=2*pi*r; 
		return ci;
	}
	
	public double diameter(double r) {
		double di=2*r; 
		return di;
	}


}
