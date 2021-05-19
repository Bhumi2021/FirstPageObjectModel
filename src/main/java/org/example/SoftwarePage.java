package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SoftwarePage extends Utils{
    private By _itemBoxesField=By.className("item-box");
    private By _addCartButtonField=By.cssSelector("button.button-2.product-box-add-to-cart-button");
    private By _productNameField=By.cssSelector("h2.product-title > a");

    public void searchSoftwareProducts(){
         List<WebElement> webElementList=driver.findElements(_itemBoxesField);
        //searching products with and without add to cart button
        int count=0,noButton=0;
        for(WebElement element : webElementList) {
            if (element.findElements(_addCartButtonField).size() == 1) {
                count++;
            }
            if (element.findElements(_addCartButtonField).size() != 1) {
                noButton++;
                System.out.println(element.findElement(_productNameField).getText() + "No add to cart button");
            }
        }

        Assert.assertEquals(count,webElementList.size(),"add to cart button should be"+webElementList.size()+"but it is"+count+"\n");
        System.out.println("Add to cart button is present in each product on this page");

    }
}
