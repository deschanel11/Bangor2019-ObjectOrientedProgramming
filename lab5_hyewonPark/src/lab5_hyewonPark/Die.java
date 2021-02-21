package lab5_hyewonPark;
/*
 * Simulates behaviour of a die
 */



import java.util.Random;

public class Die {

	private int faceValue;	//Current face value of die
	private int sides;	//Number of sides
	private Random generator; //Creates an instance of the class Random
	 
	Random rand= new Random();
	
	//constructor for Die class
	public Die(int s) {
		sides = s;
	}
	
	
	public void throwDie() {
		faceValue = rand.nextInt(sides);
	}
	
	
	public int getFaceValue() {
		return faceValue;
		//just an access method, returns the face value of the die
	}
	
	
	public String toString() {
		//Die[faceValue=3, sides=6]
		return getClass().getName() + "[faceValue=" + faceValue + ", sides=" + sides + "]";
	}
	
	//for DieGame2 Tester(single player game)
	public String toString2() {
		return "die1\tdie2\n*****\t*****";
	}
	
	public String toString3() {
		return "Dice1\tDice2\n*****\t*****";
	}
	
	public String format(Die die1, Die die2) {
		return String.format("%d\t%d", die1.getFaceValue(), die2.getFaceValue());
	}
	
}
