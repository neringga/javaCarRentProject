package mif.CarRent.file;

import java.io.IOException;
import java.util.ArrayList;

import mif.CarRent.firm.Auto;
import mif.CarRent.firm.Client;
import mif.CarRent.firm.Employee;
import mif.CarRent.rent.Preparation;

public class ClassFactory extends Preparation{
	
	public ClassFactory (String[] args) throws IOException{
		super(args);
	}

	public IO getClass (ArrayList <?> list) throws IOException {
		
		Employee employee = new Employee();
		Client client = new Client();
		Auto auto = new Auto();
		
		if (list.get(0).getClass() == employee.getClass()) {
			return new IOEmployee(getEmployeeList());
		}
		else if (list.get(0).getClass() == client.getClass()) {
			return new IOClient(getClientList());
		}
		else if (list.get(0).getClass() == auto.getClass()){
			return new IOAuto(getAutoList());
		}
		else return null;
	}
	
}
