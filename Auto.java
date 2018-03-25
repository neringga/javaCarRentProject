
public class Auto extends RentObject {
	
	private String licensePlate;
	private String carColor;
	private String carBrand;
	private int pricePerMin; 
	public boolean isCurrentlyAvailableToRent = true;
	
	public Auto (int pricePerMin) {
		super();
		this.pricePerMin = pricePerMin;
	}
	
	public int getCarCode () {
		return generatedObjectCode;
	}
	
	public void setLicensePlate (String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	public String getLicensePlate () {
		return licensePlate;
	}
	
	public void setCarColor (String x) {
		carColor = x;
	}
	
	public String getCarColor () {
		return carColor;
	}
	
	public void setCarBrand (String x) {
		this.carBrand = x;
	}
	
	public String getCarBrand () {
		return carBrand;
	}
	
	public void calculateCarPricePerMin () {
		
	}
	
	
	public int getCarPricePerMin () {
		return pricePerMin;
	}
	

}
