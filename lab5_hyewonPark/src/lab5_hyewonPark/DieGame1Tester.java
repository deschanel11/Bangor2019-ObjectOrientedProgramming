package lab5_hyewonPark;


//Single player game 'Six or Lose'
public class DieGame1Tester {

	public static void main(String[] args) {
		
		Die aDie = new Die(6);
		int Score = 6;
		boolean gameOver = false;
		
		
		System.out.println("Starting Six or Lose ...");

		System.out.println("Die\tScore\n*****\t*****");
		
		while (gameOver!=true)
		{
			aDie.throwDie();
			if(aDie.getFaceValue() == 6)
				gameOver = true;
			else
				Score--;
			if(Score == 0) {
				gameOver = true;
			}
				System.out.println(aDie.getFaceValue() + "\t" + Score);
		}
		
		if(aDie.getFaceValue()==6)
			System.out.println("You¡¯ve thrown a six!!! You win with a score of " + Score + ".");
		else
			System.out.println("You have not thrown a six. You lose.");
		
		
	}
	
	
}
