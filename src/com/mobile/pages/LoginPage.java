package com.mobile.pages;

import org.openqa.selenium.By;

public class LoginPage {
	//获取登录界面
public final static By LOGIN_BUTTON=By.name("登录或注册");
//获取账户密码输入框
public final static By USER_ACCOUNT=By.name("邮箱或手机号");
public final static By USER_PASSWORD=By.xpath("//android.widget.EditText[@resource-id='com.zhihu.android:id/password']");
public final static By CREAT_ACCOUNT=By.xpath("//com.zhihu.android:id/btn_register[@text='注册']");
public final static By LOGIN=By.xpath("//android.widget.Button[@text='登录']");
}
