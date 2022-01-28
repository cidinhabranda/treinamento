package entities;

public class Employee {
	
	public String Name;
	public double GrossSalary;
	public double Tax;
	public double NetSalary;
	public double percentage;
	
	public double NetSalary() {
		return GrossSalary - Tax;
	}
	
	public double IncreaseSalary() {
		
		
		return( NetSalary* percentage)/100;
	}
	
	}
	

				
	


