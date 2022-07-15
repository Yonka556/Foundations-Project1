
package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageTwo {
    
    @FindBy(id = "textInput")
    public WebElement defectInput;
    @FindBy(id = "testerName")
    public WebElement testerInput;
    @FindBy(id = "btn")
    public WebElement submitButton;


    public PageTwo(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void enterDefect(String defectId){
        this.defectInput.sendKeys(defectId); 
    }

    public void enterTester(String tester){
        this.testerInput.sendKeys(tester);
    }

    public void clickButton(){
        this.submitButton.click();
    }


}

