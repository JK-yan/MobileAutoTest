package com.mobile.app.listener;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

import io.appium.java_client.AppiumDriver;



public class ScreenshortListener extends TestListenerAdapter{
 public static   AppiumDriver driver;
	@Override
	public void onTestFailure(ITestResult tr) {
		super.onTestFailure(tr);
		
		Screenshort(tr);
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		super.onTestSkipped(tr);
		
		Screenshort(tr);
	}

	@Override
	public void onTestSuccess(ITestResult tr) {
		super.onTestSuccess(tr);
		
	}

	@Override
	public void onTestStart(ITestResult tr) {
		super.onTestStart(tr);
	
	}

	@Override
	public void onFinish(ITestContext testContext) {
		super.onFinish(testContext);

	}
 public static void Screenshort(ITestResult tr){
	 try { 
		 //设置截图保存路径
	 File classpathRoot= new File(System.getProperty("user.dir"));
	 File file= new File(classpathRoot,"Screenshot");
	 if(!file.exists()){
		 file.mkdir();
	 }
	//截图
	File picture = driver.getScreenshotAs(OutputType.FILE);
	
	//拷贝截图到指定路径下并以当前时间命名
	    FileUtils.copyFile(picture, new File(file+getCurrentDateTime()+".jpg")); //commons-io-2.0.1.jar中的api
	} catch (IOException e) {
	    e.printStackTrace();
	}
	 
 }
 //获取当前时间点
 public static String getCurrentDateTime(){
	   SimpleDateFormat df = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");//设置日期格式
	   return df.format(new Date());
	}
}
