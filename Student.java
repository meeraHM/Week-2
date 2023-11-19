
public class Student {

	int Id;
	String name;
	float avg; 
	int Grade;
	String [] subjects;
	//Parameterised Constructor
	public Student(int id, String name, float age, int grade, String[] subjects) {
		super();
		Id = id;
		this.name = name;
		avg = avg;
		Grade = grade;
		this.subjects = subjects;
	} 
	
	// Default Constructor
	public Student() {
	}
	
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		avg = avg;
	}
	public int getGrade() {
		return Grade;
	}
	public void setGrade(int grade) {
		Grade = grade;
	}
	public String[] getSubjects() {
		return subjects;
	}
	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	
	
	
	
	
}
