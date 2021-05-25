package org.example;

import org.openqa.selenium.By;

import java.sql.Timestamp;

public class RegisterPage extends Utils {
    private By _newsletter=By.xpath("//button[contains(@id,'newsletter-subscribe-button')]");
    private By _gender=By.xpath("//input[starts-with(@id,'gender-male')]");
    private By _firstName=By.cssSelector("input#FirstName");
    private By _lastName=By.cssSelector("input#LastName");
    private By _dateOfBirth=By.xpath("//select[contains(@name,'DateOfBirthDay')]");
    private By _dateOfMonth=By.xpath("//select[contains(@name,'DateOfBirthMonth')]");
    private By _dateOfYear=By.xpath("//select[contains(@name,'DateOfBirthYear')]");
    private By _emailId=By.cssSelector("input#Email");
    private By _company=By.xpath("//input[starts-with(@name,'Company')]");
    private By _password=By.cssSelector("input#Password");
    private By _confirmPassword=By.cssSelector("input#ConfirmPassword");
    private By _registerButton=By.xpath("//button[text()='Register']");
    LoadProperty loadProperty=new LoadProperty();
      //Applying timestamp
       Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    public void enterRegistrationDetails(){
        sleep(4000);
        //applying the wait
       waitForClickable(_newsletter,6000);
       //click on gender
       clickOnElement(_gender);
       //type first name
       enterText(_firstName,loadProperty.getProperty("FirstName"));
       //Type last name
       enterText(_lastName,loadProperty.getProperty("LastName"));
       //Select date from dropdown box
       selectFromDropdownByVisibleText(_dateOfBirth,loadProperty.getProperty("DateOfBirthDay"));
       //Select month from dropdown box
       selectFromDropdownByVisibleText(_dateOfMonth,loadProperty.getProperty("DateOfBirthMonth"));
       //select year from dropdown box
        selectFromDropdownByVisibleText(_dateOfYear,loadProperty.getProperty("DateOfBirthYear"));
       //Type email
       enterText(_emailId,loadProperty.getProperty("Email")+timestamp.getTime()+"@gmail.com");
       //Type your company name
       enterText(_company,loadProperty.getProperty("Company"));
       //Type password
       enterText(_password,loadProperty.getProperty("Password"));
       //Type confirm password
       enterText(_confirmPassword,loadProperty.getProperty("ConfirmPassword"));
       //click on register button
       clickOnElement(_registerButton);

    }
}
