/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import java.io.File;
import org.testng.annotations.Test;
/**
 *
 * @author Uma
 */
public class ExtentReportDemo {
    
   @Test
    public void loginTest()
    {
        System.out.println("Login to Amazon");
        ExtentHtmlReporter reporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\Reports\\ExtentReportResults.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        ExtentTest logger = extent.createTest("loginTest");
        logger.log(Status.INFO, "Login to Amazon");
        logger.log(Status.PASS, "Title Verified");
        extent.flush();
        
        
        
        
    }
}
