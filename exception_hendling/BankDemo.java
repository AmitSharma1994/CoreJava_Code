package exception_hendling;

import java.io.*;

public class BankDemo {

	public static void main(String[] args) {
		CheckingAccount c = new CheckingAccount(101);
		System.out.println("Depositng $ 500...");
		c.deposit(500.00);
		try {
			System.out.println("\nwithdrawing$ 100...");
			c.withdraw(100.00);
			System.out.println("\nwithdrawing$600...");
			c.withdraw(600.00);
		} catch (InsufficientFundsException e) {
			System.out.println("sorry but you are short s" + e.getAmount());
			e.printStackTrace();
		}
	}
}

class InsufficientFundsException extends Exception {

	private double amount;

	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {

		return amount;
	}
}

class CheckingAccount {
	private double balance;
	private int number;

	public CheckingAccount(int number) {
		this.number = number;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance -= amount;
		}

		else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}

	public double getBalance() {
		return balance;

	}

	public int getNumber() {

		return number;
	}

}
