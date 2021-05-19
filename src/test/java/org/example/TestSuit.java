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
        homePage.clickOnRegisterButton();
        registerPage.enterRegistrationDetails();
        registerResultPage.verifyRegisterMessage();

    }
    @Test
    public void userShouldAbleToChangeCurrencySuccessFully(){
        //Verify user should able to change currency successfully
        //calling methods
        homePage.selectEuroCurrency();
        homePage.verifyChangeOfCurrencySymbolInEachProductPrice();

    }
    @Test
    public void userShouldAbleToSearchNikeProductsSuccessfully(){
        //Verify user able to search nike products successfully
        //calling methods
        homePage.nikeProducts();
        searchPageNike.searchNikeProducts();

    }
    @Test
    public void userShouldAbleToSeeAddToCArtButtonForAllProducts(){
        //Verify user should able to see add to cart button for all products.
        //calling all methods
        homePage.addToCartButton();
        computerPage.clickOnSoftware();
        softwarePage.searchSoftwareProducts();
    }
    @Test
    public void userShouldAbleToSeeSuccessMessage(){
        //Verify user should able to see success message after adding comments
        //calling all methods
        homePage.clickOnOpenNewStore();
        newStoreOpenPage.typeNewComments();
        registerResultPage.verifyCommentAddedSuccessfully();
        registerResultPage.verifyCommentIsPresentInCommentBox();
        registerResultPage.verifyCommentsDisplayedLast();
        registerResultPage.verifyTitleIsPresentInCommentBox();

    }
}
