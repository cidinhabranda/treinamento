import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	////cenario/////
	/*
	 1)leitura de  quantidade de entradas(nome , idade)
	 2)leitura do conjunto de nomes e idades
	 3)(logica) para de comaparar as idades de todas as pessoas dentro 
	 conjunto e descobrir a mais velha.
	 4)exibir a pessoa com a idade maior
	 
	 */
	
	/////////

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[]nomes = new String[N];
		int [] idades = new int[N];
		
		for (int i = 0; i < N; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();

		}
	int maiorIdade = idades[0];
	int posicaoMaiorIdade = 0;
	//logica
	for(int i=0; i<N; i++) {
		if(idades[i]> maiorIdade) {
			maiorIdade = idades[i];
			posicaoMaiorIdade = i;
		}
	}
	//cenario
	System.out.println("Pessoas mais velha:" + nomes[posicaoMaiorIdade]);
	
	sc.close();
		}
}
	
	
		

	


