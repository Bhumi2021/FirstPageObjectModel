package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {
    BrowserSelector browserSelector=new BrowserSelector();


    @BeforeMethod
    public void openBrowser() {
        //open the browser
        browserSelector.openBrowser();
        //open URL
        driver.get("https://demo.nopcommerce.com/");
    }

   @AfterMethod
   public void closeBrowser(ITestResult result) {
     //Capture screenSort when test case fail
      if (!result.isSuccess())
      {
           captureScreenShot(result.getName());
      }
      //close the URL
       driver.close();
  }
}