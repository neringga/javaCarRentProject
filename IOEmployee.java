package mif.CarRent.file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import mif.CarRent.firm.Employee;

public class IOEmployee extends Employee implements IO {
	
	private ArrayList<Employee> employeeList;
	private FileWriter out = null;
	
	public IOEmployee (ArrayList<Employee> list) throws IOException {
		this.employeeList = list;
	}
	
	public void print(String OFile) throws IOException {
		out = new FileWriter(OFile);
		for (Employee employee : this.employeeList) {
			out.write(employee.getName() + " " + employee.getSurname() + " " + employee.getPosition());
			out.write("\r\n");
		}
		out.close();
	}
	
	public ArrayList<Employee> read (String IFile) throws IOException {
		
		ArrayList<Employee> listOfEmployee = new ArrayList<Employee>();
		Input input = new Input(IFile);
		String[] splitLine = input.takeListFromFile(input.bufferedReader);
		
		while (splitLine != null) {
			Employee newEmployee = new Employee();
			newEmployee.setName(splitLine[0]);
			newEmployee.setSurname(splitLine[1]);
			newEmployee.setSalary(Long.parseLong(splitLine[2]));
			if (splitLine[3].equalsIgnoreCase("manager")) newEmployee.setPosition(Position.manager);
			if (splitLine[3].equalsIgnoreCase("carServiceWorker")) newEmployee.setPosition(Position.carServiceWorker);
			if (splitLine[3].equalsIgnoreCase("ITspecialist")) newEmployee.setPosition(Position.ITspecialist);
			listOfEmployee.add(newEmployee);
			splitLine = input.takeListFromFile(input.bufferedReader);
		}
		
		input.bufferedReader.close();
		return listOfEmployee;
		
	}
}
