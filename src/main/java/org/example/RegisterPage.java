package org.example;

import org.openqa.selenium.By;

import java.sql.Timestamp;

public class RegisterPage extends Utils {
    private By _newsletter=By.id("newsletter-subscribe-button");
    private By _gender=By.xpath("//input[@id='gender-male']");
    private By _firstName=By.id("FirstName");
    private By _lastName=By.id("LastName");
    private By _dateOfBirth=By.name("DateOfBirthDay");
    private By _dateOfMonth=By.name("DateOfBirthMonth");
    private By _dateOfYear=By.name("DateOfBirthYear");
    private By _emailId=By.id("Email");
    private By _company=By.id("Company");
    private By _password=By.id("Password");
    private By _confirmPassword=By.id("ConfirmPassword");
    private By _registerButton=By.name("register-button");
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
