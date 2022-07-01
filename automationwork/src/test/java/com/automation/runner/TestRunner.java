package com.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.poms.Login;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resource/features/login.feature", glue="com/automation/steps")
public class TestRunner {

    public static WebDriver driver;
    public static Login login;

    @BeforeClass // this males the method execute before all the steps
    public static void setup(){
        // make sure to set the value for the key as the full relative path to the chromedriver.exe
        System.setProperty("webdriver.chrome.driver","src/test/resource/chromedriver.exe");
        driver = new ChromeDriver();
        login = new Login(driver);
    }

    @AfterClass // this makes the method execute after all the steps
    public static void teardown(){
        driver.quit();
    }
    
}
