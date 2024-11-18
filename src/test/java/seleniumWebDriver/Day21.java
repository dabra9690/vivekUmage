package seleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*
 * 
 * launch driver 
 * open url https://demoopen.cart
 * validatete title should be "your store"
 * close browser
 * 
*/
public class Day21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //WebDriver driver=new ChromeDriver();
 
// WebDriver driver=new EdgeDriver();
		WebDriver driver=new FirefoxDriver();
 
 
 driver.get("https://demo.opencart.com");
 String act_title=driver.getTitle();
 
 if(act_title.equals("Your Store"))
 {
	 System.out.println("Test passed");
 }
 else {System.out.println("Test fail");
 }
	
	//new to upload
	//driver.quit();
	//driver.close();
	
	
	
	}
	
	


}
