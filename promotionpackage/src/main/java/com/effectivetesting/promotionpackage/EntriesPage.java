package com.effectivetesting.promotionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntriesPage {
WebDriver driver = Browser.getDriver();
	
	public EntriesPage selectEntry (String entryname){
		driver.findElement(By.id("blog")).click();
		driver.findElement(By.partialLinkText(entryname)).click();
		return this;
	}
}
