package StockControl_HyewonPark;

import java.util.LinkedList;
import java.util.ListIterator;

public class StockLinkedList implements StockList {
	
	/**
	 * create the linked list.
	 */
	LinkedList<StockItem> itemLists = new LinkedList<StockItem>();
	
	// Adds item to stock list
		public void addItem(StockItem item) {
			itemLists.add(item);
		}
		
		
		// Removes item identified by productID from stock list
		public void deleteItem(String itemID) {
			
			for(int i = 0;i<itemLists.size();i++) {
				if(itemLists.get(i).getItemID().equals(itemID)) {
					itemLists.remove(i);
				}
			}
			//itemLists.remove(itemID);
		}
		
		
		// Updates price of existing item
		/**
		 * find the element that has the ID we have, and replace the price using set method of Linked List.
		 */
		public void updateItemPrice(String itemID, double price)
		{
			for(int i = 0;i<itemLists.size();i++) {
				if(itemLists.get(i).getItemID().equals(itemID)) {
					
					String ID = itemLists.get(i).getItemID();
					String Desc = itemLists.get(i).getItemDesc();
					//double Price = itemLists.get(i).getPrice();
					int Quant = itemLists.get(i).getQuantity();
					int Level = itemLists.get(i).getReOrderLevel();
					
					StockItem item_ = new StockItem(ID, Desc, price, Quant, Level);
					
					//itemLists.add(i,item_);
					
					itemLists.set(i, item_);
				}
			}
		}
		
		// Updates quantity of existing item
		/**
		 * find the element that has the ID we have, and replace the quantity using set method of Linked List.
		 */
		public void updateItemQuantity(String itemID, int quantity) {
			
			for(int i = 0;i<itemLists.size();i++) {
				if(itemLists.get(i).getItemID().equals(itemID)) {
					
					String ID = itemLists.get(i).getItemID();
					String Desc = itemLists.get(i).getItemDesc();
					double Price = itemLists.get(i).getPrice();
					//int Quant = itemLists.get(i).getQuantity();
					int Level = itemLists.get(i).getReOrderLevel();
					
					StockItem item_ = new StockItem(ID, Desc, Price, quantity, Level);
					
					itemLists.set(i, item_);
				}
			}
			
		}
		
	
		// Updates re-order level of existing item
		/**
		 * find the element that has the ID we have, and replace the re-order level, using set method of Linked List.
		 */
		public void updateReOrderLevel(String itemID, int reOrderLevel) {
			
			for(int i = 0;i<itemLists.size();i++) {
				if(itemLists.get(i).getItemID().equals(itemID)) {
					
					String ID = itemLists.get(i).getItemID();
					String Desc = itemLists.get(i).getItemDesc();
					double Price = itemLists.get(i).getPrice();
					int Quant = itemLists.get(i).getQuantity();
					//int Level = itemLists.get(i).getReOrderLevel();
					
					StockItem item_ = new StockItem(ID, Desc, Price, Quant, reOrderLevel);
					
					itemLists.set(i, item_);
				}
			}
		}
		
		
		

		// Returns formatted representation of the stock list
		/**
		 * returning the String by adding all the strings in one String together.
		 */
		public String formatStockList() {
			String test = "ItemID Description Price Qnty Re-Order Level\r\n" + 
					"****** *********** ***** **** **************\n";
			ListIterator<StockItem> iterator = itemLists.listIterator();

			while (iterator.hasNext()) {
				StockItem s = iterator.next();
				test += s.getItemID() + "\t" + s.getItemDesc() + "\t" + s.getPrice() + "\t" + s.getQuantity() + "\t" + s.getReOrderLevel() + "\n";
			}
			return test;
		}


		/**
		 * Returns formatted representation of re-order list.
		 *  Items are on this list if the quantity is less than reOrderLevel.
		 */
		public String formatReOrderList() {
			String test2 = "";
			for(int i = 0; i<itemLists.size(); i++) {
				if(itemLists.get(i).getQuantity() < itemLists.get(i).getReOrderLevel()) {
					test2 += itemLists.get(i).format();
				}
			}
			return test2;
		}
}
