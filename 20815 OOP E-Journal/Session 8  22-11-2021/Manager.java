package inhertances;

public class Manager extends Employee{
	private double bonus;
	
	public Manager(String n, double s, int year){
		super(n,s,year); 
		bonus = 0;
	}
	
	public void setBonus(double b){ 
		bonus = b; 
	}
	/
	
	public double getSalary(){
		this.salary = this.salary+bonus;
		return this.salary;
	}
	
}
