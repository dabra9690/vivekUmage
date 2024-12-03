package com.page;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Home_page {
	private WebDriver driver;
	 private By headerSearch = By.xpath("//input[@id='huftproductsearch']");
	public Home_page(WebDriver driver) {
		this.driver=driver;
		
	}

	
	public String homePageTitle() {
		return driver.getTitle();
	}
	
	public SearchHeader searchProduct(String search) {
		
		
		driver.findElement(headerSearch).sendKeys(search,Keys.ENTER);
		return new SearchHeader(driver);
	
	}

}
