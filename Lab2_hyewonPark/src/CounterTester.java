
public class CounterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Testing Counter Class");
		System.out.println("********************");
		Counter tally = new Counter();
		int value = tally.getValue();
		
		System.out.println("Counter value: " + value);
		

		int i = 0;
		
		//to shoe decrement and reset, increment multiple times
		while(i<4)
		{
			tally.count();
			value = tally.getValue();
			System.out.println("Counter value: " + value);
			i++;
		}
		
		//show the decrement method words well
		tally.decrement();
		value = tally.getValue();
		System.out.println("Counter value: " + value);
		
		//show the reset method works well
		tally.reset();
		value = tally.getValue();
		System.out.println("Counter value: " + value);
		
	}

}
