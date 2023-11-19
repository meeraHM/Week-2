
public class Student1 extends Person{
	int ID;
	String Major;
	Double Grade;
	int Attendance;

	public Student1(String name, int age, String nationality, String dOB, int ID, String major, Double grade, int attendance) {
		super(name, age, nationality, dOB);
		ID = id; 
		Major = major;
		Grade = grade;
		Attendance = attendance;
	}
	
	public void study() {
		System.out.println(Name+ "  is studying " + Major);
	}
	public void code() {
		System.out.println(Name+ "  is coding and scored " + Grade);
	}
	public void project() {
		System.out.println(Name+ "  is working in the project with the attendace  " + this.Attendance);
	}
	
	
		

			
		}
	

	

