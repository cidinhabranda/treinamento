import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		String nome1 = sc.next();
		int idade1 = sc.nextInt();
		
		String nome2 = sc.next();
		int idade2 = sc.nextInt();
		
		double media = (idade1 + idade2) / 2.0;
		
		System.out.printf(" A idade media de %s e %s e de %.1f anos", nome1, nome2, media);
		
		sc.close();
	}

}