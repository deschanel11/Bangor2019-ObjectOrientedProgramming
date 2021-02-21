package lab5_hyewonPark;

public class DieGame2Tester {
	
public static void main(String[] args) {

	Die die1 = new Die(6);
	Die die2 = new Die(6);
	
	System.out.println("Starting Doubles ...");
	
	System.out.println(die1.toString2());
	
	int Score = 0;
	
	for(int i = 0;i<3;i++) {
		
		die1.throwDie();
		die2.throwDie();

		
		if(die1.getFaceValue()==die2.getFaceValue())
			Score++;
		
	System.out.println(die1.format(die1, die2));
		
	}
	
	System.out.println("Your score = " + Score);
	
	
	
}
	
	
}
