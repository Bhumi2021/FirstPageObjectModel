package org.example;

import org.openqa.selenium.By;

import java.sql.Timestamp;

public class RegisterPage extends Utils {
      //Applying timestamp
       Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    public void enterRegistrationDetails(){
        sleep(4000);
        //applying the wait
       waitForClickable(By.id("newsletter-subscribe-button"),6000);
       //click on gender
       clickOnElement(By.xpath("//input[@id='gender-male']"));
       //type first name
       enterText(By.id("FirstName"),"Prem");
       //Type last name
       enterText(By.id("LastName"), "Patel");
       //Select date from dropdown box
       selectFromDropdownByVisibleText(By.name("DateOfBirthDay"),"5");
       //Select month from dropdown box
       selectFromDropdownByIndex(By.name("DateOfBirthMonth"),2);
       //select year from dropdown box
       selectFromDropdownByValue(By.name("DateOfBirthYear"),"1919");
       //Type email
       enterText(By.id("Email"),"david"+timestamp.getTime()+"@gmail.com");
       //Type your company name
       enterText(By.xpath("//input[@name='Company']"),"A1Limited");
       //Type password
       enterText(By.id("Password"),"abc123");
       //Type confirm password
       enterText(By.id("ConfirmPassword"),"abc123");
       //click on register button
       clickOnElement(By.name("register-button"));






    }
}
