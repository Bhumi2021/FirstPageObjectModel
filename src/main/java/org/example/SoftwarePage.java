package org.example;

import org.openqa.selenium.By;

public class SoftwarePage extends Utils{
    public void searchSoftwareProducts(){
        //searching products with and without add to cart button
        productList(By.xpath("//div[@class='item-grid']//div[@class='item-box']"));
        //Using if else condition
       if (getTextFromElement(By.xpath("//button[@class='button-2 product-box-add-to-cart-button']")).contains("Add to cart"))
        {
            System.out.println("Add to cart");
        }
        else{
           System.out.println(getTextFromElement(By.xpath("//h2[@class='product-title']")).contains(" Add to cart button"));

        }

    }
}
