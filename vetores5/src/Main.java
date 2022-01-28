import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [] vet = new int[N];
		
		for(int i=0; i<N; i++) {
			vet[i] =sc.nextInt();
		}	
		double somaDosPares = 0.0;
		int quantidadeDePares = 0;
		for(int i=0; i<N; i++) {
			if(vet[i] % 2 == 0) {
				somaDosPares = somaDosPares + vet[i];
				quantidadeDePares = quantidadeDePares + 1;
			} 
		}
		if(quantidadeDePares == 0) {
			System.out.println("Nao havia nenhum numero par");
		}
		else {
			double media = somaDosPares/quantidadeDePares;
			System.out.printf("%.1f%n", media);
		}		
	
		sc.close();

	}

}
