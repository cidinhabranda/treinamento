package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student;
		student = new Student();

		student.nome = sc.nextLine();

		student.notaA = sc.nextDouble();

		student.notaB = sc.nextDouble();

		student.notaC = sc.nextDouble();

		System.out.println(student.verficaAluno());

		sc.close();

	}

}
