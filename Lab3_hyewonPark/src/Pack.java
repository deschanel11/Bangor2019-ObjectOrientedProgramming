import java.util.Random;

public class Pack {
	Random randy = new Random();
	PlayingCard[] cards = new PlayingCard[52];

	/**
	 * Constructs a pack of 52 cards.
	 * Sorted by suit Clubs, Diamonds, Hearts, Spades.
	 * Sorted ascending
	 */

	public Pack()
	{
		int count = 0;
		for(int i = 2 ; i < 15 ; i++)		//�� 1���� �ϸ� �ȵǴ°���..????
			for(int j = 0 ; j < 4 ; j++)
				cards[count++] = new PlayingCard(i, j); //arguments are rank and suit
	}

	/**
	 * Shuffles cards in pack.
	 */
	public void shuffle()
	{
		PlayingCard tmp = null;
		int inx = 0;
		for(int i = 0;i<52;i++)
		{
			inx = randy.nextInt(52);
			tmp = cards[i];
			cards[i] = cards[inx];
			cards[inx] = tmp;

		}
	}

	/**
	 * @return string representation of 52 card pack.
	 * */

	public String toString() //�� toString�� ����Ÿ�� ������ �Ұ����Ѱ�..? ������ string�� �Ǵ°ǰ�?
	{
		for(int i = 0; i<52;i++){
			System.out.println(cards[i] + " ");
		}
		return "";
	}


}
