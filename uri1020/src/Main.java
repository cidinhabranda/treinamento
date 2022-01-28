import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, ano, meses, dias, resto;
		
		n = sc.nextInt();
		
		ano = n / 365;
		resto = n % 365;
		meses = resto / 30;
		dias = resto % 30;
		
		System.out.println(ano + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		sc.close();
		

	}

}
