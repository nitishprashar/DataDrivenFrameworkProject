package com.myOrganization.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.myOrganization.base.TestBase;

public class BankManagerLoginTest extends TestBase {
	
	
	@Test
	public void bankManagerLoginTest() throws InterruptedException {
		
		log.debug("Starting to execute testcase--- loginAsBankManager()");
		click("bmlBtn_CSS");
		Thread.sleep(2000);
		
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("aadCustBtn_CSS"))),"Failed testcase--- loginAsBankManager()");
		log.debug("Successfully executed testcase--- loginAsBankManager()");
		Reporter.log("Test case---addCustomer---successfully executed");
	}
	
	

}
