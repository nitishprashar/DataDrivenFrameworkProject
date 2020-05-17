package com.myOrganization.testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.myOrganization.base.TestBase;
import com.myOrganization.utilities.TestUtil;

public class OpenAccountTest extends TestBase {

	@Test (dataProviderClass=TestUtil.class, dataProvider="dp")
	public void openAccountTest(Hashtable<String, String> data ) throws InterruptedException {
		Thread.sleep(3000);
		click("openaccountBtn_CSS");
		select("customer_CSS",data.get("Customer"));
		select("currency_CSS",data.get("Currency"));
		click("processBtn_CSS");
		
		Alert alert= wait.until(ExpectedConditions.alertIsPresent());
		
		log.debug("Custommer account added---Alert validated");
		Reporter.log("Custommer account added---Alert validated");
		
		alert.accept();
		
	}
}
