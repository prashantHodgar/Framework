package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperty {

	public static String readPropertyFile(String value) throws Exception
	{
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Bhavesh\\eclipse-workspace\\Framework\\TestData\\config.properties");
		prop.load(file);
		return prop.getProperty(value);
	}
}
