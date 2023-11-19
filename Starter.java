
public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s;
		s = new Student();
		String [] subs = {"Math", "Eco", "Science"};
		
		
		s.setId(5);
		s.setAvg((float)65.34);
		s.setName("Meera");
		s.setGrade(1);
		s.setSubjects(subs);
		
		System.out.println("The ID is " + s.getId());
		System.out.println("The Name is " + s.getName());
		System.out.println("The Grade is " + s.getGrade());
		System.out.println("The Average is " + s.getAvg()); 
		
		//loop 
		for(int i =0; i<3; i++) {
			System.out.println("The" + i + " Subject is " +s.getSubjects()[i]);
			
		}
		
		

	}

}
