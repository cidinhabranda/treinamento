import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int somaPar = 0;
		int somaImpar = 0;
		int somaPositivo = 0;
		int somaNegativo = 0;

		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int x3 = sc.nextInt();
		int x4 = sc.nextInt();
		int x5 = sc.nextInt();

		sc.close();

		if (x1 % 2 == 0) {
			somaPar = somaPar + 1;
		}

		if (x1 % 2 != 0) {
			somaImpar = somaImpar + 1;
		}

		if (x2 % 2 == 0) {
			somaPar = somaPar + 1;
		}
		if (x2 % 2 != 0) {
			somaImpar = somaImpar + 1;
		}
		if (x3 % 2 == 0) {
			somaPar = somaPar + 1;
		}
		if (x3 % 2 != 0) {
			somaImpar = somaImpar + 1;
		}
		if (x4 % 2 == 0) {
			somaPar = somaPar + 1;
		}
		if (x4 % 2 != 0) {
			somaImpar = somaImpar + 1;
		}
		if (x5 % 2 == 0) {
			somaPar = somaPar + 1;
		}
		if (x5 % 2 != 0) {
			somaImpar = somaImpar + 1;
		}

		if (x1 >= 0) {
			somaPositivo = somaPositivo + 1;

		}

		if (x1 < 0) {
			somaNegativo = somaNegativo + 1;

		}

		if (x2 > 0) {
			somaPositivo = somaPositivo + 1;

		}

		if (x2 < 0) {
			somaNegativo = somaNegativo + 1;

		}
		if (x3 >= 0) {
			somaPositivo = somaPositivo + 1;

		}

		if (x3 < 0) {
			somaNegativo = somaNegativo + 1;

		}

		if (x4 >= 0) {
			somaPositivo = somaPositivo + 1;

		}

		if (x4 < 0) {
			somaNegativo = somaNegativo + 1;

		}

		if (x5 >= 0) {
			somaPositivo = somaPositivo + 1;

		}

		if (x5 < 0) {
			somaNegativo = somaNegativo + 1;

		}

		System.out.println(somaPar + " valor(es) par(es)");
		System.out.println(somaImpar + " valor(es) impar(es)");

		System.out.println(somaPositivo + " valor(es) positivo(s)");
		System.out.println(somaNegativo + " valor(es) negativo(s)");
		
	}

}
