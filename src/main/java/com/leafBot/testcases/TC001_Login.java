package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001_Login extends ProjectSpecificMethods{
	
	@BeforeTest
	public void beforeTest() {
		testcaseName="TC001_Login";
		testcaseDec="Testcase";
		author="Karthik";
		category="Login";
	}
	
	@Test
	public void runLogin() {
		new LoginPage()
		.enterUsername("DemoSalesManager")
		.enterPassword("crmsfa")
		.clickLogin()
		.clickLogout();
		
		
	}

}
