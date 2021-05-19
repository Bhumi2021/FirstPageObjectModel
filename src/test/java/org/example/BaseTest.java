package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {
    @BeforeMethod
    public void openBrowser() {
        //setting up chromedriver path from system
        System.setProperty("webdriver.chrome.driver","src/test/resources/BrowserDriver/chromedriver.exe");
        //creating object for driver
        driver = new ChromeDriver();
        //maximise the browser window
        driver.manage().window().maximize();
        //applying implicitly wait to driver object
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        //open URL
        driver.get("https://demo.nopcommerce.com/");
    }

   @AfterMethod
  public void closeBrowser() {
      //close the URL
       driver.close();
  }
}