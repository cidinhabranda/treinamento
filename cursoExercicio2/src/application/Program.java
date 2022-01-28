package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee;
		employee = new Employee();

		System.out.print("Name: ");
		employee.Name = sc.nextLine();

		System.out.printf("Gross salary: ", employee.GrossSalary);
		employee.GrossSalary = sc.nextDouble();

		System.out.printf("Tax: ", employee.Tax);
		employee.Tax = sc.nextDouble();
		System.out.println();

		System.out.println(" Employee: Joao Silva, $ 5000.00");
		System.out.println();
		System.out.printf("Which percentage to increase salary? ", employee.percentage);
		employee.percentage = sc.nextDouble();
		System.out.println();
		System.out.println("Update data: Joao Silva, $ 5600.00");

		sc.close();

	}

}
