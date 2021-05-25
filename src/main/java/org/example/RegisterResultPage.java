package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RegisterResultPage extends Utils {
    private By _registerResult = By.xpath("//div[@class='result']");
    private By _nikeProductResult = By.xpath("//div[@class='item-box']//h2[@class='product-title']");
    private By _newTitle = By.cssSelector("input#AddNewComment_CommentTitle");
    private By _newComment = By.cssSelector("#AddNewComment_CommentText");
    private By _commentButton = By.cssSelector("button.button-1.news-item-add-comment-button");
    private By _commentAddedSuccessfully = By.cssSelector("div.result");
    private By _commentPresent = By.cssSelector("div.comments");
    private By _totalComments = By.cssSelector("div.comment.news-comment");
    private By _loginButtonOnFacebook = By.xpath("//input[contains(@value,'Log In')]");
    private By _cookieMessage = By.xpath("//button[starts-with(@title,'Accept')]");

    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    String commentText = loadProperty.getProperty("Comment") + dateStamp();

    SoftAssert softAssert = new SoftAssert();

    public void verifyRegisterMessage() {
        //Verifying expected result with actual result by using assert
        Assert.assertEquals(getTextFromElement(_registerResult), "Your registration completed", "Your registration is not completed");
        //Printing the comments
        System.out.println("Your registration completed");
    }

    public void verifyCommentAddedSuccessfully() {
        //Verifying Actual result with Expected by using assert
        Assert.assertEquals(getTextFromElement(_commentAddedSuccessfully), "News comment is successfully added.", "Comment not successfully added");
        System.out.println(loadProperty.getProperty("CommentIsAdded"));
    }

   public void verifyCommentIsPresentInCommentBox() {
       //verifying comment is present
       Assert.assertTrue(getTextFromElement(_commentPresent).contains(commentText), "Comment is not present in comment box");
        System.out.println(loadProperty.getProperty("CommentIsPresent"));

    }

    public void verifyCommentsDisplayedLast() {
        //verifying comment display last
        List<WebElement> commentList = driver.findElements(_totalComments);
        //find last comment index from total comments
        int totalComments = commentList.size() - 1;
        String actualCommentInLast = commentList.get(totalComments).getText();
        //using assert equal
        Assert.assertEquals(actualCommentInLast.contains(commentText), " New comment is not found at last");
        System.out.println(loadProperty.getProperty("NewCommentAddedLast"));
    }

    public void verifyAlertMessagePresentInAlertBox()
    {
        //switch to alert
        Alert alert = driver.switchTo().alert();
        //getting alert message
        String alertMessage = alert.getText();
        //Matching actual and expected result by using assert equal
        Assert.assertEquals(alertMessage, "Please enter some search keyword", "Alert message is not present");
        System.out.println(alertMessage);
        //click on ok to accept the alert
        driver.switchTo().alert().accept();
    }

    public void verifyLoginButtonPresentOnFacebookPage() {
        {  //click on facebook symbol

            //Main window
            String MainWindow = driver.getWindowHandle();
            //For Handling all new opened windows
            Set<String> s1 = driver.getWindowHandles();
            Iterator<String> i1 = s1.iterator();
            while (i1.hasNext()) {
                String ChildWindow = i1.next();
                //using if  condition
                if (!MainWindow.equalsIgnoreCase(ChildWindow)) {   //switch to child window
                    driver.switchTo().window(ChildWindow);
                    //click on cookie message
                    driver.findElement(_cookieMessage).click();
                    //verify login button is present or not
                    Assert.assertTrue(driver.findElement(_loginButtonOnFacebook).isDisplayed(), "Log in button is not present");
                    //close the child window
                    driver.close();
                }
            }
            //switch to main window
            driver.switchTo().window(MainWindow);

        }

    }
}


