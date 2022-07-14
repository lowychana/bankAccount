package bankAccountArrays;

public class Checking extends BankAccount
{
	
	public Checking(int balance) 
	{
		super(balance);
	}
	// this is a dummy method
	@Override
	public void addInterest()
	{
		System.out.print("");
	}
	@Override 
	public void display()
	{
		System.out.printf("Checking account balance = %.2f", balance);
		System.out.println("");
	}
	@Override
	public void writeACheck(int checkAmount)
	{
		balance -= checkAmount;
		balance -= 1;
	}
}
