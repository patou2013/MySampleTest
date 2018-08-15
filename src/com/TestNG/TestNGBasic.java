package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasic {

	/*
	 * This is the progression of our code
	 * Setup system properties for chrome 
	 * Launch chrome browser 
	 * Enter URL 
	 * Login 
	 * Google title 
	 * test logout 
	 * Close chrome browser
	 * delete all cookies
	 */
	// Pre-conditions
	@BeforeSuite
	public void setUp() {
		System.out.println("Setup system properties for chrome");
	}

	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launch chrome browser");
	}

	@BeforeClass
	public void enterurl() {
		System.out.println("Enter URL");
	}

	@BeforeMethod
	public void login() {
		System.out.println("Login");
	}

	// Annotation for test
	@Test
	public void googleTitleTest() {
		System.out.println("Google title test");
	}
	@Test
	public void searchTest() {
		System.out.println("Search test");
	}
	@Test
	public void googleLogoTest() {
		System.out.println("Google logo test");
	}


	// post condition
	@AfterMethod
	public void logOut() {
		System.out.println("logout");
	}

	@AfterTest
	public void deleteAllCookies() {
		System.out.println("delete all cookies");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("Close chrome browser");
	}

	@AfterSuite
	public void generateTestReport() {
		System.out.println("Generate test report");
	}

}
