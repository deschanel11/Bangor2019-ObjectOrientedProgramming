package StockControl_HyewonPark;

public class StockListTester {

	public static void main(String[] args) {
		
		StockLinkedList listOfStock = new StockLinkedList();
		
		
		StockItem stockItem1 = new StockItem("is4463", "soup", 3.5, 50, 3);
		StockItem stockItem2 = new StockItem("is4303", "shampoo", 1.6, 100, 1);
		StockItem stockItem3 = new StockItem("us1943", "illuminator", 4.0, 3000, 4);
		
		/**
		 * testing the add, delete.
		 */
		System.out.println("******************test1************************\n");
		
		listOfStock.addItem(stockItem1);
		listOfStock.addItem(stockItem2);
		listOfStock.addItem(stockItem3);
		
		//System.out.println("itemID\titemDesc\tprice\tQuantity\treOrderLevel\n");
		//System.out.println("***********************************************\n");
		System.out.println(listOfStock.formatStockList());
		
		/**
		 * deleting one Item with its ID, and print the list again.
		 */
		listOfStock.deleteItem("us1943");
		System.out.println(listOfStock.formatStockList());
		
		
		/**
		 * testing updating the price, quantity, re-order level.
		 */
		System.out.println("******************test2************************\n");
		
		listOfStock.updateItemPrice("is4463", 4);
		listOfStock.updateItemQuantity("is4463", 20);
		listOfStock.updateReOrderLevel("is4463", 30);
		

		//System.out.println("itemID\titemDesc\tprice\tQuantity\treOrderLevel\n");
		System.out.println(listOfStock.formatStockList());
		
		
		/**
		 * testing printing the re-order list.
		 */
		System.out.println("******************test3************************\n");
		
		System.out.println(listOfStock.formatReOrderList());
		
		
		
		
	}
}
