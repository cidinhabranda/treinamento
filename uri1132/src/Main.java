import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int menor = x;
		int maior = y;
		
		if(x>y) {
			menor = y;
			maior = x;
		}
		
		int soma = 0;
		for (int i=menor; i<=maior; i++) {
			if(i % 13 !=0) {
				soma = soma +i;
			}
		}
				System.out.println(soma);
			
		
		
		sc.close();
	}

}