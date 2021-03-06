package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account = new Account();

		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		// account.setNumber(sc.nextInt());

		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		// account.setHolder(sc.nextLine());

		System.out.println("Is there na initial deposit (y/n)? ");

		char response = sc.next().charAt(0);

		if (response == 'y') {

			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);

		} else {

			account = new Account(number, holder);
		}

		System.out.println();
		System.out.println("Accout data:");
		System.out.printf("Accout %d, Holder: %s, Balance: $ %.2f", account.getNumber(), account.getHolder(),
				account.getBalance());

		System.out.println("");
		System.out.printf("Enter a deposit value: ");

		double balance = sc.nextDouble();
		account.deposit(balance);

		System.out.println("Updated accout data:");
		System.out.printf("Accout %d, Holder: %s, Balance: $ %.2f", account.getNumber(), account.getHolder(),
				account.getBalance());

		System.out.println("");
		System.out.println("Enter a withdraw value: ");

		balance = sc.nextDouble();

		account.withdraw(balance);

		System.out.println("Update account data:");
		System.out.printf("Accout %d, Holder: %s, Balance: $ %.2f", account.getNumber(), account.getHolder(),
				account.getBalance());

		sc.close();

	}

}
