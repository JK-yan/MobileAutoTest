package com.mobile.app.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumUtil {
	//封装的方法

	public static void WaitForElement(AndroidDriver driver, By by)
    {
		MobileElement targetElement = (MobileElement) (new WebDriverWait(driver,60)).until(ExpectedConditions.presenceOfElementLocated(by));
         
    }
	
	public static void click(AndroidDriver driver,By by){
		MobileElement element= (MobileElement) driver.findElement(by);
		element.click();
		}

	
	
}
