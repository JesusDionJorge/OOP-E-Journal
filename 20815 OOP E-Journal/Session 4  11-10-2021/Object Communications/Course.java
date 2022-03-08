
public class Course {
	private String courseName;
	private String courseId;
	private int maxMarks;
	private int courseCredit;
	
	public Course(){
		
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String name) {
		courseName = name;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String id) {
		courseId = id;
	}

	public int getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(int max) {
		maxMarks = max;
	}

	public int getCourseCredit() {
		return courseCredit;
	}

	public void setCourseCredit(int credit) {
		courseCredit = credit;
	}
}
