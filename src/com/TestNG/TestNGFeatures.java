package com.TestNG;

import org.testng.annotations.Test;

public class TestNGFeatures {

	@Test
	public void loginTest() {
		System.out.println("login test");
		// int i =9/0;
	}

	@Test(dependsOnMethods = "loginTest")
	public void HomePageTest() {
		System.out.println("Homepage test");
	}

	@Test(dependsOnMethods = "loginTest")
	public void SearchPageTest() {
		System.out.println("Search test");
	}

	@Test(dependsOnMethods = "loginTest")
	public void registrationPageTest() {
		System.out.println("registartion page test");
	}

}
