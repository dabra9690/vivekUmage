package com.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

	private WebDriver driver;
	private By selectproductweight =By.xpath("//body[@class='gradient']");
	private By productprice=By.xpath("//span[@class='price-item price-item--sale price-item--last']");
	
	
	 public  ProductPage(WebDriver driver) {
	this.driver=driver;
	}

	 
	 
public String getprice() {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	 wait.until(ExpectedConditions.presenceOfElementLocated(selectproductweight)).click();
			 
			 
			 
	
	//driver.findElement(selectproductweight).click();
	String price=driver.findElement(productprice).getTagName();
	return price;
	
	}
}