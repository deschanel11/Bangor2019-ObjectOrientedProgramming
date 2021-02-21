package lab5_hyewonPark;

import java.util.Scanner;

public class DieTester_Plg {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Die Dice1 = new Die(6);
		Die Dice2 = new Die(6);
		int score1 = 0;
		int score2 = 0;

		System.out.println("for Player 1, we will roll your first dice.");
		Dice1.throwDie();
		score1 += Dice1.getFaceValue();

		System.out.println("Will you continue? (y/n)");
		//Scanner ans1 = new Scanner(System.in);
		String ans1 = in.nextLine();

		if(ans1.equals("y")) {
			System.out.println("put the number you want to play more: ");
			int num = in.nextInt(); //get the roll times player wants to play.
			//int num_ = Integer.parseInt(num);

			//System.out.println(Dice1.toString2());

			for(int i = 0;i<num;i++) {
				Dice1.throwDie();
			}

			boolean gameOver = false;
			while (num>0 && gameOver!=true)
			{
				Dice1.throwDie();
				
				//game overs if the face value is 1
				if(Dice1.getFaceValue() == 1) {
					gameOver = true;
					score1 = 0;
				}
				else
					score1 += Dice1.getFaceValue();
		
				num--;	//count the times that player wanted to play more by substracting the num
				
				
				//check if the score reaches 100 or more
				if(score1>=100)
					gameOver = true;
			}
			
			System.out.println("Player1's score is: " + score1);
		}
		else
			System.out.println("Player1's score is: " + score1);


		System.out.println("\n\n");
		
		
		System.out.println("for Player 2, we will roll your first dice.");
		Dice2.throwDie();
		score2 += Dice2.getFaceValue();

		System.out.println("Will you continue? (y/n)");
		String ans2 = in.nextLine();

		if(ans2.equals("y")) {
			
			System.out.println("put the number you want to play more: ");
			int num2 = in.nextInt(); //get the roll times player wants to play.
			
			//System.out.println(Dice2.toString2());

			for(int i = 0;i<num2;i++) {
				Dice2.throwDie();
			}

			boolean gameOver = false;
			while (num2>0 && gameOver!=true)
			{
				Dice2.throwDie();
				if(Dice2.getFaceValue() == 1) {
					gameOver = true;
					score2 = 0;
				}
				else
					score2 += Dice1.getFaceValue();
				num2--;
				
				if(score2>=100)
					gameOver = true;
			}
			
			System.out.println("Player2's score is: " + score2);
		}
		else
			System.out.println("Player2's score is: " + score2);
	
	
	
		if(score1>score2)
			System.out.println("Player1 is winner!");
		else if(score1<score2)
			System.out.println("Player2 is winner!");
		else
			System.out.println("The players have a same score!");
	}

}
