package lab8Registry_HyewonPark;
import java.util.ListIterator;
import java.util.Scanner;

public class RegistryCLI {

	private Registry theRegistry;

	/*(just refered this example)
	Student student1 = new Student("Hyewon", "Park", "0811UG", "BSc Computer Science");
	Student student2 = new Student("Emma", "Watson", "0415UG", "USc English Literature");
	Student student3 = new Student("Harry", "Potter", "1998UG", "USc Ministry Laws");
	 */
	Scanner in;

	//generate scanner that I'll use
	


	//Constructor of RegistryCLI
	public RegistryCLI(Registry theRegistry) {
		this.theRegistry = theRegistry;
		in = new Scanner(System.in);
	}
	
	
	
	
	
	Boolean flag = true;

	//Displays main menu and gets valid option from user
	public void doMenu() {

		
		while(flag) {


			System.out.println("Registry Main Menu");
			System.out.println("***************\n");


			//displaying what sort of option we have
			System.out.println("1. Add a Student\n");
			System.out.println("2. Delete a Student\n");
			System.out.println("3. Print Registry\n");
			System.out.println("4. Quit\n");
			System.out.println("Select option [1, 2, 3, 4] :>");
			
			String s = in.nextLine();
			int option = Integer.parseInt(s);
			
			

			switch(option)
			{
			case 1 : doAddStudent(); break;
			case 2 : doDeleteStudent(); break;
			case 3 : doPrintRegistry(); break;
			case 4 : System.out.println("Registry is completed. Have a good day!");flag=false; break;
			}

			/*
		int choice =0;

		while(true)
		{
			System.out.println("Please enter option");


			if(choice == 1)
				doAddStudent();

			 */

		}
	}



	//helper methods invoked from within the doMenu() method.
	private void doAddStudent() {

		/*(failed trial)
		System.out.println("Please enter name");
		//scanner to get input
		this.theRegistry.addStudent(new Student("name", "", "", ""));
		 */

		//Scanner in = new Scanner(System.in);
		String answer = "Y";

		do {

			//getting the features from keyboard.
			System.out.println("Add New Student");
			System.out.println("***************\n");

			
			///////////////////////////////////////////////////////////////////////////
			System.out.println("Enter forename	:>");
			String forename = in.nextLine();
			//String forename = in.next();

			System.out.println("Enter surname	:>");
			String surname = in.nextLine();
			//String surname = in.next();
			
			/////////////////////////////////////////////////////////////////////////////

			System.out.println("Enter student ID	:>");
			String studentID = in.nextLine();
			//String temp = in.next();
			System.out.println("Enter degree scheme		:>");
			String degreeScheme = in.nextLine();


			//generating the student example
			Student student1 = new Student(forename, surname, studentID, degreeScheme);

			//adding the student object to a student linked list.
			theRegistry.addStudent(student1);


			System.out.println("Enter another (Y/N)		:>");
			answer = in.nextLine();
			
			//if the answer is invalid, print a warning sign.
			/*if(answer != "Y" && answer != "N") {
				System.out.println("Please enter a valid answer.");
			}*/

		} while(answer.equalsIgnoreCase( "Y"));
		
		
		
	}


	/*while(answer == "")
		{
			System.out.println("Enter another (Y/N)		:>");
			answer = in.nextLine();

			if(answer != "Y" || answer != "N") {
				System.out.println("Please ente2r a valid answer.");
				answer = "";
			}

		}*/


	//Deleting the student from linked list
	private void doDeleteStudent() {

		//String selectedID = "";
		String answer = "Y";
		Scanner in = new Scanner(System.in);

		do {
			System.out.println("Delete Student");
			System.out.println("***************\n");

			System.out.println("Enter student ID	:>");
			////////////////////////////////////////////////////////////////////////////
			String selectedID = in.nextLine();
			System.out.println("asked for id...");
			////////////////////////////////////////////////////////////////////////////////
			
			
			
			theRegistry.deleteStudent(selectedID);

			System.out.println("Delete another (Y/N)		:>");
			answer = in.next();

			if(answer != "Y" || answer != "N") {
				System.out.println("Please enter a valid answer.");
			}

			//while(answer == "Y")
			} while(answer.equalsIgnoreCase("Y"));
		
		in.close();
		}
	

	//Printing the linked list by using format method of registry class.
		private void doPrintRegistry() {
			System.out.println(theRegistry.format());
		}
		
		
		
		
	}


