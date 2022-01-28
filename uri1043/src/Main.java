import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
float A, B, C, areaTrapezio, perimetroDoTriangulo ;
		
		
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		
		sc.close();
		
		if ((A < (float)(B+C)) && (B < (float)(A+C)) && (C < (float)(B+A))) {
			//perimetro Do Triangulo = a + b + c;
			//Area do trapezio = (a + b)*h/2
			perimetroDoTriangulo = A + B + C;
			System.out.printf("Perimetro = %.1f\n",perimetroDoTriangulo);
		
			
		}else {
			areaTrapezio = ((A + B) * C) / 2;
			System.out.printf("Area = %.1f\n",areaTrapezio);
			}
		
	}

}
