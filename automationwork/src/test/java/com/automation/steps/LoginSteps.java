<<<<<<< HEAD
package com.automation.steps;

import org.junit.Assert;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps{

    /*
      User agnositc Steps Below
     */


    @Given( "the employee is on the login page")
    public void the_employee_is_on_the_login_page(){
        // when telling selenium to get a local file you have to add File:// to the beginning of the url
        TestRunner.driver.get("File://C:/Users/Arod1/OneDrive/Desktop/VSC/Maven/Foundations-Project1/automationwork/src/test/resource/web-pages/P1html-login.html");
    }

    @When("the employee clicks the login button")
    public void the_employee_clicks_the_login_button(){
       TestRunner.login.clickButton();
    }

    /*
      Manager Steps Below
     */

    @When("the manager enters his correct username")
    public void the_manager_enters_his_correct_username(){
        TestRunner.login.enterUsername("CeoOfDirtyINC");
    }

    @When("the manager enters his correct password")
    public void the_manager_enters_his_correct_password(){
        TestRunner.login.enterPassword("Ceo1");
    }

    @Then("the manager should be logged into the manager home page")
    public void the_manager_should_be_logged_into_the_manager_home_page(){
        // this method checks that my simulate manager has actually ended up on the manager page
       String title = TestRunner.driver.getTitle();
       Assert.assertEquals("Welcome to Dirty Inc. Login", title);
    }

  /*
    Tester steps below
   */
    @When("the tester enters his correct username")
    public void the_tester_enters_his_correct_username(){
        TestRunner.login.enterUsername("TesterOfDirtyINC");
    }

    @When("the tester enters his correct password")
    public void the_tester_enters_his_correct_password(){
        TestRunner.login.enterPassword("Tester1");
    }

    @Then("the tester should be logged in to the tester home page")
    public void the_tester_should_be_logged_in_to_the_manager_home_page(){
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Welcome to Dirty Inc. Login", title);

    
}
=======
package com.automation.steps;

import org.junit.Assert;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps{

    /*
      User agnositc Steps Below
     */


    @Given( "the employee is on the login page")
    public void the_employee_is_on_the_login_page(){
        // when telling selenium to get a local file you have to add File:// to the beginning of the url
        TestRunner.driver.get("File://C:/Users/Arod1/OneDrive/Desktop/VSC/Maven/Foundations-Project1/automationwork/src/test/resource/web-pages/P1html-login.html");
    }

    @When("the employee clicks the login button")
    public void the_employee_clicks_the_login_button(){
       TestRunner.login.clickButton();
    }

    /*
      Manager Steps Below
     */

    @When("the manager enters his correct username")
    public void the_manager_enters_his_correct_username(){
        TestRunner.login.enterUsername("CeoOfDirtyINC");
    }

    @When("the manager enters his correct password")
    public void the_manager_enters_his_correct_password(){
        TestRunner.login.enterPassword("Ceo1");
    }

    @Then("the manager should be logged into the manager home page")
    public void the_manager_should_be_logged_into_the_manager_home_page(){
        // this method checks that my simulate manager has actually ended up on the manager page
       String title = TestRunner.driver.getTitle();
       Assert.assertEquals("Welcome to Dirty Inc. Login", title);
    }

  /*
    Tester steps below
   */
    @When("the tester enters his correct username")
    public void the_tester_enters_his_correct_username(){
        TestRunner.login.enterUsername("TesterOfDirtyINC");
    }

    @When("the tester enters his correct password")
    public void the_tester_enters_his_correct_password(){
        TestRunner.login.enterPassword("Tester1");
    }

    @Then("the tester should be logged in to the tester home page")
    public void the_tester_should_be_logged_in_to_the_manager_home_page(){
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Welcome to Dirty Inc. Login", title);

    
}
>>>>>>> 3d0b98e7029399d3af9fa85c3f57caccd89fad20
}