import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int n, resultado;
		n = sc.nextInt();
		
		resultado = 2*n;
		System.out.println(resultado + " minutos");
		
		
		sc.close();
	}

}
