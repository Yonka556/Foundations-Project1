package com.automation.steps;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PageOneSteps{

    


    @Given( "Selenium has pulled up page one")
    public void Selenium_has_pulled_up_page_one(){
        // when telling selenium to get a local file you have to add File:// to the beginning of the url
        TestRunner.driver.get("File://C:/Users/Arod1/OneDrive/Desktop/VSC/Maven/Foundations-Project1/automationwork/src/test/resource/web-pages/PageOne.html");
    }

    @When("Selenium takes the random name and enters it in the input element")
    public void Selenium_takes_the_random_name_and_enters_it_in_the_input_element(){
       TestRunner.pageOne.nameInput("Joe");
    }



    @When("Selenium clicks the submit button for page one")
    public void Selenium_clicks_the_submit_button_for_page_one(){
        TestRunner.pageOne.clickButton();
    }

    @When("An alert should pop up with a success message for page one")
    public void An_alert_should_pop_up_with_a_success_message_for_page_one(){
        TestRunner.pageOne.alert();
    }
}

    