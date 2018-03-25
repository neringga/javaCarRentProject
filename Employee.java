
public class Employee extends RentObject {
	
	private String name;
	private String surname;
	private int salary;  
	
	public Employee(int salary) {
		super();
		this.salary = salary;
	}
	
	public void setName (String givenName) {
		this.name = givenName;
	}
	
	public String getName () {
		return name;
	}
	
	public void setSurname (String givenSurname) {
		this.surname = givenSurname;
	}
	
	public String getSurname () {
		return surname;
	}
	
	public int getEmployeeCode () {
		return generatedObjectCode;
	}
	
	

}
