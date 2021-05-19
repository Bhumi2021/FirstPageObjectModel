package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.sql.Timestamp;
import java.util.List;

public class RegisterResultPage extends Utils{
    private By _registerResult=By.xpath("//div[@class='result']");
    private By _nikeProductResult=By.xpath("//div[@class='item-box']//h2[@class='product-title']");
    private By _commentAddedSuccessfully=By.xpath("//div[@class='result']");
    private By _commentTitle=By.xpath("//div[@class='comment-content']");
    private By _actualComment=By.xpath("//strong[@class='comment-text']");
    private By _newComment=By.xpath("//p[@class='comment-text']");
    private By _addTitle=By.xpath("//span[@class='stat-value']");
    Timestamp timestamp=new Timestamp(System.currentTimeMillis());

    SoftAssert softAssert=new SoftAssert();
  public void verifyRegisterMessage(){
      //Verifying expected result with actual result by using assert
      Assert.assertEquals(getTextFromElement(_registerResult),"Your registration completed","Your registration is not completed");
      //Printing the comments
      System.out.println("Your registration completed");
  }

  public void verifyCommentAddedSuccessfully(){
      //Verifying Actual result with Expected by using assert
      Assert.assertEquals(getTextFromElement(_commentAddedSuccessfully), "News comment is successfully added.", "Comment not successfully added");
      System.out.println("New comments is successfully added");
  }
  public void verifyTitleIsPresentInCommentBox(){
      //verifying title is present
      List<WebElement> commentList=driver.findElements(_addTitle);
      String expectedComment="NewStore";
      for (WebElement element:commentList)
      {
          softAssert.assertEquals(driver.findElement(_actualComment).getText(),expectedComment,"Title is not match");

      }
      System.out.println("Title comment is matched");
  }
  public void verifyCommentIsPresentInCommentBox(){
      //verifying comment is present
      List<WebElement> newCommentList=driver.findElements(_newComment);
      String expectedComment="Good products";
      for (WebElement element:newCommentList)
      {
          softAssert.assertEquals(driver.findElement(_newComment).getText(),expectedComment,"comment is not match");
      }
      System.out.println("Comment is matched");
  }

  public void verifyCommentsDisplayedLast(){
      //verifying comment display last
      Assert.assertEquals(driver.findElement(_commentTitle),driver.findElement(_commentTitle),"Comment box not found at last");
      System.out.println("Comment is present last");
  }

}


