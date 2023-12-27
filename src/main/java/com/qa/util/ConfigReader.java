package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	/**
	 * This method is used to load the properties from config.properties file
	 * @return it returns Properties prop object
	 */
	public Properties init_prop() {

		Properties prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(ip);
			System.out.println();
			System.out.println();
			FileInputStream ip2 = new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(ip2);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return prop;

	}

}
