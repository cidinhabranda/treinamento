import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		int soma = 0;
		Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int x3 = sc.nextInt();
		int x4 = sc.nextInt();
		int x5 = sc.nextInt();

		sc.close();

		if (x1 % 2 == 0) {
			soma = soma + 1;
		}
		if (x2 % 2 == 0) {
			soma = soma + 1;
		}
		if (x3 % 2 == 0) {
			soma = soma + 1;
		}
		if (x4 % 2 == 0) {
			soma = soma + 1;
		}
		if (x5 % 2 == 0) {
			soma = soma + 1;
		}
		System.out.println(soma + " valores pares");

	}

}
