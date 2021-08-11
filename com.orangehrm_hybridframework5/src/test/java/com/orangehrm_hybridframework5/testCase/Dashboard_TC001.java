package com.orangehrm_hybridframework5.testCase;

import org.testng.annotations.Test;

import com.orangehrm_hybridframework5.pageObject.DashboardPage;
import com.orangehrm_hybridframework5.pageObject.LoginPage;
import com.oranghrm_hybridframework5.testBase.TestBase;

public class Dashboard_TC001  extends TestBase{
	@Test
	public void logoutTC_001() {
		LoginPage lp= new LoginPage(driver);
		lp.setUsername("Admin");
		lp.setPassword("admin123");
		DashboardPage dp=lp.clickOnLoginBtn();
		dp.clickOnLogoutLink();
	}

}
