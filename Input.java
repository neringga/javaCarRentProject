package mif.CarRent.file;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;



public class Input {
	public final BufferedReader bufferedReader;
	
	public Input(String file) throws IOException{
		FileInputStream inputFile = new FileInputStream(file);
		this.bufferedReader = new BufferedReader(new InputStreamReader(inputFile));
	}
	
	public String[] takeListFromFile (final BufferedReader bufferedReader) throws IOException {
		String line = bufferedReader.readLine();
		if (line != null) {
			String[] input = line.split(" ");
			return input;
		}
		else return null;
	}

}
