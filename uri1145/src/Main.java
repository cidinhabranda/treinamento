import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		for (int i=1; i<=y; i++) {
			System.out.print(i);
			if (i % x == 0) {
				System.out.println();
			}
				
				else {
					System.out.printf(" ");
					
				}
			}
		sc.close();
		}
	}


