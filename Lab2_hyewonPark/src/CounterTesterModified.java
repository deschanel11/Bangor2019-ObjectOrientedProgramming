
public class CounterTesterModified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Testing Counter Class");
		System.out.println("********************");
		Counter tally = new Counter();
		int value = tally.getValue();
		System.out.println("Counter value: " + value);
		

		int i = 0;
		
		while(i<4)
		{
			tally.count();
			value = tally.getValue();
			System.out.println("Counter value: " + value);
			i++;
		}
		
		
	}

}
