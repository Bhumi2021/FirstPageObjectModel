package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class RegisterResultPage extends Utils{
  public void verifyRegisterMessage(){
      //Verifying expected result with actual result by using assert
      Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='result']")),"Your registration completed","Your registration is not completed");
      //Printing the comments
      System.out.println("Your registration completed");
  }
  public void verifyChangeCurrency(){
       //printing message
      System.out.println(" Currency symbol change for all products" );
  }
  public void verifyCommentAddedSuccessfully(){
      //Verifying Actual result with Expected by using assert
      Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='result']")), "News comment is successfully added.", "Comment not successfully added");
      System.out.println("New comments is successfully added");
  }
  public void verifyCommentIsPresentInCommentBox(){
      //verifying boolean condition
       boolean productDisplayed= driver.findElement(By.xpath("//div[@class='comment-content']")).isDisplayed();
       Assert.assertTrue(productDisplayed,"Comment is not displayed");
       System.out.println("Comments are displayed");
  }

  public void verifyCommentsDisplayedLast(){
      //verifying boolean condition
       boolean productDisplayedLast=driver.findElement(By.xpath("//span[@class='stat-value']")).isDisplayed();
       Assert.assertTrue(productDisplayedLast,"Comment is not displayed last ");
       System.out.println("Comment displayed last");
  }

}


