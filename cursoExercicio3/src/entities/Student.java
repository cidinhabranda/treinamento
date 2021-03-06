package entities;

public class Student {
	public String nome;
	public double notaA;
	public double notaB;
	public double notaC;

	public double somaNota() {
		return notaA + notaB + notaC;

	}

	public double diferenca() {
		return 60.00 - this.somaNota();

	}

	public String verficaAluno() {
		if (somaNota() >= 60) {

			return String.format("FINAL GRADE = %.2f%nPASS", this.somaNota());
		}
		return String.format("FINAL GRADE = %.2f%nFAILED%nMISSING %.2f POINTS", this.somaNota(), this.diferenca());

	}

}
