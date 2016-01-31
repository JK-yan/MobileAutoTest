package com.mobile.testcase.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
/**
 * 
 * @author zero
 * @ 获取登录页面控件路径
 */
public class LoginUtil {
	protected static AndroidDriver<AndroidElement> driver;
	//获取登录界面
public final static By LOGIN_BUTTON=By.name("登录或注册");
//获取账户密码输入框
public final static By USER_ACCOUNT=By.name("邮箱或手机号");
public final static By USER_PASSWORD=By.xpath("/android.widget.EditText/com.zhihu.android:id/password");
public final static By CREAT_ACCOUNT=By.xpath("/android.widget.Button/com.zhihu.android:id/btn_register[@text='注册']");
public final static By LOGIN_BUTTON1=By.name("登录");
}
