import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] Mat = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				Mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL:");

		for (int i = 0; i < N; i++) {

			System.out.print(Mat[i][i] + " ");
		}
		System.out.println();

		int cont = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (Mat[i][j] < 0) {
					cont = cont + 1;

				}
			}
		}

		System.out.println("QUANTIDADE DE NEGATIVOS = " + cont);

		sc.close();
	}

}
