
package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageOne {
  
    private WebDriver driver; 

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
    
    @FindBy(id = "nameInput") 
    public WebElement usernameInput;

    
    @FindBy(id = "password")
    public WebElement passwordInput;

    
    @FindBy(tagName = "button")
    public WebElement loginButton;

    public PageOne(WebDriver driver){
        this.driver = driver; 

        
        PageFactory.initElements(driver,this);
  
    }

    
    public void enterUsername(String username){
        
        this.usernameInput.sendKeys(username);
    }

    
    public void enterPassword(String password){
        this.passwordInput.sendKeys(password);
    }
    // this method will make selenium click on our login button
    public void clickButton(){
            //to click on an element we just use the click() method
            this.loginButton.click();
    }

    public void nameInput(String string) {
    }

    public void alert() {
    }
}

