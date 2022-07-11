package com.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.poms.Login;
import com.automation.poms.Manager;
import com.automation.poms.Tester;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/Arod1/OneDrive/Desktop/VSC/Maven/Foundations-Project1/automationwork/src/test/resource/features", glue="com/automation/steps")


public class TestRunner {

    public static WebDriver driver;
    public static Login login;
    public static WebDriverWait wait;
    public static Manager manager;
    public static Tester tester;

    @BeforeClass // this males the method execute before all the steps
    public static void setup(){
        // make sure to set the value for the key as the full relative path to the chromedriver.exe
        System.setProperty("webdriver.chrome.driver","src/test/resource/chromedriver.exe");
        driver = new ChromeDriver();
        login = new Login(driver);
        manager = new Manager(driver);
        tester = new Tester(driver);
    }

    @AfterClass // this makes the method execute after all the steps
    public static void teardown(){
        driver.quit();
    }

    public void clickButton() {
    }
    
}
