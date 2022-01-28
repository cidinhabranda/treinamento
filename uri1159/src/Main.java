import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int soma = 0;
		int totalImpar = 0;
		int totalPar = 0;
		while (X != 0) {
			
			
			if(X % 2 == 0) {
				
				soma =  X;
				totalPar = totalPar + soma;
				soma = soma + 2;
				totalPar = totalPar + soma;
				soma = soma + 2;
				totalPar = totalPar + soma;
				soma = soma + 2;
				totalPar = totalPar + soma;
				soma = soma + 2;
				totalPar = totalPar + soma;
				soma = 0;
				System.out.println(totalPar);
			}
			
			
			if(X % 2 != 0) {
				soma =  X + 1;	
				totalImpar = totalImpar + soma;
				soma = soma + 2;
				totalImpar = totalImpar + soma;
				soma = soma + 2;
				totalImpar = totalImpar + soma;
				soma = soma + 2;
				totalImpar = totalImpar + soma;
				soma = soma + 2;
				totalImpar = totalImpar + soma;	
				soma = 0;
				System.out.println(totalImpar);
			}
	
			X = sc.nextInt();
		}
		sc.close();
		
		
	}

}
