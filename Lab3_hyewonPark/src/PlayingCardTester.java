
public class PlayingCardTester {

	public static void main(String[] args) {
		
		PlayingCard Card1 = new PlayingCard(13, 3);
		PlayingCard Card2 = new PlayingCard(11, 8);
		
		System.out.println(Card1.toString());	
		
		System.out.println(Card1.format());
		
		System.out.println(Card1.equals(Card1));
		System.out.println(Card1.equals(Card2));
		}

}
