package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SearchPageNike extends Utils{
    private By _itemBoxField=By.xpath("//div[starts-with(@class,'item-box')]");
    private By _proDuctNameField=By.cssSelector("h2.product-title");

    public void searchNikeProducts(){
        //searching nike products
        List<WebElement> webElementList=driver.findElements(_itemBoxField);
        int count=0;
        for (WebElement element:webElementList)
        {
            if (element.findElement(_proDuctNameField).getText().contains("Nike"))
            {
                System.out.println(element.findElement(_proDuctNameField).getText());
                count++;
            }else {
                System.out.println("No products match");
            }
        }
        Assert.assertEquals(count,webElementList.size(),"Nike word should be present in"+webElementList.size()+"but it is present in"+count+"\n");
        System.out.println("Nike word is present in all product title");
    }
}
