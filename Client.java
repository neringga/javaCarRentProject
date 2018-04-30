package mif.CarRent.firm;

public class Client {
	
	private String name;
	private String surname;
	private long drivingLicenseNumber;
	
	public Client (long drivingLicenseNumber, String name, String surname) {
		this.drivingLicenseNumber = drivingLicenseNumber;
		this.name = name;
		this.surname = surname;
	}
	
	public Client () {
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
	
	public void setDrivingLicenseNumber (long drivingLicenseNumber) {
		this.drivingLicenseNumber = drivingLicenseNumber;
	}
	
	public long getDrivingLicenseNumber () {
		return this.drivingLicenseNumber;
	}
	

}

