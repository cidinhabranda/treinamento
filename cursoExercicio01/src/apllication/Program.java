package apllication;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Retangulo retangulo;

		retangulo = new Retangulo();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rectangle width and heitght:");
		retangulo.Width = sc.nextDouble();
		retangulo.Height = sc.nextDouble();

		System.out.printf("AREA = %.2f%n", retangulo.area());
		System.out.printf("PERIMETER = %.2f%n", retangulo.Perimeter());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.Diagonal());

		sc.close();

	}

}
