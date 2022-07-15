package com.automation.steps;

import org.junit.Assert;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageTwoSteps {
    

    @Given("Selenium has pulled up page two")
    public void Selenium_has_pulled_up_page_two(){
        TestRunner.driver.get("File://C:/Users/Arod1/OneDrive/Desktop/VSC/Maven/Foundations-Project1/automationwork/src/test/resource/web-pages/PageTwo.html");
    }

    @When("Selenium enters some text into the first input when it is visible")
    public void Selenium_enters_some_text_into_the_first_input_when_it_is_visible(){
        TestRunner.PageTwo.textInput("textInput");
    }

    @When("the manager enters the testers username")
    public void the_manager_enters_the_testers_username(){
        TestRunner.manager.enterTester("tester");

    }

    @When("the manager clicks the submit button")
    public void the_manager_clicks_the_submit_button(){
        TestRunner.manager.clickButton();
    }

    @Then("the defect is sent to the tester and the manager returns to the login page")
    public void the_defect_is_sent_to_the_tester_and_the_manager_returns_to_the_login_page(){
        TestRunner.driver.get("File://C:/Users/Arod1/OneDrive/Desktop/VSC/Maven/Foundations-Project1/automationwork/src/test/resource/web-pages/P1html-login.html");
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Welcome to Dirty Inc. Login", title);
    }

}

