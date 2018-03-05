package com.effectivetesting.promotionpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

// TODO elegantize this
public class Browser {
	private static WebDriver driver;
	
	
	@Before
	public static void beforeLogin() {
		System.setProperty("webdriver.chrome.driver", "/home/natalia/chromedriver");
		driver = new ChromeDriver();
	}

	@After
	public static void afterLogin() {
		driver.close();
	}
	
	public static WebDriver getDriver() {
		return driver; 
	}

}
