import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			int segundo = i*i;
			int terceiro = i*i*i;
			System.out.printf("%d %d %d%n", i, segundo, terceiro);
		}
		
		sc.close();
	}

}
