package com.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchHeader {
	
	
	
	private WebDriver driver;
	private By productdetail=By.xpath("//body[@style='overflow: auto; display: block;']");
	 public  SearchHeader(WebDriver driver) {
	this.driver=driver;
	}
	 
	 public ProductPage productDetails() {
		 
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(productdetail)).click();
		 //driver.findElement(productdetail).click();
		 return new ProductPage(driver);
		 
	 }
}
