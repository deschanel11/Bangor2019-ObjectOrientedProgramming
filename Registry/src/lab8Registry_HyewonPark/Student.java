package lab8Registry_HyewonPark;
//import java.util.Scanner;


public class Student {

	private String foreName;
	private String surName;
	private String studentID;
	private String degreeScheme;
	
	
	//constructor
	public Student(String foreName, String surName, String studentID, String degreeScheme)
	{
		this.foreName = foreName;
		this.surName = surName;
		this.studentID = studentID;
		this.degreeScheme = degreeScheme;
		
		
		//foreName = "John" => every time I create the student instance, the
		//foreName will be John. This is hard-coded parameter!!
	}
	
	
	
	//<getters>
	public String getForeName() {
		return foreName;
	}
	
	public String getSurName() {
		return surName;
	}
	
	public String getStudentID() {
		return studentID;
	}
	
	public String getDegreeScheme() {
		return degreeScheme;
	}
	
	
	//format String
	public String format(Student aStudent) {
		return String.format("%s %s\t%s\t%s", aStudent.getForeName(), aStudent.getSurName(), aStudent.getStudentID(), aStudent.getDegreeScheme());
	}
	
	
}
