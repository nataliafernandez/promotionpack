package com.effectivetesting.promotionpackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;;

public class EntriesStepDef {
	private String entryname;
	private LoginPage login;
	private EntriesPage entry;
	

	
	@Given("^my entries$")
	public void my_entries() throws Exception {
		login = new LoginPage();
		login.fillCred("admin1@gmail.com", "admin1");
	}

	@When("^i select the entry \"([^\"]*)\"$")
	public void i_select_the_entry(String arg1) throws Exception {
		entryname = arg1;
		entry = new EntriesPage();
		entry.selectEntry(entryname);
		Thread.sleep(3000);
	}

	@Then("^the \"([^\"]*)\" form should appear$")
	public void the_entry_form_should_appear(String entryname) throws Exception {
		WebDriver driver = Browser.getDriver();
		Assert.assertEquals(driver.findElement(By.cssSelector("#content_title > h1")).getText(), entryname);
	}
	
}
