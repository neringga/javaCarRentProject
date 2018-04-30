package mif.CarRent.file;

import java.io.IOException;
import java.util.ArrayList;

public interface IO {
	void print (String OFile) throws IOException;
	ArrayList<?> read (String IFile) throws IOException;
}


//factory patern