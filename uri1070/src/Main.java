import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		
		sc.close();
		
		if (x % 2 != 0) {
			
			//x = x + 2;			
			System.out.println(x);			
			
			x = x + 2;
			System.out.println(x);
			
			x = x + 2;
			System.out.println(x);
			
			x = x + 2;
			System.out.println(x);
			
			x = x + 2;
			System.out.println(x);
			
			x = x + 2;
			System.out.println(x);
			
		
		}
		
		if (x % 2 == 0) {
			
			x = x + 1;			
			System.out.println(x);
			
			x = x + 2;			
			System.out.println(x);
			
			x = x + 2;			
			System.out.println(x);
			
			x = x + 2;			
			System.out.println(x);
			
			x = x + 2;			
			System.out.println(x);
			
			x = x + 2;			
			System.out.println(x);			
			
			
			
		}
	}

}
