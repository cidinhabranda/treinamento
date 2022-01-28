import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
int x = sc.nextInt();
String DDD;
switch (x) {
case 61:
DDD = "Brasilia";
break;
case 71:
	DDD = "Salvador";
	break;
case 11:
		DDD = "Sao Paulo";
	break;
case 21:
	DDD = "Rio de Janeiro";
	break;
case 32:
	DDD = "Juiz de Fora";
	break;
case 19:
	DDD = "Campinas";
case 27:
	DDD = "Vitoria";
	break;
case 31:
	DDD = "Belo Horizonte";
	break;
	default:
	DDD = "DDD nao cadastrado";
	break;
}
System.out.println("" + DDD);
sc.close();
		
	
	
}
	}


