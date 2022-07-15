
package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// this class is going to be my java version of my login webpage
public class Login {
    /*
      By defining what web elements you want you work with here instead of in the steps themselve we avoid
      writing "boilerplate" (think redundant/repetitve) code.
     */

    private WebDriver driver; //this driver will only be used internally so its class is private

    // these WebElements need to referenced in our steps so they are public

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
    //this tells the PageFactory to find the element with the id username and assign it to this field
    @FindBy(id = "username") 
    public WebElement usernameInput;

    // this tells the PageFactory to find the element with the id password and assign it to this field
    @FindBy(id = "password")
    public WebElement passwordInput;

    //this tell the PageFactory to find the first element created via button tags and assign it to this field
    @FindBy(tagName = "button")
    public WebElement loginButton;

    public Login(WebDriver driver){
        this.driver = driver; //this initalizes the private driver field

        /*
         The PageFactory class is provided by Selenium and it abstracts away from us the code that handles 
         initializing our WebElement fields. We simply provide the initElement() method with the private driver
         We initialize above, and the PageFactory handles he rest.
         */
        PageFactory.initElements(driver,this);
  
    }

    /*
      these methods are public so we can access them in the steps and the return type is void because the functions do not return
      any value they just interact with the webpage
     */

     //this method will allow both manager and tester to enter their usernames
    public void enterUsername(String username){
        //to enter a username into the input element we use the sendKeys method
        this.usernameInput.sendKeys(username);
    }

    //this method will allow both manager and tester to enter their passwords
    public void enterPassword(String password){
        this.passwordInput.sendKeys(password);
    }
    // this method will make selenium click on our login button
    public void clickButton(){
            //to click on an element we just use the click() method
            this.loginButton.click();
    }
}

