package lab5_hyewonPark;

public class Player {

	private int score;

	//Player constructor
	public Player(int initialScore)
	{
		score = initialScore;
	}

	// Mutator method to increases player¡¯s score
	public void setScore(int points)
	{
		score += points;
	}


	// Access method to return value of player¡¯s score
	public int getScore()
	{
		return score;
	}

	/*
	public String format(Player player) {
		return String.format("%s: score = %d", getClass().getName(), this.getScore());
	}
	*/
	




}
