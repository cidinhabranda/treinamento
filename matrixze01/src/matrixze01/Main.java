package matrixze01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][]Mat = new int[6][6];
		sc.close();
		
		for (int i=0; i<n;i++) {
			for (int j=0; j<i;j++) {
				Mat[i][j] = (i + 1) * 10;
			}
			
		}
		
		for (int i=0; i<6;i++) {
			for (int j=0; j<6;j++) {
				System.out.print(Mat[i][j]+ " | " );			
			}
			
			System.out.println();
		}
		
		
		

	}

}
