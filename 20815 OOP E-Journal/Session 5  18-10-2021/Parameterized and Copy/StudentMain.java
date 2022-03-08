
public class StudentMain {

	public static void main(String[] args) {
		Student st = new Student(); 
		
		st.displayStudentInfo();
		
		Student st1 = new Student("Andrea", 20802);	
		st1.setAddress("Margao");
		st1.setSemester("3");
		
		//st1.displayStudentInfo();
		
		Student stcopy = new Student(st1);		
		stcopy.displayStudentInfo();

	}

}
