import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double delta =  B * B - 4 * A * C;
		
		if (A==0 || delta < 0) {
			System.out.println("Impossivel calcular");
		}
		
		else {
			double raiz1 =(-B - Math.sqrt(delta)) / (2 * A);
			double raiz2 =(-B + Math.sqrt(delta)) / (2 * A);
			
			
			System.out.printf("Raiz1 = %.5f%n", raiz1);
			System.out.printf("Raiz2 = %.5f%n", raiz2);
	
		}
		
		
		sc.close();
		

	}

}
