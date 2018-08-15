package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chrome_driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}

	@Test()
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		
		//validation of title with assertion
		Assert.assertEquals(title, "Google","Title is not match");

	}
	
	@Test()
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(b);
	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();
		driver.close();

	}


}
