/**
 * A bank account has a balance that can be changed by
 * deposits and withdrawals.
 * WARNING: CODE MAY DELIBERATELY CONTAIN ERRORS => OKAY!!
 * WARNING: CODE IS INCOMPLETE => OKAY!!>_<
 * @author ¹ÚÇý¿ø
 */

public class BankAccount {

	private double balance;
	private int accountNumber;
	

	
	// Constructs a bank account with a zero balance.
	/*public void BankAccount()
	{
		balance = 0;
	}
	*/
	
	//Constructs a bank account with a given balance.
	public BankAccount(double initialBalance) //the space should be placed at the proper place.
	{
		balance = initialBalance;
	}
	
	public int makeAccNum(int initialAccNumber)
	{
		accountNumber = initialAccNumber;
		return accountNumber;
	}
	
	//Deposits money into the bank account.
	public void deposit(double amount)
	{
		double newBalance = balance + amount;
		balance = newBalance;
	}
	
	//Withdraws money from the bank account.
	public void withdraw(double amount) {
		if(balance - amount <0) {
			balance = 0;
		}
		else if(balance - amount != 0) {
			double newBalance = balance - amount;
			balance = newBalance;
		}
	}
	
//Gets the current balance of the bank account.
	public double getBalance()
	{
		return balance;
	}
	
	
	//private double balance; => this should be put first
	
	
	public String toString()
	{
		return getClass().getName() + "[balance=" + balance + ", accountNumber=" + accountNumber +"]";
	}
	
	
	
}
