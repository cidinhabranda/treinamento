import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		for( int i = 0; i <n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			if ( b == 0) {
			System.out.println("divisao impossivel");
			}
		
		else {
			double divisao = a/b;
			System.out.printf("%.1f%n", divisao);
		}
		}
		
		sc.close();
	}
}
		
		
	


