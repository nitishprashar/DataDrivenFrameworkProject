package com.myOrganization.testcases;

import java.io.IOException;
import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.myOrganization.base.TestBase;
import com.myOrganization.utilities.TestUtil;

public class AddCustomerTest extends TestBase {
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void addCustomerTest(Hashtable<String, String> data) throws InterruptedException, IOException {
		
		if(!data.get("runmode").equalsIgnoreCase("Y")) {
			throw new SkipException("Skipping the test step as runmode for the test dat is NO");
		}
		
		
		log.debug("Executing Test case---addCustomer");
		
		//SoftAssertion failure
		
		//verifyEquals("abc","xyz");
		
		click("aadCustBtn_CSS");
		type("firstname_CSS", data.get("firstname"));
		type("lastname_CSS", data.get("lastname"));
		type("postcode_CSS", data.get("postcode"));
		click("addBtn_CSS");
		
		Alert alert= wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertTrue(alert.getText().contains(data.get("alerttext")));
		log.debug("Custommer added---Alert validated");
		Reporter.log("Custommer added---Alert validated");
		
		alert.accept();
		
		
		log.debug("Test case---addCustomer---successfully executed");
		Reporter.log("Test case---addCustomer---successfully executed");
		}
	
}
