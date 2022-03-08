import java.util.Scanner;


public class Student {
	
	private String name;		
	private int rollNo;
	private String address;
	private String semester;

	private Scanner sc;			
	
		
	public Student(){
		name = "";
		rollNo = 21800;
		address = "";
		semester = "";
		sc = new Scanner(System.in);		
	}
	
	public Student(String name){	
		this.name = name;
		this.rollNo = 21800;
		address = "";
		semester = "";
		sc = new Scanner(System.in);
	}
	
	
	public Student(String name, int roll){	
		this.name = name;
		this.rollNo = roll;
		address = "";
		semester = "";
		sc = new Scanner(System.in);
	}
	
	public Student(Student std){		
		this.name = std.name;
		this.rollNo = std.rollNo;
		address = std.address;
		semester = std.semester;
		sc = std.sc;
	}
	
	public void setStudentInfo(){
		System.out.println("Enter your Name:");
		name = sc.next();
				
		System.out.println("Enter your Address:");
		address = sc.next();
		
		System.out.println("Enter Your roll Number:");
		rollNo = sc.nextInt();
		
		System.out.println("Enter your Semester:");
		semester = sc.next();
		
	}
	
	public String getName(){		
		return name;
	}
	
	public String getAddress() {
		return address;
	}


	public void setAddress(String add) { 
		address = add;
	}


	public String getSemester() {
		return semester;
	}


	public void setSemester(String sem) {
		semester = sem;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public int getRollNo(){
		return rollNo;
	}
	
		
	public void displayStudentInfo(){
			System.out.println("Name:" + name);
			System.out.println("Address:"+ address);
			System.out.println("Roll Number:"+ rollNo);
			System.out.println("Semester:"+ semester);
	
	}

}
