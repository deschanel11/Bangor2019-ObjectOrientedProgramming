/**
 * A class to test the BancAccount class.
 * @author ¹ÚÇý¿ø
 */

public class BankAccountTester {

	//Test the methods of the BankAccount class.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount jacksAccount = new BankAccount(0); //proper parameter is needed for this method
		BankAccount jillsAccount = new BankAccount(500);
		
		int jacksAccNum = jacksAccount.makeAccNum(734089427);
		int jillsAccNum = jillsAccount.makeAccNum(754082327);
		
		jacksAccount.deposit(200);
		jillsAccount.withdraw(200);
		jacksAccount.withdraw(500);
		
		double jacksBalance = jacksAccount.getBalance();
		double jillsBalance = jillsAccount.getBalance();
		
		//System.out.println("Jack's current balance is: " + jacksBalance);
		//System.out.println("Jill's current balance is: " + jillsBalance);
		
		System.out.println("Jack's Account: " + jacksAccount.toString());
		System.out.println("Jill's Account: " + jillsAccount.toString());
		
		
		

	}

}
