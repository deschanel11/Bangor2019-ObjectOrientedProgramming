package lab8Registry_HyewonPark;

public class RegistryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Test 1. Check student list contains three students.
		//Method tested: constructor and format
		
		
		
	//generate registry object.
		Registry register = new Registry();
		
		
		Student student1 = new Student("Hyewon", "Park", "0811UG", "BSc Computer Science");
		Student student2 = new Student("Emma", "Watson", "0415UG", "USc English Literature");
		Student student3 = new Student("Harry", "Potter", "1998UG", "USc Ministry Laws");
		
		
		//register student 1, 2, 3.
		register.addStudent(student1);
		register.addStudent(student2);
		register.addStudent(student3);
		
		
		//test format method
		System.out.println(register.format());
		
		//test toString method
		System.out.println(register.toString());
		
		
		/*(failed trial)
		while(register.iterator.hasNext()) {
			System.out.println(register.format(register.iterator.next()));
			//register.iterator.next().toString();
		}
		*/
		
	}

}

