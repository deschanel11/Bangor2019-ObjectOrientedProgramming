package lab8Registry_HyewonPark;
public class StudentTester {

	public static void main(String[] args) {
		
		//Student person1 = new Student("John", "Cenydd"); => THIS IS HARD-CODED PARAMETER EXAMPLE!!!
		 
		Student student1 = new Student("Hyewon", "Park", "0811UG", "BSc Computer Science");
		Student student2 = new Student("Emma", "Watson", "0415UG", "USc English Literature");
		Student student3 = new Student("Harry", "Potter", "1998UG", "USc Ministry Laws");
		
		
		
		//testing the format method with 3 examples, student1, student2, student3.
		System.out.println(student1.format(student1));
		System.out.println(student2.format(student2));
		System.out.println(student3.format(student3));
		
	}
}


