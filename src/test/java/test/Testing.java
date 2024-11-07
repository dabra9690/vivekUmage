package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {
	
	WebDriver driver;
	@Test
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void stevemadden() {
		
	//	driver.get("https://www.stevemadden.in");
		
	//	
		WebElement shopnow=driver.findElement(By.linkText("https://stevemadden.in/collections/its-spring"));
		
	//	Actions action=new Actions(driver);
	//	
		//action.moveToElement(shopnow).perform();
		
	}
	
}