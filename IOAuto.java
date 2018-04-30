package mif.CarRent.file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import mif.CarRent.firm.Auto;

public class IOAuto extends Auto implements IO{
	private ArrayList<Auto> carList;
	private FileWriter out = null;
	
	public IOAuto (ArrayList<Auto> carList) {
		this.carList = carList;
	}
	
	public void print(String OFile) throws IOException {
		out = new FileWriter(OFile);
		for (Auto auto : this.carList) {
			out.write(auto.getCarBrand() + " " + auto.getPricePerMin() + " " + auto.getLicensePlate());
			out.write("\r\n");
		}
		out.close();
	}
	
	public ArrayList<Auto> read (String IFile) throws IOException {
		ArrayList<Auto> listOfCars = new ArrayList<Auto>();
		Input input = new Input(IFile);
		String[] splitLine = input.takeListFromFile(input.bufferedReader);
		
		while (splitLine != null) {
			Auto newAuto = new Auto();
			newAuto.setPricePerMin(Integer.parseInt(splitLine[0]));
			newAuto.setLicensePlate(splitLine[1]);
			if (splitLine[2].equalsIgnoreCase("Ford")) newAuto.setBrand(Brand.Ford);
			if (splitLine[2].equalsIgnoreCase("Fiat")) newAuto.setBrand(Brand.Fiat);
			if (splitLine[2].equalsIgnoreCase("Toyota")) newAuto.setBrand(Brand.Toyota);
			listOfCars.add(newAuto);
			splitLine = input.takeListFromFile(input.bufferedReader);
		}
		input.bufferedReader.close();
		return listOfCars;
	}
}
