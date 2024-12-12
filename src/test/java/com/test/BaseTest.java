package com.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import com.base.BaseClass;
import com.page.Home_page;
import com.page.ProductPage;
import com.page.SearchHeader;

public class BaseTest {
	WebDriver driver;
	Properties prop;
	BaseClass bc;
	Home_page homepage;
	SearchHeader searchproduct;
	ProductPage prodductdetailsprice;
	@BeforeTest
	public void setup() {
		bc=new BaseClass();
		prop=bc.init_prop();
		driver=bc.init_driver(prop);
		homepage =new Home_page(driver);
		searchproduct =new SearchHeader(driver);
		prodductdetailsprice=new ProductPage(driver);
	}
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}

}
