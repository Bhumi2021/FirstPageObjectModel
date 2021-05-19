package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class Utils extends BasePage{
    LoadProperty loadProperty=new LoadProperty();

    //method for wait for clickable
    public static void waitForClickable(By by,int time){
      WebDriverWait wait=new WebDriverWait(driver,time);
      wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    //method for click elements
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }
    //method for enter text
    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    // method for select from drop down by visible text
    public static void selectFromDropdownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    //method for select from drop down by index
    public static void selectFromDropdownByIndex(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }
    //method for select from drop down box by value
    public static void selectFromDropdownByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }
    public static String getSelectedTExtFromDropDown(By by) {
        Select select = new Select(driver.findElement(by));
        return select.getFirstSelectedOption().getText();
    }
    //method for get text from elements
    public static String getTextFromElement(By by) {

        return driver.findElement(by).getText();
    }
    //method for timestamp
    public static String timeStamp(By by){

        return driver.findElement(by).getText();
    }
    //method for list
    public static void productList(By by){
        List<WebElement> productList=driver.findElements(by);
        int number=productList.size();
        for (WebElement element :productList) {
           System.out.println(element.getText());
       }
    }
    //creating method for thread sleep
    public static void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getCurrencySymbol(String currencyName){
        String currencySymbol=null;
        //using switch

        switch (currencyName){
            case "US Dollar":
                currencySymbol="$";
                break;
            case "Euro":
                currencySymbol="€";
                break;
            default:
                System.out.println("Currency is not available");

        }
        return currencySymbol;
    }


}
