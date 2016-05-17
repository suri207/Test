package com.ActiTime.config;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class BaseExample {
    public static ExtentReports extent;
    public static ExtentTest test;
    
    final String filePath = "D:\\Seleneum\\PageObjectModal\\Extent.html";

    @AfterMethod
    protected void afterMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(LogStatus.FAIL, result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
        } else {
            test.log(LogStatus.PASS, "Test passed");
        }
        
        extent.endTest(test);        
        extent.flush();
    }
    
    @BeforeSuite
    public void beforeSuite() {
        extent = ExtentManager.getReporter(filePath);
    }
    
    @AfterSuite
    protected void afterSuite() {
        extent.close();
    }
}