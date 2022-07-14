package bankAccountArrays;

public abstract class BankAccount 
{
	public double balance;
	public abstract void addInterest();
	public abstract void writeACheck(int checkAmount);
	public abstract void display();
	
	public BankAccount(double balance)
	{
		this.balance = balance;
	}
	public void deposit(int myDeposit)
	{
		this.balance += myDeposit; 
	}
	public void withdraw(int myWithdraw)
	{
		this.balance -= myWithdraw; 
	}
	}

