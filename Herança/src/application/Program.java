package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		
		//Account acc = new Account(1001, "Alex", 0.0);
		
		//BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		//Account acc1 = bacc;
		
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccount bacc2 = (BusinessAccount) acc2;
		bacc2.loan(100.0);

		//BusinessAccount bacc3 = (BusinessAccount) acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount bacc3 = (BusinessAccount) acc3;
			bacc3.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		//Test
		Account ac1 = new Account (1001, "Alex", 1000.0);
		
		ac1.withdraw(200.0);
		System.out.println(ac1.getBalance());
		
		Account ac2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		ac2.withdraw(200.0);
		System.out.println(ac2.getBalance());
		
		Account ac3 = new BusinessAccount(1003, "João", 1000.0, 500.0);
		
		ac3.withdraw(200.0);
		
		System.out.println(ac3.getBalance());
		
		
	}

}
