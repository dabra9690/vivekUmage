package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.util.Constants;

public class HomeTailsTest extends BaseTest{
	@Test(priority=1)
	public void headtailsTitlevalidation() {
		
		String actualTitle =homepage.homePageTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, Constants.HEAD_TAILS_TITLE);
	}
	
	@Test(priority=2)
public void SearchAndGetPrice() {
	
	homepage.searchProduct("pedigree adult food");
	searchproduct.productDetails();
	//System.out.println("vivek");
	String prodcutprice=prodductdetailsprice.getprice();
	System.out.println(prodcutprice);
	String orginalprice=prodcutprice.replace('₹', '0').trim();
	Assert.assertEquals(prodcutprice, "602.60");
	
}
	public void productdetail() {
	
	}
}
