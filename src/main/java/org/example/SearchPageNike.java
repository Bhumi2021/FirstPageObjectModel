package org.example;

import org.openqa.selenium.By;

public class SearchPageNike extends Utils{
    public void searchNikeProducts(){
        //searching nike products
        productList(By.xpath("//div[@class='item-box']//h2[@class='product-title']"));
    }
}
