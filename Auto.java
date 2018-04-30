package mif.CarRent.firm;

import java.awt.Color;

public class Auto extends Enumerators{
	
	private String licensePlate;
	private static Color color = Color.black;
	private Brand brand;
	private int pricePerMin; 
	public boolean isCurrentlyAvailableToRent = true;
	
	public Auto (int pricePerMin, String licensePlate, Brand brand) {
		this.pricePerMin = pricePerMin;
		this.licensePlate = licensePlate;
		this.brand = brand;
	}
	
	public Auto () {
	} 
	
	public void setPricePerMin (int pricePerMin) {
		this.pricePerMin = pricePerMin;
	}
	
	public void setBrand (Brand brand) {
		this.brand = brand;
	}
	
	
	public void setLicensePlate (String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	public String getLicensePlate () {
		return this.licensePlate;
	}
	
	public Color getCarColor () {
		return this.color;
	}
	
	public Brand getCarBrand () {
		return this.brand;
	}
	
	public int getPricePerMin () {
		return this.pricePerMin;
	}
	
	public boolean isThisCarCurrentlyAvailableToRent () {
		return this.isCurrentlyAvailableToRent;
	}


}