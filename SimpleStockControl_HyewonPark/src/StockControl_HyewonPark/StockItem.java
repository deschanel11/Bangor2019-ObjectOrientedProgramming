package StockControl_HyewonPark;

public class StockItem {

	/**
	 * five instance variables.
	 */
	private String itemID;	//Five alpha-numeric characters
	private String itemDesc;	//Item description
	private double price;	//Item price in pounds sterling
	private int quantity;	//Quantity in stock
	private int reOrderLevel;	//Level at which to re-order


	/**
	 * Constructor for StockItem
	 */
	/**
	 * using constructor's parameter, initialising the instance variables.
	 */
	public StockItem(String itemID, String itemDesc, double price, int quantity, int reOrderLevel) {
		this.itemID = itemID;
		this.itemDesc = itemDesc;
		this.price = price;
		this.quantity = quantity;
		this.reOrderLevel = reOrderLevel;
	}


	
	/**
	 * toString method
	 */
	public String toString() {
		return "["+ itemID + "\t" + itemDesc + "\t" + price + "\t" + quantity + "\t" +reOrderLevel + "]";
	}
	
	
	/**
	 * format method
	 */
	public String format() {
		return String.format("[%s\t%s\t%s\t%s\t%s]", itemID, itemDesc, price, quantity, reOrderLevel);
	}
	
	
	/**
	 * getters for itemID, itemDesc, price, quantity, reOrderLevel.
	 */
	
	public String getItemID() {
		return itemID;
	}
	
	public String getItemDesc() {
		return itemDesc;
	}
	
	public double getPrice() {
		return price;
	}
	
	
	public int getQuantity() {
		return quantity;
	}
	
	public int getReOrderLevel() {
		return reOrderLevel;
	}
	
	
	
	
}
