import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int fat = 1;
		for (int i =1; i<=N; i++) {
			fat = fat*i;
		}
		System.out.println(fat);
		
		sc.close();

	}

}
