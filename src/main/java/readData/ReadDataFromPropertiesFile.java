package readData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		// Set up path for the file to be accessed
		FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
		
		//Create object for properties file
		Properties prop = new Properties();
		
		//Load the properties file
		prop.load(fis);
		
		//Read a data from properties file- Enter key name to get value
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		System.out.println(username);
		System.out.println(password);

	}
	
	

}
