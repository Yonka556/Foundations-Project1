Feature: Users of my bug catcher application should be able to create a defect and assign it to the chosen tester

    Scenario: As a manager I want to assign a defect
        Given   the manager is on their correct home page
        When    the manager creates the defect in the text box
        When    the manager enters the testers username
        When    the manager clicks the submit button
        Then    the defect is sent to the tester and the manager returns to the login page

    