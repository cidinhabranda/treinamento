import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
Locale.setDefault(Locale.US);

int cod1 = sc.nextInt();
int qta1 = sc.nextInt();
double valor1 = sc.nextDouble();

int cod2 = sc.nextInt();
int qta2 = sc.nextInt();
double valor2 = sc.nextDouble();
double total;
total = valor1 * qta1 + valor2 * qta2;

System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

sc.close();
	}

}
