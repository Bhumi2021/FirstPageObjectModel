package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    //creating method for register button on homepage
    public void clickOnRegisterButton(){
        //putting wait for register button
        waitForClickable(By.linkText("Register"),6000);
        //click on register button
        clickOnElement(By.linkText("Register"));
    }
    //creating method for change currency
    public void changeCurrency(){
        //selecting dollar currency from drop down
        selectFromDropdownByIndex(By.xpath("//select[@id='customerCurrency']"),0);
        productList(By.xpath("//div[@class='item-box']//span[@class='price actual-price']"));
        //selecting euro currency from dropdown box
        selectFromDropdownByIndex(By.xpath("//select[@id='customerCurrency']"),1);
        productList(By.xpath("//div[@class='item-box']//span[@class='price actual-price']"));
    }
    //creating method for nike products
    public void nikeProducts(){
        //entering text Nike in search box
        enterText(By.xpath("//input[@type='text']"),"Nike");
        //click on search button
        clickOnElement(By.xpath("//button[@type='submit']"));
    }
    //creating method for add to cart button
    public void addToCartButton(){
       //click on computer menu on homepage
       clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/computers']"));
       waitForClickable(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/computers']"),4000);
    }
    //creating method for click on new store
    public void clickOnOpenNewStore(){
        //click on New online store is open! on homepage
        clickOnElement(By.linkText("New online store is open!"));
    }
}
