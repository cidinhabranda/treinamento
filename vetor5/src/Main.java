import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] nomes = new String[N];
		
		for (int i=0; i<N; i++) {
			nomes[i] = sc.next();
		}
		System.out.println("Nomes lidos:");
		for(int i=0; i<N; i++) {
			System.out.println(nomes[i]);
		}
	
		sc.close();

	}

}
