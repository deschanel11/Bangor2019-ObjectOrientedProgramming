
public class Counter {
	
	private int value;
	
	//Constructor for counter class
	public Counter()
	{
		value = 0;
	}

	//Returns counter value
	public int getValue() {
		return value;
	}
	
	//Counter is incremented
	public void count()
	{
		value = value + 1;
	}
	
	//reset the counter value
	public int reset()
	{
		value = 0;
		return value;
	}
	
	
	//Counter is decremented
	public void decrement()
	{
		if(value!=0)
			value = value - 1;
	}
	
	
	
	
}
