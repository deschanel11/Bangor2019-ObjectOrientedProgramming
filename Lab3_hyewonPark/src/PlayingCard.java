
public class PlayingCard {

	private int rank;
	private int suit;

	/**
	 * non-numeric face values get their numeric values
	 */
	/**
	 * for ranks
	 */
	public final int Jack = 11;
	public final int Queen = 12;
	public final int King = 13;
	public final int Ace = 14;
	/**
	 * for suits
	 */
	public final int CLUBS = 0;
	public final int DIAMONDS = 1;
	public final int HEARTS = 2;
	public final int SPADES = 3;


	/**generate the Constructor
	 * @param get the parameters rank and suit
	 * @return return nothing
	 */
	public PlayingCard(int aRank, int aSuit)
	{
		rank  = aRank;
		suit = aSuit;
	}


	public int getRank()
	{
		return rank;
	}

	public int getSuit()
	{
		return suit;
	}


	public String toStringSuit()
	{

		switch(suit)
		{
		case 0 : return "Clubs";
		case 1 : return "Diamonds";
		case 2 : return "Hearts";
		case 3 : return "Spades";
		}
		return"";
	}

	public String toStringRank()
	{
		switch(rank) 
		{

		case 1 : return "1";
		case 2 : return "2";
		case 3 : return "3";
		case 4 : return "4";
		case 5 : return "5";
		case 6 : return "6";
		case 7 : return "7";
		case 8 : return "8";
		case 9 : return "9";
		case 10 : return "10";
		case 11 : return "Jack";
		case 12 : return "Queen";
		case 13 : return "King";
		case 14 : return "Ace";
		}
		return"";
	}



	/**
	 * toString() 
	 * 
	 */
	public String toString()
	{
		return getClass().getName() + "[rank=" + toStringRank() + ", suit=" + toStringSuit() + "]";
	}

	public String format()
	{
		return String.format("%s of %s", toStringRank(), toStringSuit());
		//example : 2 of Clubs, King of Diamonds, 7 of Hearts, Ace of Spades
	}

	public boolean equals(PlayingCard number)
	{
		boolean testCard = false;
		if(this.rank == number.getRank()&&this.suit == number.getSuit())
			testCard = true;

		return testCard;
	}




}
