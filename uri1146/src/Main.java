import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while (x != 0) {
		
		for (int i = 1; i<x; i++) {
			System.out.print(i + " ");
		}
		System.out.println(x);
		x = sc.nextInt();
		}
		
		sc.close();
	}

}
