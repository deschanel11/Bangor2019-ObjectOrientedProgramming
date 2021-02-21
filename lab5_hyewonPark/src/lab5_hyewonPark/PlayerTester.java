package lab5_hyewonPark;

public class PlayerTester {

	public static void main(String[] args) {
		
		//create the two dices and two players
		
		Die Dice1 = new Die(6);
		Die Dice2 = new Die(6);
		
		Player player1 = new Player(0);
		Player player2 = new Player(0);
		
		
		//for player1, roll the dices and figure out the score
		System.out.println(Dice1.toString3());
		for(int i = 0;i<3;i++) {
			Dice1.throwDie();
			Dice2.throwDie();
			
			System.out.println(Dice1.format(Dice1, Dice2));
			
			if(Dice1.getFaceValue() == Dice2.getFaceValue())
				player1.setScore(Dice1.getFaceValue()); 
			//player get the score if the face of dice 1 and 2 is same
		}
		
		System.out.println("Player 1 score =" + player1.getScore());
		System.out.println("\n");
		
		
		
		//for player2, roll the dices and figure out the score
		System.out.println(Dice1.toString3());
		for(int i = 0;i<3;i++) {
			Dice1.throwDie();
			Dice2.throwDie();
			
			System.out.println(Dice1.format(Dice1, Dice2));
			
			if(Dice1.getFaceValue() == Dice2.getFaceValue())
				player2.setScore(Dice1.getFaceValue());
		}
		
		System.out.println("Player 2 score =" + player2.getScore());
		System.out.println("\n");
		
		if(player1.getScore() > player2.getScore())
			System.out.println("Player 1 wins!");
		else if(player1.getScore() < player2.getScore())
			System.out.println("Player 2 wins!");
		else
			System.out.println("Platers score is same!");
		
		
	}

}
