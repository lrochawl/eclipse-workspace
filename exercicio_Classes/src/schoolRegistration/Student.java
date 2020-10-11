package schoolRegistration;

public class Student {
	public double grade;
	public String name;
	
	public double sumGrade(double grade) {
		return this.grade += grade;
	}
	
	public void showGrade() {
		System.out.println("FINAL GRADE: = " + this.grade);
		if(this.grade < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60 - this.grade);
		}else {
			System.out.println("PASS");
		}
		
	}
	
}
