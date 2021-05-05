package org.web.automation.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public static String readConfigProperty(String key) throws IOException {
		Properties prop = new Properties();
		File f = new File("./ConfigFiles/AppConfig.properties");
		FileReader fr = new FileReader(f);
		prop.load(fr);
		return prop.get(key).toString();
	}
	
	public static String readElementProperty(String key) throws IOException {
		Properties prop = new Properties();
		File f = new File("./ElementLocators/Locators.properties");
		FileReader fr = new FileReader(f);
		prop.load(fr);
		return prop.get(key).toString();
	}

}
