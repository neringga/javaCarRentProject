package mif.CarRent.file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import mif.CarRent.firm.Client;


public class IOClient extends Client implements IO {
	private ArrayList<Client> clientList;
	private FileWriter out = null;
	
	public IOClient (ArrayList<Client> list) {
		this.clientList = list;
	}

	public void print(String OFile) throws IOException {
		out = new FileWriter(OFile);
		for (Client client : this.clientList) {
			out.write(client.getName() + " " + client.getSurname() + " " + client.getDrivingLicenseNumber());
			out.write("\r\n");
		}
		out.close();
	}
	
	public ArrayList<Client> read(String IFile) throws IOException {
		ArrayList<Client> listOfClients = new ArrayList<Client>();
		Input input = new Input(IFile);
		String[] splitLine = input.takeListFromFile(input.bufferedReader);
		
		while (splitLine != null) {
			Client newClient = new Client();
			newClient.setName(splitLine[0]);
			newClient.setSurname(splitLine[1]);
			newClient.setDrivingLicenseNumber(Long.parseLong(splitLine[2]));
			listOfClients.add(newClient);
			splitLine = input.takeListFromFile(input.bufferedReader);
		}
		input.bufferedReader.close();
		return listOfClients;
	}
}
