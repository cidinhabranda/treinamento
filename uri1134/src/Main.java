import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int contAlcool = 0;
		int contGasolina = 0;
		int contDiesel = 0;
		int combustivel = sc.nextInt();
		
		while (combustivel !=4) {
			
			combustivel = sc.nextInt();
			
			if (combustivel == 1) {
				contAlcool = contAlcool + 1;
				
			}
			if (combustivel == 2) {
				contGasolina = contGasolina + 1;
			
			}
			if ( combustivel ==3) {
				contDiesel = contDiesel + 1;
				
			}
		}

		
		 
		System.out.println("MUITO OBRIGADO");	
		System.out.println("Alcool: "+ contAlcool);
		System.out.println("Gasolina: "+ contGasolina);
		System.out.println("Diesel: "+ contDiesel);
		
		
		
		sc.close();
	}

}
