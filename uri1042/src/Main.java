import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        //ler os valores e ap�s fazer testes para coloc�-los em ordem crescente
	        if ((a<b) && (b<c)){
	            System.out.println("" + a);
	            System.out.println("" + b);
	            System.out.println("" + c);
	            
	        }else
	            if ((a<c) && (c<b)){
	                System.out.println("" + a);
	                System.out.println("" + c);
	                System.out.println("" + b);
	            }else
	                if ((b<a)&&(a<c)) {
	                    System.out.println("" + b);
	                    System.out.println("" + a);
	                    System.out.println("" + c);
	                }else
	                    if ((b<c) && (c<a)) {
	                        System.out.println(""+ b);
	                        System.out.println("" + c);
	                        System.out.println("" + a);
	                    }else
	                        if ((c<a)&&(a<b)) {
	                            System.out.println("" + c);
	                            System.out.println("" + a);
	                            System.out.println("" + b);
	                        }else
	                            if ((c<b)&&(c<a)) {
	                                System.out.println(""+ c);
	                                System.out.println(""+ b);
	                                System.out.println("" + a);
	                            }System.out.println();
	                            
	                 sc.close();
	                //imprimir a linha em branco
	                System.out.println("" + a);
	                System.out.println("" + b);
	                System.out.println("" + c);
	                //imprimir os valores na ordem que foram lidos
	    }
	      
	}