package mif.CarRent.firm;


public class Employee extends Enumerators {
	
	private String name;
	private String surname;
	private long salaryPerYear;
	private Position position;
	
	
	public Employee(long salaryPerYear) {
		this.salaryPerYear = salaryPerYear;
	}
	
	public Employee() {
		
	}
	
	public void setPosition (Position position) {
		this.position = position;
	}
	
	public Position getPosition () {
		return this.position;
	}
	
	public void setSalary (long salaryPerYear) {
		this.salaryPerYear = salaryPerYear;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return this.name;
	}
	
	public void setSurname (String surname) {
		this.surname = surname;
	}
	
	public String getSurname () {
		return this.surname;
	}
	
	public long getSalary () {
		return this.salaryPerYear;
	}
	
	

}

