package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	public LoginPage() {
		//constructor	
	}
	
	public LoginPage enterUsername(String username) {
		clearAndType(locateElement("id", "username"), username);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		clearAndType(locateElement("id", "password"), password);
		return this;
	}
	
	public void clickLogin() {
		click(locateElement("class", "decorativeSubmit"));
	}
	
	/*public LoginPage enterUsername() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
		return this;
	}
	public LoginPage enterPassword() {
		driver.findElementById("password").sendKeys("crmsfa");
		return this;
	}
	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	} */

}
