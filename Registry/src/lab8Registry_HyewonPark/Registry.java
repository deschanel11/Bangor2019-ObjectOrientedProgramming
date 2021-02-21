package lab8Registry_HyewonPark;
import java.util.LinkedList;
import java.util.ListIterator;

public class Registry {

	//create the linkedList of student, 'studentList'
	LinkedList<Student> studentList;
	//= LinkedList<Student>();
	
	//Get an iterator object
	//ListIterator<Student> iterator;
	
	//Registry Constructor, initiates list and iterator
	public Registry() {
		studentList = new LinkedList<Student>();
		//iterator = studentList.listIterator();
	}
	
	
	public void addStudent(Student aStudent) {
		studentList.add(aStudent);
	}
	

	

	public void deleteStudent(String studentID) {
		ListIterator<Student> iterator = studentList.listIterator();
		
		while(iterator.hasNext()) {
			//hasNext() doesn't return or really traverse it, but just check, not like next().
			if(studentList.getFirst().getStudentID() == studentID) {
				//studentList.remove(studentList.getFirst());
				iterator.remove();
				break;
			}
			iterator.next();
		}
	}
	
	
	
	
	
	
	
	public String toString() {
		String printt = "";// need to be initialized with ""
		
		
		/*
		Exception in thread "main" java.util.ConcurrentModificationException
		at java.util.LinkedList$ListItr.checkForComodification(Unknown Source)
		at java.util.LinkedList$ListItr.next(Unknown Source)
		at Registry.toString(Registry.java:41)
		at RegistryTester.main(RegistryTester.java:27)
		*/
		//=>the error says line 41, 27 and it's before I add the error message in this code
		
		
		ListIterator<Student> iterator = studentList.listIterator(); //without this, it occurs error
		//I think the error happens because the iterator without upper line, it's superclass's iterator, not for this one :(
		
		
		while(iterator.hasNext()) {
			Student t = iterator.next(); 
			//t stores the "result" of the iterator.next().
			//So not like my worry, it doesn't happen all the times the the t is called.
			printt += t.getForeName() + " " + t.getSurName() + "\t" + t.getStudentID() + "\t" + t.getDegreeScheme() + "\n";
		}
		
		return printt;
		//return aStudent.getForeName() +" " + aStudent.getSurName() + "		" + aStudent.getStudentID() + "		" + aStudent.getDegreeScheme();
	}
	
	
	
	
	
	
	public String format() {

		String test = "";
		
		
		/*(failed trial)
		for (Student s : studentList) {
		    test += s.getForeName() + " " + s.getSurName() +"\n";
		}
		*/
		
		
		ListIterator<Student> iterator = studentList.listIterator();
		while (iterator.hasNext()) {
			
			Student s = iterator.next();
			test += s.getForeName() + " " + s.getSurName() + "\t" + s.getStudentID() + "\t" + s.getDegreeScheme() + "\n"; //It doesn't go next in every use of s??
		}
		
		
		
		return test;
		
		
	}
	
	
	
	
	
}
