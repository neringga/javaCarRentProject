package mif.CarRent.rent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import mif.CarRent.file.IOAuto;
import mif.CarRent.file.IOClient;
import mif.CarRent.file.IOEmployee;
import mif.CarRent.firm.Auto;
import mif.CarRent.firm.Client;
import mif.CarRent.firm.Employee;

public class Preparation {
	
	Scanner scanner = new Scanner(System.in);
	private ArrayList<Client> listOfClients;       
	public ArrayList<Employee> listOfEmployees;
	public ArrayList<Auto> listOfCars;
	
	public Preparation(String[] args) throws IOException {
		IOClient clientInput = new IOClient(this.listOfClients);
		this.listOfClients = clientInput.read(args[0]);
		
		IOAuto autoInput = new IOAuto(this.listOfCars);
		this.listOfCars = autoInput.read(args[1]);
		
		IOEmployee employeeInput = new IOEmployee(this.listOfEmployees);
		this.listOfEmployees = employeeInput.read(args[2]);
	}
	
	public void addEmployee(Employee newEmployee) {
		listOfEmployees.add(newEmployee);
	}
	
	public void addClient(Client newClient) {
		listOfClients.add(newClient);
	}
	
	public void addAuto(Auto newAuto) {
		listOfCars.add(newAuto);
	}
	
	public ArrayList<Employee> getEmployeeList () {
		return this.listOfEmployees;
	}
	
	public ArrayList<Client> getClientList () {
		return this.listOfClients;
	}
	
	public ArrayList<Auto> getAutoList () {
		return this.listOfCars;
	}
}