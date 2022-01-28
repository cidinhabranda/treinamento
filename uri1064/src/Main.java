import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Locale.setDefault(Locale.US);
Scanner sc = new Scanner (System.in);

double valorPmedia = 0;
double media = 0;
int soma = 0;

double x1 = sc.nextDouble();
double x2 = sc.nextDouble();
double x3 = sc.nextDouble();
double x4 = sc.nextDouble();
double x5 = sc.nextDouble();
double x6 = sc.nextDouble();




sc.close();



if (x1 > 0) {
	soma = soma + 1;
	valorPmedia += x1;

}

if (x2 > 0) {
	soma = soma + 1;
	valorPmedia += x2;
	
}

if (x3 > 0) {
	soma = soma + 1;
	valorPmedia += x3;

}
if (x4 > 0) {
	soma = soma + 1;
	valorPmedia += x4;
	
}
if (x5 > 0) {
	soma = soma + 1;
	valorPmedia += x5;
	
}

if (x6 > 0) {
	soma = soma + 1;
	valorPmedia += x6;
}

media = valorPmedia/soma;

System.out.println(soma + " valores positivos");


System.out.printf("%.1f%n", media);


}



	}


