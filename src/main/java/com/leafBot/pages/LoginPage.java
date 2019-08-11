package com.leafBot.pages;

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
	
	public HomePage clickLogin() {
		click(locateElement("class", "decorativeSubmit"));
		return new HomePage();
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
