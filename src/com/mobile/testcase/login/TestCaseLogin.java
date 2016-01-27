package com.mobile.testcase.login;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCaseLogin {
	
	//@Parameters({"name"})
	public void testCaseLogin(String name){
		LoginUtil.waitForElement(By.name(name),60);
	
		
		
		
	}

}
