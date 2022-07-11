package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tester {

    @FindBy(id = "Accepted")
    public WebElement acceptDefect;
    @FindBy(id = "Decline")
    public WebElement declineDefect;
    @FindBy(id = "Fix")
    public WebElement fixDefect;
    @FindBy(id = "Shelve")
    public WebElement AcceptedDefectId;
    @FindBy(id = "testerName")
    public WebElement testerInput;
    @FindBy(id  = "manager-page.html")
    public WebElement submitButton;
    @FindBy(id = "P1html-login.html")
    public WebElement logoutButton;
   

    public Tester(WebDriver driver){
        PageFactory.initElements((WebDriver) driver, this);
    }

   

    public void enterTester(String tester){
        this.testerInput.sendKeys(tester);
    }

    public void clickButton(){
        this.submitButton.click();
    }


}
    

