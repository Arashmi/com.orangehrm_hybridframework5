package com.orangehrm_hybridframework5.testCase;

import org.testng.annotations.Test;

import com.orangehrm_hybridframework5.pageObject.DashboardPage;
import com.orangehrm_hybridframework5.pageObject.LoginPage;
import com.oranghrm_hybridframework5.testBase.TestBase;

import junit.framework.Assert;

public class Login_TC001 extends TestBase{
	
	
	@Test
	public void loginTC_001() {
		try {
			LoginPage lp=new LoginPage(driver);
			lp.setUsername("Admin");
			lp.setPassword("admin123");
			DashboardPage dp=lp.clickOnLoginBtn();
			
		}catch(Exception e) {
			
		}
	}
	@Test
	public void loginTC_002() {
		try {
			LoginPage lp=new LoginPage(driver);
			lp.setUsername("Admin#");
			lp.setPassword("admin123");
			lp.clickOnLoginBtn();
			if(driver.getPageSource().contains("DashboardPage")) {
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue("Login Failed",false);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	
}
