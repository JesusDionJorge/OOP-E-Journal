package practice;
//7.Find out grade of a student when percentage of marks is known.
public class Grade {

	public static void main(String[] args) {
		double percentage=60;
		
		if(percentage >= 90) {
			System.out.println("Excellent: Grade A");
		}
		else if(percentage < 90 && percentage >= 80) {
			System.out.println("Very Good: Grade B");
		}
		else if(percentage < 80 && percentage >= 70) {
			System.out.println("Good: Grade C");
		}
		else if(percentage < 70 && percentage >= 60) {
			System.out.println("Satisfactory: Grade D");
		}
		else if(percentage < 60 && percentage >= 50) {
			System.out.println("Work Hard: Grade E");
		}
		else if(percentage < 50 && percentage >= 40) {
			System.out.println("Just Passed: Grade F");
		}
		else {
			System.out.println("Failed!");
		}
	}
    
}