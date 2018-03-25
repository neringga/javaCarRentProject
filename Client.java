
public class Client extends RentObject {
	
	private String name;
	private String surname;
	private int drivingLicenseNumber;
	
	public Client () {
		super();
	}
	
	public int getClientCode () {
		return generatedObjectCode;
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
	
	public void setDrivingLicenseNumber (int givenLicenseNumber) {
		this.drivingLicenseNumber = givenLicenseNumber;
	}
	
	public int getDrivingLicenseNumber () {
		return drivingLicenseNumber;
	}
	

}
