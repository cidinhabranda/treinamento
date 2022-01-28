import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[]alunos = new String[N];
		double[]notasSemestre1 = new double[N];
		double[]notasSemestre2 = new double[N];
		
		for (int i=0; i<N; i++) {
			alunos[i] = sc.next();
			notasSemestre1[i]= sc.nextDouble();
			notasSemestre2[i]= sc.nextDouble();
		}
			System.out.println("Alunos aprovados:");
		for(int i=0; i<N; i++) {
			double media = notasSemestre1[i] + notasSemestre2[i]/2;
			if(media>=6.0) {
				System.out.println(alunos[i]);
			
		}
			
		}
		
		sc.close();

	}

}