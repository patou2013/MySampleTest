package com.TestNG;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
//	@Test(invocationTimeOut = 20,expectedExceptions = NumberFormatExcption.class)
//	public void infiniteLoopTest() {
//		int i = 1;
//		while(i==1) {
//			System.out.println(i);// bad code
//		}
//	}
	@Test(expectedExceptions = NumberFormatException.class)
	public void test1() {
		String x = "100A";
		Integer.parseInt(x);
	}

}
