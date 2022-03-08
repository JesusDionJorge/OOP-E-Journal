package oop_practice;
//15.Find out area and perimeter of a rectangle when length and breadth is known.

public class Rectangle {
	private int length;
	private int breadth;
	private int area;
	private int perimeter;
	
	
	public Rectangle(){		
		length=12;
		breadth = 24;
		area = 0;
		perimeter =0;
	}
	
	
	public void findArea(){
		area = length * breadth;
		System.out.println("Area is : " + area);
	}
	
	
	public void findPerimeter(){
		perimeter = 2*(length + breadth);
		System.out.println("Perimeter is :" + perimeter);
	}
		
}
