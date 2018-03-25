
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Client> listOfClients = new ArrayList<Client>();
		ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();
		ArrayList<Auto> listOfCars = new ArrayList<Auto>();
		Client client = new Client();
		Auto car = new Auto(18);
		Employee employee = new Employee(400);
		
		client.setName("John");
		client.setSurname("Smith");
		client.setDrivingLicenseNumber(123456);
		listOfClients.add(client);
		
		
		Client client2 = new Client();
		client2.setName("Eve");
		client2.setSurname("Smith");
		client2.setDrivingLicenseNumber(122221);
		listOfClients.add(client2);
		
		
		car.setCarBrand("Volvo");
		car.setCarColor("Black");
		car.setLicensePlate("ABC123");
		listOfCars.add(car);
		
		Auto car2 = new Auto(18);
		car2.setCarBrand("Lexus");
		car2.setCarColor("White");
		car2.setLicensePlate("AAA111");
		listOfCars.add(car2);
		
		employee.setName("Kevin");
		employee.setSurname("Durant");
		listOfEmployees.add(employee);
		
		System.out.println("Clients:");
		for (Client oneClient : listOfClients) {
			System.out.println(oneClient.getName());
			System.out.println(oneClient.getSurname());
			System.out.println(oneClient.getDrivingLicenseNumber());
		}

		System.out.println("Cars:");
		for (Auto oneCar : listOfCars) {
			System.out.println(oneCar.getCarBrand());
			System.out.println(oneCar.getCarColor());
			System.out.println(oneCar.getLicensePlate());
			System.out.println();
		}
		
		System.out.println("Employees:");
		for (Employee oneEmployee : listOfEmployees) {
			System.out.println(oneEmployee.getName());
			System.out.println(oneEmployee.getSurname());
			System.out.println(oneEmployee.getEmployeeCode());
			System.out.println();
		}
	}
}