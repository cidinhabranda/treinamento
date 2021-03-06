package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;

	public Account() {
		super();
	}

	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.00;
	}

}
