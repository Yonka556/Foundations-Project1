package com.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.poms.PageOne;
import com.automation.poms.PageTwo;
import com.automation.poms.Tester;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/Arod1/OneDrive/Desktop/VSC/Maven/Foundations-Project1/automationwork/src/test/resource/features", glue="com/automation/steps")


public class TestRunner {

    public static final String PageTwo = null;
    public static WebDriver driver;
    public static PageOne pageOne;
    public static WebDriverWait wait;
    public static PageTwo manager;
    public static Tester tester;

    @BeforeClass 
    public static void setup(){
        
        System.setProperty("webdriver.chrome.driver","src/test/resource/chromedriver.exe");
        driver = new ChromeDriver();
        pageOne = new PageOne(driver);
        manager = new PageTwo(driver);
        tester = new Tester(driver);
    }

    @AfterClass 
    public static void teardown(){
        driver.quit();
    }

    public void clickButton() {
    }
    
}


