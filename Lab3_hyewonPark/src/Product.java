//Generate the class 'Product'
public class Product {

	private String description;
	private double price;
	//declared String 'description' and double 'price'.
	//description => which will be printed by toString() and format().
	
	
	//generate the constructor
	public Product()
	{
		//empty constructor
	}
	
	public String getDescription()
	
	public int getPrice()
	
	public void reducePrice()
	
	public void increasePrice()
	
	public String toString()
	{
		return getClass().getName() + "[product details =" + description + "]";
	}
	
	public String format()
	{
		return String.format("%s", description);
	}
	
	
	
	
	
	
	
}
