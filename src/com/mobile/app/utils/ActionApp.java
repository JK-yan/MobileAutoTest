package com.mobile.app.utils;


import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;

import com.mobile.app.res.GetAppDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ActionApp {
public AndroidDriver<MobileElement> driver;
	public void actionApp() throws Exception {
		
		 DesiredCapabilities capabilities = new DesiredCapabilities();
	     capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");         
	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "android");
	     capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "selendroid");     
	     //MX4的驱动器名字使用adb devices -l命令在CMD中获得
	     capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"750BBL622R4G");	     
	     //手机操作系统android版本
	    // capabilities.setCapability("deviceVersion","4.4");    
	     capabilities.setCapability(MobileCapabilityType.APP, GetAppDriver.getAppDriver("appname")); 	     
	     //要测试应用的包名
	     capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.ddt.pub");             
	     capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "org.zywx.wbpalmstar.engine.EBrowserActivity"); 	     
	     capabilities.setCapability("sessionOverride", true);  	     
	     //退出后，再次进入不需要重新安装
	     capabilities.setCapability("noReset", true);       	    
	     //appium想要支持中文输入，需要将unicodeKeyboard、resetKeyboard设置为true
	     capabilities.setCapability("unicodeKeyboard", "True");
	     capabilities.setCapability("resetKeyboard", "True");         
	     driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);  	  
	     System.out.println("应用连接完成");    		     
	 
		
		
		
		
	}
}
