package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		
		//read the data from config.properties file
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//creat a object of properties file
		Properties prop = new Properties();
		//make a file ready for read
		prop.load(fis);
		//read the paticular property from file
		String data = prop.getProperty("Browser");
		System.out.println(data);

	}

}
