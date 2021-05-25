package org.example;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSuit extends BaseTest {
    //Creating object for all class
    HomePage homePage = new HomePage();
    RegisterPage registerPage=new RegisterPage();
    RegisterResultPage registerResultPage=new RegisterResultPage();
    SearchPageNike searchPageNike=new SearchPageNike();
    ComputerPage computerPage=new ComputerPage();
    SoftwarePage softwarePage=new SoftwarePage();
    NewStoreOpenPage newStoreOpenPage=new NewStoreOpenPage();
    @Test
    public void userShouldAbleToRegisterSuccessfully(){
        //Verify user should able to register successfully.
        //calling methods
        //click on register button
        homePage.clickOnRegisterButton();
        //enter register details
        registerPage.enterRegistrationDetails();
        //verify register message
        registerResultPage.verifyRegisterMessage();

    }
    @Test
    public void userShouldAbleToChangeCurrencySuccessFully(){
        //Verify user should able to change currency successfully
        //calling methods
        //select currency
        homePage.selectEuroCurrency();
        //verify symbol of currency
        homePage.verifyChangeOfCurrencySymbolInEachProductPrice();

    }
    @Test
    public void userShouldAbleToSearchNikeProductsSuccessfully(){
        //Verify user able to search nike products successfully
        //calling methods
        //type Nike
        homePage.nikeProducts();
        //search for Nike products
        searchPageNike.searchNikeProducts();

    }
    @Test
    public void userShouldAbleToSeeAddToCArtButtonForAllProducts(){
        //Verify user should able to see add to cart button for all products.
        //calling all methods
        homePage.addToCartButton();
        //click on software
        computerPage.clickOnSoftware();
        //search for software products
        softwarePage.searchSoftwareProducts();
    }
    @Test
    public void userShouldAbleToSeeSuccessMessage(){
        //Verify user should able to see success message after adding comments
        //calling all methods
        //click on Open online new store
        homePage.clickOnOpenNewStore();
        //type comment
        newStoreOpenPage.typeNewComments();
        //verify comment added successfully
        registerResultPage.verifyCommentAddedSuccessfully();
        //verify comment present in box
        registerResultPage.verifyCommentIsPresentInCommentBox();
        //verify comment present last
        registerResultPage.verifyCommentsDisplayedLast();
    }
    @Test
    public void userShouldAbleToSeeAlertMessage(){
        //click on search button
        homePage.clickOnSearchButton();
        //verify alert message
        registerResultPage.verifyAlertMessagePresentInAlertBox();
    }
    @Test
    public void userShouldAbleToSeeLoginButtonOnFacebook(){
        //click on facebook symbol
        homePage.clickOnFacebookSymbol();
        //verify login button is present
        registerResultPage.verifyLoginButtonPresentOnFacebookPage();
    }
}
