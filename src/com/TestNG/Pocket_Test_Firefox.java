package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pocket_Test_Firefox {
	
	
	WebDriver driver; 
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Software\\Firefox_driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chrome_driver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test()
	public void googleTitleTest() {
		String title =driver.getTitle();
		System.out.println(title);
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
		driver.close();
		
	}

}
