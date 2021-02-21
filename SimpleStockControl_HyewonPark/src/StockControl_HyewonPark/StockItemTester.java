package StockControl_HyewonPark;

public class StockItemTester {

	public static void main(String[] args) {
		
		
		
		/**
		 * testing generating the Stock Item objects, and printing it.
		 */
		System.out.println("\n******************test1************************\n");
		
		
		
		/**
		 * 3 objects for stock item, which has all different parameters.
		 */
		StockItem stockItem1 = new StockItem("is4463", "soup", 3.5, 50, 3);
		StockItem stockItem2 = new StockItem("is4303", "shampoo", 1.6, 100, 1);
		StockItem stockItem3 = new StockItem("us1943", "illuminator", 4.0, 3000, 4);
		

		/**
		 * printing the parameters, using toString method and format method.
		 */
		System.out.println("itemID\titemDesc\tprice\tQuantity\treOrderLevel\n");
		
		System.out.println(stockItem1.toString());
		System.out.println(stockItem2.toString());
		System.out.println(stockItem3.format());
		
		
		
		

		/**
		 * testing 5 getter methods.
		 */
		System.out.println("\n******************test2************************\n");
		System.out.println("Testing the 5 getters.\n");
		
		String a = stockItem1.getItemID();
		System.out.println("ID: " + a);
		String b = stockItem1.getItemDesc();
		System.out.println("Description: " + b);
		
		double c = stockItem2.getPrice();
		System.out.println("Price: " + c);
		
		int d = stockItem3.getQuantity();
		System.out.println("Quantity: " + d);
		
		int e = stockItem3.getReOrderLevel();
		System.out.println("Re-order Level: " + e);
		
	}
}
