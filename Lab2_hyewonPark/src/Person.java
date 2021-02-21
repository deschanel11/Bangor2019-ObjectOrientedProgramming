import java.util.Scanner;

public class Person {
	
	
	//declaring String variables with 'private'
	private String forename;
	private String surname;
	private int age;
	private double height;
	private String gender;
	
	private static int personCount;
	
	
	//Constructs the 'Person'
	public Person()
	{
		//empty constructor
	}
	
	public Person(String firstName, String familyName) //lab 교수님이 method에서 constructor로 바꿔주심
	{
		forename = firstName;
		surname = familyName;
	}
	
	public void takeAge(int age1)
	{
		age = age1;
	}
	
	public void takeHeight(double height1)
	{
		height = height1;
	}
	
	public void takeGender(String gender1)
	{
		gender = gender1;
	}
	
	
	//using the 'toString()', we can print the datas at the Tester
	public String toString()
	{
		return getClass().getName() + "[" + forename +", "+ surname +", "+ age +", "+ height +", "+ gender + "]";
	}
	
	
	//And the format method is this!
	public String format()
	{
		return String.format("%s\t%s\t%d\t%.2f\t%s", forename, surname, age, height, gender);
	}
	
	
}
