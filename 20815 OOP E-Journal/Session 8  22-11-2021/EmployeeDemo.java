package inhertances;

public class EmployeeDemo {

	public static void main(String[] args){ 
		
		Employee emp;
		
		emp = new Employee("Andy", 120000.00, 2012);
		emp.raiseSalary(10);
		System.out.println("name=" + emp.getName() + ",salary=" + emp.getSalary()); 
		
			
		Manager mgr = new Manager("Akarsh", 450000.00, 2002);
		mgr.raiseSalary(20);
		mgr.setBonus(25000);
		System.out.println("name=" + mgr.getName() + ",salary=" + mgr.getSalary()); 
		
	}
	
	
}
