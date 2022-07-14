// Chana Lowy
// Bank Account Homework
// 2/13/22

package bankAccountArrays;
import java.util.ArrayList;

public class bankAccountArraysDriver 
{
	public static void main(String[] args) 
	{
		// create an array with space for four bank accounts
		BankAccount[] accounts = new BankAccount[3];
		
		accounts[0] = new Savings(1100, 0.05); 
		accounts[0].deposit(100);
		accounts[0].withdraw(200);
		((BankAccount) accounts[0]).addInterest();
		
		accounts[1] = new Checking(100);
		accounts[1].deposit(50);
		
		accounts[2] = new Checking(200);
		accounts[2].withdraw(100);
		accounts[2].deposit(75);
		((Checking) accounts[2]).writeACheck(50);
		
		for(int i = 0; i < accounts.length && accounts[i] != null; i++) 
		{
		accounts[i].display();
		}
		
		System.out.println("ArrayList Results:");
		ArrayList<BankAccount> myAccounts = new ArrayList<>();
		BankAccount savingsOne = new Savings(1100, 0.05);
		savingsOne.deposit(100);
		savingsOne.withdraw(200);
		savingsOne.addInterest();
		myAccounts.add(savingsOne);
		
		BankAccount checkingOne = new Checking(100);
		checkingOne.deposit(50);
		myAccounts.add(checkingOne);
		
		BankAccount checkingTwo = new Checking(200);
		checkingTwo.withdraw(100);
		checkingTwo.deposit(75);
		checkingTwo.writeACheck(50);
		myAccounts.add(checkingTwo);
		
		
		for(int i = 0; i < myAccounts.size(); i++) 
		{
			BankAccount account = myAccounts.get(i);
			account.display();
		}

}
}
