package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Airindia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 {
		        // Set the path for the ChromeDriver
		 WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
		        
		        // Initialize the ChromeDriver
		        
		        
		        // Open the Air India website
		        driver.get("https://www.airindia.com/");
		        
		        // Maximize the browser window
		        driver.manage().window().maximize();
		        
		        // Create a wait object to handle dynamic elements
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		        try {
		            // Step 1: Click on the "Round Trip" radio button
		            WebElement roundTripRadioButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Round Trip']")));
		            roundTripRadioButton.click();

		            // Step 2: Enter "Delhi" in the "FROM" field
		            WebElement fromField = wait.until(ExpectedConditions.elementToBeClickable(By.id("from")));
		            fromField.clear();
		            fromField.sendKeys("Delhi");

		            // Select the first suggestion
		            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='ui-id-1']/li[1]"))).click();

		            // Step 3: Enter "Mumbai" in the "TO" field
		            WebElement toField = wait.until(ExpectedConditions.elementToBeClickable(By.id("to")));
		            toField.clear();
		            toField.sendKeys("Mumbai");

		            // Select the first suggestion
		            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='ui-id-2']/li[1]"))).click();

		            // Step 4: Select Departure Date
		            WebElement departureDateField = wait.until(ExpectedConditions.elementToBeClickable(By.id("depart-date")));
		            departureDateField.click();
		            WebElement departureDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='15']")));
		            departureDate.click();

		            // Step 5: Select Return Date
		            WebElement returnDateField = wait.until(ExpectedConditions.elementToBeClickable(By.id("return-date")));
		            returnDateField.click();
		            WebElement returnDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='22']")));
		            returnDate.click();

		            // Step 6: Click on the "Passenger(s)" dropdown and select "1 Adult"
		            WebElement passengersDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("passenger")));
		            passengersDropdown.click();
		            WebElement adultOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'1 Adult')]")));
		            adultOption.click();

		            // Step 7: Select Class as "Economy"
		            WebElement classDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("class")));
		            classDropdown.click();
		            WebElement economyOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Economy')]")));
		            economyOption.click();

		            // Step 8: Click the "Search" button
		            WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("search-btn")));
		            searchButton.click();

		            // Step 9: Verify the search results page is displayed
		            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchResults")));
		            System.out.println("Search results are displayed successfully.");

		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            // Close the browser
		            driver.quit();
		        }
		    }
		}

	}


