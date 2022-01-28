import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int horas, velocidade;
		double litros;

		horas = sc.nextInt();
		velocidade = sc.nextInt();

		litros = (horas * velocidade) / 12.00;

		System.out.printf("%.3f%n", litros);

		sc.close();

	}

}
