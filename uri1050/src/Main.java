import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

int x = sc.nextInt();

String DDD;

if (x == 61) {
	DDD = "Brasilia";
} else if (x == 71) {
	DDD = "Salvador";
} else if (x == 11) {
	DDD = "Sao Paulo";
} else if (x == 21) {
	DDD = "Rio de Janeiro";
} else if (x == 32) {
	DDD = "Juiz de Fora";
} else if (x == 19) {
	DDD = "Campinas";
} else if (x == 27) {
	DDD = "Vitoria";
} else if (x == 31) {
	DDD = "Belo Horizonte";
} else {
	DDD = "DDD nao cadastrado";
}

System.out.println("" + DDD);

sc.close();
	}

}
