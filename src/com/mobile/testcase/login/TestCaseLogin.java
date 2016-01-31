package com.mobile.testcase.login;

import org.testng.annotations.Test;

import com.mobile.app.utils.ActionApp;
import com.mobile.app.utils.AppiumUtil;
import com.mobile.app.utils.Driver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Test
public class TestCaseLogin {
	
	public void login(AppiumUtil AppiumUtil){
		//AndroidDriver driver=new TestCaseLogin();
		ActionApp a=new ActionApp();//启动Appium 配置参数的页面
		AppiumUtil.WaitForElement(a.driver,LoginUtil.LOGIN_BUTTON1);
		AppiumUtil.click(a.driver, LoginUtil.LOGIN_BUTTON1);
		  
		
		
	}
}


