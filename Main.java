package mif.CarRent.rent;

import java.io.IOException;


public class Main {
	
	public static void main(String[] args) throws IOException{
		
		UserMeniu userMeniu = new UserMeniu(args);
		userMeniu.userMeniu();
	}
}