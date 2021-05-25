package org.example;

import org.openqa.selenium.By;

public class ComputerPage extends Utils{
    private By _clickSoftware=By.xpath("//img[contains(@alt,'Picture for category Software')]");
    public void clickOnSoftware(){
        sleep(2000);
        //click on software under computer menu
        //locator for software
        clickOnElement(_clickSoftware);
    }
}
