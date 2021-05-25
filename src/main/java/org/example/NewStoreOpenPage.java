package org.example;

import org.openqa.selenium.By;

public class NewStoreOpenPage extends Utils{
    private By _typeTitle=By.xpath("//input[contains(@class,'enter-comment-title')]");
    private By _typeComment=By.cssSelector("textarea#AddNewComment_CommentText.enter-comment-text");
    private By _clickAddNewComment =By.xpath("//button[contains(@name,'add-comment')]");
    //creating method
    String commentText = loadProperty.getProperty("Comment") + dateStamp();
  public void typeNewComments(){
      sleep(5000);
       //Type the title in box
       enterText(_typeTitle,loadProperty.getProperty("Title")+dateStamp());
      //Type the comment in box
     enterText(_typeComment,"Comment");
      //add comment by clicking on add new comment
      clickOnElement(_clickAddNewComment);
   }
}
