package com.mobile.testcase.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginUtil {
	public  static AndroidDriver driver;
	public static void waitForElement() {
	    WebDriverWait wait = new WebDriverWait(driver,60);
	    wait.until(new  ExpectedCondition<WebElement>(){
            @Override
            public WebElement apply(WebDriver d) {
                return d.findElement(by);
            }
        }).click();
      
	  }
	
	public static void implicitlyWait (int timeout){
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);  
	} 
	  

}
