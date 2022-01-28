import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] vet = new int[N];
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextInt();
		
		}
		for (int i=0; i<N; i++) {
		if (vet[i] % 2 == 0) {
			System.out.print(vet[i] + " ");
		}
		}
		System.out.println();
		int quantidadePares = 0;
		for (int i=0; i<N; i++) {
			if (vet[i] % 2 == 0) {
			quantidadePares = quantidadePares + 1;
			}
		}
		System.out.println(quantidadePares);
		
		sc.close();
		
	}
}
	

	
	


