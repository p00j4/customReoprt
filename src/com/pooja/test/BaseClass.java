package com.pooja.test;

import org.testng.Assert;

class BaseClass{
	public void bookingPage(String string) {
		Assert.assertEquals(1, 2); //failure should pass "bookingPage" which I can include in my test report
	}
	public void searchPage(String string) {
		Assert.assertEquals(3, 3);
	}
	public void homePage(String string) {
		Assert.assertEquals(22, 2);//failure should pass "homePage" which I can include in my test report
	}
}