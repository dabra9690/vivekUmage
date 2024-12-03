package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public Properties prop;
	
	
	public WebDriver init_driver(Properties prop)
	
	{
		String browserName= prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("fireFoxe")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
	}
		else {
			System.out.println("Incorrect browser"+browserName);
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url1"));
		return driver;
}
	public Properties init_prop() {
		prop= new Properties();
		try {
			FileInputStream ip =new FileInputStream("src/test/resources /config/config.properties");
			prop.load(ip);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		return prop;

	}
	
}