import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int km;
		double litros, consumo;
	
		
		km = sc.nextInt();
		litros = sc.nextDouble();
		
		consumo = km / litros;
		
		System.out.printf("%.3f km/l%n", consumo);
	
		
		sc.close();
	}

}
