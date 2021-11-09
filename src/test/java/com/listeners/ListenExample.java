package com.listeners;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.testng.BrowserInit;

public class ListenExample implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure" + result);
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM--mm-ss");
		String strDate = "failedImg-" +formatter.format(date);
		
		try {
			BrowserInit.getScreenShot(strDate);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped" + result);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	public void onStart(ITestContext context) {
		System.out.println("onStart");

	}

	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
	}

}
