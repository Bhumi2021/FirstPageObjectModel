package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class HomePage extends Utils{
    private By _register=By.cssSelector("a.ico-register");
    private By _euroCurrency=By.xpath("//select[contains(@id,'customerCurrency')]");
    private By _selectTextFromDropDown=By.cssSelector("select#customerCurrency");
    private By _findElements=By.xpath("//span[contains(@class,'price actual-price')]");
    private By _typeNike=By.xpath("//input[starts-with(@type,'text')]");
    private By _clickOnSearch=By.cssSelector("button.button-1.search-box-button");
    private By _clickOnComputer=By.xpath("//ul[@class='top-menu notmobile']//a[@href='/computers']");
    private By _clickOnNewStore=By.xpath("//a[contains(@class,'news-title')]");
    private By _clickFacebookSymbol=By.xpath("//li[contains(@class,'facebook')]");



    LoadProperty loadProperty=new LoadProperty();
    SoftAssert softAssert=new SoftAssert();


    //creating method for register button on homepage
    public void clickOnRegisterButton(){
        //putting wait for register button
        waitForClickable(_register,6000);
        //click on register button
        clickOnElement(_register);
    }
    //creating method for change currency

    public void selectEuroCurrency(){

        selectFromDropdownByVisibleText(_euroCurrency,loadProperty.getProperty("Currency2"));
    }
    public void verifyChangeOfCurrencySymbolInEachProductPrice() {
        //verifying currency symbol present in all products
        String currencyNameSelected = getSelectedTExtFromDropDown(_selectTextFromDropDown);
        String expectedCurrencySymbol = getCurrencySymbol(currencyNameSelected);
        List<WebElement> priceList = driver.findElements(_findElements);
        //using list
        for (WebElement element : priceList) {
            Assert.assertTrue(element.getText().contains(expectedCurrencySymbol));
            String priceSymbolActual = element.getText().substring(0, 1);
            softAssert.assertEquals(priceSymbolActual, expectedCurrencySymbol, "Currency symbol does not match");
        }
        softAssert.assertAll();
        System.out.println("Each product's Currency verify successfully");
    }
        //creating method for nike products
    public void nikeProducts(){
        //entering text Nike in search box
        enterText(_typeNike,loadProperty.getProperty("Search"));
        //click on search button
        clickOnElement(_clickOnSearch);
    }
    //creating method for add to cart button
    public void addToCartButton(){
       //click on computer menu on homepage
       clickOnElement(_clickOnComputer);
      // waitForClickable(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/computers']"),4000);
    }
    //creating method for click on new store
    public void clickOnOpenNewStore(){
        //click on New online store is open! on homepage
        clickOnElement(_clickOnNewStore);
    }
    public void clickOnSearchButton(){
        //click on search button on homepage
        clickOnElement(_clickOnSearch);

    }
    public void clickOnFacebookSymbol(){
        //click on facebook symbol
        clickOnElement(_clickFacebookSymbol);
    }
}
