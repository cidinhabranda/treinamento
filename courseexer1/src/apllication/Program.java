package apllication;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args, String area) {
		// TODO Auto-generated method stub
		
		Retangulo retangulo;
		
		retangulo = new Retangulo();
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and heitght:");
		System.out.printf( "%.2fn" + retangulo.Width );
	
		System.out.printf("%.2fn" +  retangulo.Height);
	
	
		System.out.printf("AREA = %.2fn" + retangulo.area());
		System.out.printf("PERIMETER = %2.fn" + retangulo.Perimeter());
		System.out.printf("DIAGONAL = %2.fn" + retangulo.Diagonal() );
		
		
		
		
		sc.close();

	}

}
