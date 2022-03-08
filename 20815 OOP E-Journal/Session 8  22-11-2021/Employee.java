package inhertances;

public class Employee {
	private String name; 
	protected double salary; 
	private int hireYear;
	
	public Employee (){
		
	}
	
	public Employee(String n, double s, int year) { 
		name = n; 
		salary = s; 
		hireYear = year; 
	} 
	
	public String getName() { 
		return name; 
	}
	
	public double getSalary(){ 
		return salary; 
	}
	
	public int getHireYear() { 
		return hireYear; 
	} 
	
	public void raiseSalary(double byPercent) { 
		double raise = salary * byPercent / 100; 
		salary += raise; 
	} 

}
