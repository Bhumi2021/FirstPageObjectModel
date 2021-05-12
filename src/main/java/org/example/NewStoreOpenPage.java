package org.example;

import org.openqa.selenium.By;

public class NewStoreOpenPage extends Utils{
    //creating method
    public void typeNewComments(){
        sleep(5000);
        //Type the title in box
        enterText(By.xpath("//input[@class='enter-comment-title']"),"NewStore");
        //Type the comment in box
        enterText(By.id("AddNewComment_CommentText"),"Good products");
        //add comment by clicking on add new comment
        clickOnElement(By.xpath("//button[@name='add-comment']"));
    }
}
