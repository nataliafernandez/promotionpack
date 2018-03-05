package com.effectivetesting.promotionpackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FormStepDef {
	private LoginPage login;
	private FormPage form;
	WebDriver driver = Browser.getDriver();
	
	@Given("^my entry form$")
	public void my_entry_form() throws Exception {
		login = new LoginPage();
		login.fillCred("admin1@gmail.com", "admin1");
		driver.get("http://0.0.0.0:5000/entries/first-entry/");
		
	}

	@When("^i fill the field name\"([^\"]*)\" email\"([^\"]*)\" URL\"([^\"]*)\" comment\"([^\"]*)\"$")
	public void i_fill_the_field_name_email_url_comment(String arg1, String arg2, String arg3, String arg4) throws Exception {
		form = new FormPage();
		form.fillForm(arg1, arg2, arg3, arg4);
	}

	@Then("^i submit the form and the alert \"([^\"]*)\" is shown$")
	public void i_submit_the_form_and_the_alert_is_shown(String arg1) throws Exception {
		Assert.assertEquals(driver.findElement(By.cssSelector(".alert-dismissable")).getText(), arg1);
		driver.findElement(By.className("close")).click();
	}
	
}
