class Student{
    private String studentName;
	private int studentRoll;
	private String studentGrade;

	public Student(String studentName, int studentRoll, String studentGrade) {
		super();
		this.studentName = studentName;
		this.studentRoll = studentRoll;
		this.studentGrade = studentGrade;
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentRoll() {
		return studentRoll;
	}
	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}

	public String getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentRoll=" + studentRoll + ", studentGrade=" + studentGrade
		+ "]";
	}

}

public class Task2 {
    public static void main(String[] args) {
        
    }
}
