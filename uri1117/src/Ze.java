import java.util.Locale;
import java.util.Scanner;

public class Ze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int contNota = 0;
		double somaNota = 0;
		double media = 0;
		
				
		do  {
			
			double nota = sc.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				contNota = contNota + 1;
				somaNota = somaNota + nota;			

			}

			if (nota < 0 || nota > 10) {
				System.out.println("nota invalida");
			}
		}while(contNota !=2);
		
		media = somaNota / contNota;
		
		
		
		
		System.out.printf("media = %.2f%n", media);
		sc.close();

	}

}
