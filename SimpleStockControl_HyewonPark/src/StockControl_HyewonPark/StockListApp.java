package StockControl_HyewonPark;

public class StockListApp {

	public static void main(String[] args) {

		
		/**
		 *  Create the stock list object.
		 */
		StockList stockList = new StockLinkedList();
		//stockList.loadStockData(args[0]);
		
		
		/**
		 *  Create an interface
		 */
		StockListCLI stockListCLI = new StockListCLI(stockList);
		
		
		/**
		 * Display the menu for the user through the console.
		 */
		stockListCLI.doMenu();
		

	}

}
