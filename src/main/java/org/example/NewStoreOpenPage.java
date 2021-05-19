package org.example;

import org.openqa.selenium.By;

public class NewStoreOpenPage extends Utils{
    private By _typeTitle=By.xpath("//input[@class='enter-comment-title']");
    private By _typeComment=By.id("AddNewComment_CommentText");
   private By _clickAddNewComment =By.xpath("//button[@name='add-comment']");
    //creating method
    public void typeNewComments(){
        sleep(5000);
        //Type the title in box
        enterText(_typeTitle,"NewStore");
        //Type the comment in box
        enterText(_typeComment,"Good products");
        //add comment by clicking on add new comment
        clickOnElement(_clickAddNewComment);
    }
}
