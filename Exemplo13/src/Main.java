import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double notaFinal = a + b;
		
		System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
		
		if (notaFinal< 60)  {
			System.out.println("REPROVADO");
		}
			
			
		sc.close();
				
				
	}
	
}


