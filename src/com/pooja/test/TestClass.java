package com.pooja.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

@Listeners({com.pooja.test.TestListner.class})
public class TestClass extends BaseClass{
 
	@Test
	public void testBooking(){
		homePage("1");
		searchPage("2");
		bookingPage("3");
	}

@BeforeTest
  public void beforeTest() {
	System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

}
