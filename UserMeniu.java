package mif.CarRent.rent;

import java.io.IOException;
import java.util.Scanner;

import mif.CarRent.file.ClassFactory;
import mif.CarRent.file.IO;
import mif.CarRent.firm.Auto;
import mif.CarRent.firm.Client;
import mif.CarRent.firm.Employee;

public class UserMeniu extends Preparation{
	
	private Preparation preparation;
	private ClassFactory classFactory;
	
	public UserMeniu (String[] args) throws IOException{
		super(args);
		preparation = new Preparation(args);
		classFactory = new ClassFactory(args);
	}
	
	public void userMeniu() throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter command code:");
//		System.out.println("1 - ");
		System.out.println("1 - Add new client");
		System.out.println("2 - List of currently available cars that cost 18 ct per min");
		System.out.println("3 - List of currently available cars that cost 24 ct per min");
		System.out.println("4 - List of employees");
		System.out.println("5 - List of clients");
		System.out.println("6 - Print employee list to file");
		System.out.println("7 - Repeat codes");
		System.out.println("0 - End");
		
		int commandCode;
		while ((commandCode = scanner.nextInt()) != 0) {
			switch (commandCode) {
			case 1:
				Client newClient = new Client();
				System.out.print("Enter client name: ");
				newClient.setName(scanner.next());
				System.out.print("Enter client surname: ");
				newClient.setSurname(scanner.next());
				System.out.print("Enter driving license number: ");
				newClient.setDrivingLicenseNumber(scanner.nextLong());
				preparation.addClient(newClient);
				break;
			case 2:
				int availableCars = 0;
				for (Auto car : preparation.listOfCars) {
					if ( (car.isThisCarCurrentlyAvailableToRent() ) && (car.getPricePerMin() == 18) ) {
						System.out.println(car.getCarBrand());
						availableCars++;
					}
				}
				if (availableCars == 0) System.out.println("No available cars");
				break;
			case 3:
				int available24Cars = 0;
				for (Auto car : listOfCars) {
					if ( (car.isThisCarCurrentlyAvailableToRent() ) && (car.getPricePerMin() == 24) ) {
						System.out.println(car.getCarBrand());
						available24Cars++;
					}
				}
				if (available24Cars == 0) System.out.println("No available cars");
				break;
			case 4:
				for (Employee employee : listOfEmployees) {
					System.out.println(employee.getName() + " " + employee.getSurname() + " " + employee.getSalary());
				}
				break;
				
			case 7:
				System.out.println("Please enter command code:");
				System.out.println("1 - Add new client");
				System.out.println("2 - List of currently available cars that cost 18 ct per min");
				System.out.println("3 - List of currently available cars that cost 24 ct per min");
				System.out.println("4 - List of employees");
				System.out.println("6 - Repeat codes");
				System.out.println("0 - End");
				break;
				
			case 5:
				for (Client oneClient : preparation.getClientList()) {
					System.out.println(oneClient.getName() + " " + oneClient.getSurname());
				}
				break;
				
			case 6:
				System.out.println("Enter output file name:");
				String Ofile = scanner.next();
				IO printList = classFactory.getClass(preparation.listOfEmployees);
				if (printList != null) printList.print(Ofile);
		}
	}
	
	scanner.close();
	}
	
}
