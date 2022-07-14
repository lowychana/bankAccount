package bankAccountArrays;

	public class Savings extends BankAccount
	{
		private double rate;
		
		public Savings(double balance, double rate)
		{
			super(balance);
			this.rate = rate;
		}
		@Override 
		public void display()
		{
			System.out.printf("Savings account balance = %.2f", balance);
			System.out.println("");
		}
		@Override
		public void addInterest()
		{
			balance += balance*rate;
		}
		// this is a dummy method 
		@Override
		public void writeACheck(int checkAmount)
		{
			System.out.print("");
		}
	}

