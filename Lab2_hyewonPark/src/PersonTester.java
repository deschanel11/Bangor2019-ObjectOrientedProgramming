public class PersonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String firstName;
		String familyName;
		
		Person person1 = new Person("hyewon", "park"); //get the forename and surname
		
			person1.takeAge(20);
			
			person1.takeHeight(1.6);
			
			person1.takeGender("female");
			
			System.out.println(person1.toString());
			

		Person person2 = new Person("minjeong", "park"); //Same examples with different person
			
			person2.takeAge(22);
				
			person2.takeHeight(1.8);
				
			person2.takeGender("female");
				
			System.out.println(person2.toString());
				
			System.out.println(person1.format());
		
	}
}
