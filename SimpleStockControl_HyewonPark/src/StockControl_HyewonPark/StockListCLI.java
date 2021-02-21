package StockControl_HyewonPark;

import java.util.Scanner;


public class StockListCLI {

	private StockList stock = null;
	
	/**
	 * To get a answers from user through the console, use Scanner.
	 */
	Scanner in;
	
	
	//constructor
	public StockListCLI(StockList stock){
		
		this.stock = stock;
		in = new Scanner(System.in);
	}
	
	

	/**
	 * the flag can control the doMenu()'s while statement.
	 * When user choose number 8 for Exit, the flag will change to False.
	 */
	Boolean flag = true;
	
	
	
	// Displays main menu and gets valid option from user
	public void doMenu() {
		
		while(flag) {
		
			System.out.println("Stock List Main Menu\n" + "********************");
			
			/**
			 * displaying the options
			 */
			System.out.println("1. Add an Item\n");
			System.out.println("2. Delete an Item\n");
			System.out.println("3. Update Item Price\n");
			System.out.println("4. Update Item Quantity\n");
			System.out.println("5. Update Re-Order Level\n");
			System.out.println("6. Print Stock List\n");
			System.out.println("7. Print ReOrder List\n");
			System.out.println("8. Exit\n\n");
			System.out.println("Select option [1-8] :>");
			
			String numb = in.nextLine();
			int option = Integer.parseInt(numb);
			
			
			
			/**
			 * using switch-case statement for operating the menu.
			 */
			switch(option)
			{
			case 1 : doAddItem(); break;
			case 2 : doDeleteItem(); break;
			case 3 : doUpdateItemPrice(); break;
			case 4 : doUpdateItemQuantity(); break;
			case 5 : doUpdateReOrderLevel(); break;
			case 6 : doPrintStockList(); break;
			case 7 : doPrintReorderList(); break;
			case 8 : System.out.println("Stock App is completed. Have a good day!");flag=false; break;
			
			}
		}
	}
	
	
	
	/**
	 * Obtain input for stock list operation and invoke operation
	 */
	private void doAddItem() {
		
		/**
		 * answer is for user to choose enter another or not.
		 */
		String answer = "Y";
		
		
		
		do {
			/**
			 * getting the features from keyboard.
			 */
			System.out.println("Add New Item\n");
			System.out.println("***************\n");

			
			System.out.println("Enter ID	:>");
			String ID = in.nextLine();

			System.out.println("Enter Description	:>");
			String Desc = in.nextLine();
			
			System.out.println("Enter Price	:>");
			String price = in.nextLine();
			int j = Integer.parseInt(price);
			double Price = (double)j;
			
			System.out.println("Enter Quantity		:>");
			String j2 = in.nextLine();
			int Quant = Integer.parseInt(j2);
			
			System.out.println("Enter Re-Order Level		:>");
			String j3 = in.nextLine();
			int reOrderLevel = Integer.parseInt(j3);

			
			/**
			 * generate new object for StockItem
			 */
			StockItem item_ = new StockItem(ID, Desc, Price, Quant, reOrderLevel);
			
			
			/**
			 * add the new item to a Stock Linked List.
			 */
			stock.addItem(item_);


			System.out.println("Add another (Y/N)		:>");
			answer = in.nextLine();
			/**
			 * if the answer is invalid, print a warning sign.
			 * 
			 */
			if(answer != "Y" && answer != "N") {
				System.out.println("Please enter a valid answer.");
			}
			
		} while(answer.equals("Y"));
	}
	


	private void doDeleteItem() {

		/**
		 * answer is for user to choose delete another or not.
		 */
		String answer = "Y";
		
		do {
			
			System.out.println("Delete Item\n");
			System.out.println("***************\n");

			System.out.println("Enter ID	:>");
			String selectedID = in.nextLine();

			stock.deleteItem(selectedID);

			System.out.println("Delete another (Y/N)		:>");
			answer = in.nextLine();

			if(answer != "Y" && answer != "N") {
				System.out.println("Please enter a valid answer.");
			}

		} while(answer.equals("Y"));
	}
	
	


	private void doUpdateItemPrice() {


		String answer = "Y";

		do {

			System.out.println("Updating Price\n");
			System.out.println("***************\n");

			System.out.println("Enter ID	:>");
			String selectedID = in.nextLine();

			System.out.println("Enter Price	:>");
			String price = in.nextLine();
			int j = Integer.parseInt(price);
			double Price = (double)j;


			stock.updateItemPrice(selectedID, Price);

			System.out.println("Update Price for another (Y/N)		:>");
			answer = in.nextLine();

			if(answer != "Y" && answer != "N") {
				System.out.println("Please enter a valid answer.");
			}

		} while(answer.equals("Y"));

	}

	
	
	
	
	
	private void doUpdateItemQuantity() {
		
		

		String answer = "Y";

		do {

			System.out.println("Updating Quantity\n");
			System.out.println("***************\n");

			System.out.println("Enter ID	:>");
			String selectedID = in.nextLine();

			System.out.println("Enter Quantity	:>");
			String j2 = in.nextLine();
			int Quant = Integer.parseInt(j2);

			stock.updateItemQuantity(selectedID, Quant);

			System.out.println("Update Quantity for another (Y/N)		:>");
			answer = in.nextLine();

			if(answer != "Y" && answer != "N") {
				System.out.println("Please enter a valid answer.");
			}

		} while(answer.equals("Y"));

	}
	
	
	
	private void doUpdateReOrderLevel() {
		
		String answer = "Y";

		do {

			System.out.println("Updating Re-order Level\n");
			System.out.println("***************\n");

			System.out.println("Enter ID	:>");
			String selectedID = in.nextLine();

			System.out.println("Enter Re-order Level	:>");
			String j3 = in.nextLine();
			int reOrderLevel = Integer.parseInt(j3);

			stock.updateReOrderLevel(selectedID, reOrderLevel);

			System.out.println("Update Re-order Level for another (Y/N)		:>");
			answer = in.nextLine();

			if(answer != "Y" && answer != "N") {
				System.out.println("Please enter a valid answer.");
			}

		} while(answer.equals("Y"));

	}
	
	
	// Display contents of stock list
	private void doPrintStockList() {
		System.out.println(stock.formatStockList());
	}
	
	
	
	
	// Display contents of re-order list
	private void doPrintReorderList() {
		System.out.println(stock.formatReOrderList());
	}

	
}
