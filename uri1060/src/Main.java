import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double x4 = sc.nextDouble();
		double x5 = sc.nextDouble();
		double x6 = sc.nextDouble();

		sc.close();
		int soma = 0;

		if (x1 > 0) {
			soma = soma + 1;
		}

		if (x2 > 0) {
			soma = soma + 1;
		}

		if (x3 > 0) {
			soma = soma + 1;
		}
		if (x4 > 0) {
			soma = soma + 1;
		}
		if (x5 > 0) {
			soma = soma + 1;

		}

		if (x6 > 0) {
			soma = soma + 1;
		}

		System.out.println(soma + " valores positivos");

	}

}
