package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.util.Constants;

public class HomeTailsTest extends BaseTest{
	@Test
	public void headtailsTitlevalidation() {
		
		String actualTitle =homepage.homePageTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, Constants.HEAD_TAILS_TITLE);
	}
	
	@Test
public void SearchAndGetPrice() {
	
	homepage.searchProduct("padigree adult food");
}
	public void productdetail() {
	
	}
}
