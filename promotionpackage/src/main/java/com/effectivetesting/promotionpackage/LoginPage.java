package com.effectivetesting.promotionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver = Browser.getDriver();
	
	public LoginPage fillCred (String email, String pass){
		
		driver.get("http://0.0.0.0:5000/login/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("btn-submit")).click();
		return this;
	}
}
