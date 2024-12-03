package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchHeader {
	
	
	
	private WebDriver driver;
	By productdetail=By.xpath("//body[@class='gradient searchtap']");
	 public  SearchHeader(WebDriver driver) {
	this.driver=driver;
	}
	 
	 public void productDetails() {
		 driver.findElement(productdetail).click();
		 
		 
	 }
}
