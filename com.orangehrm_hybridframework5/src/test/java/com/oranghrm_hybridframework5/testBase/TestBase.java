package com.oranghrm_hybridframework5.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestBase {
	
	public WebDriver driver;
	
   @BeforeTest
   @Parameters({"Browser","url"})
   	public void stUP(String br,String url) {
	   
	   if(br.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	   }else if(br.equals("Firefox")) {
		   WebDriverManager.firefoxdriver().setup();
		   driver=new FirefoxDriver();
	   }else if(br.equals("IE")) {
		   WebDriverManager.iedriver().setup();
		   driver=new InternetExplorerDriver();
	   }else {
		   System.out.println("Driver exe doesn't match with above any driver,pls check again");
	   }
	   driver.get(url);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }
   @AfterMethod
   public void tearDown() {
	   driver.quit();
	   
	
   }

}
