import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		for ( int i = 0; i < n; i++) {
			
		int x= sc.nextInt();
		int y = sc.nextInt();
		
		int soma = 0;
		int cont = 0;
		for(int j = x; cont < y; j++) {
			if (j % 2 != 0) {
				soma = soma + j;
				cont = cont + 1;
				
			}
		}
		
		System.out.println(soma);
		
			
		}
		sc.close();
	}
	
}
