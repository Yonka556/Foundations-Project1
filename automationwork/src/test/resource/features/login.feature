<<<<<<< HEAD
Feature: Users of my bug catcher application should be able to log in to their respective home pages

    Scenario: As a manager I want to sign in so I can view my custom homepage
        Given   the employee is on the login page
        When    the manager enters his correct username
        When    the manager enters his correct password
        When    the employee clicks the login button
        Then    the manager should be logged into the manager home page

    Scenario: As a tester I want to sign in so I can view my custom homepage

        Given   the employee is on the login page
        When    the tester enters his correct username
        When    the tester enters his correct password
        When    the employee clicks the login button
=======
Feature: Users of my bug catcher application should be able to log in to their respective home pages

    Scenario: As a manager I want to sign in so I can view my custom homepage
        Given   the employee is on the login page
        When    the manager enters his correct username
        When    the manager enters his correct password
        When    the employee clicks the login button
        Then    the manager should be logged into the manager home page

    Scenario: As a tester I want to sign in so I can view my custom homepage

        Given   the employee is on the login page
        When    the tester enters his correct username
        When    the tester enters his correct password
        When    the employee clicks the login button
>>>>>>> 3d0b98e7029399d3af9fa85c3f57caccd89fad20
        Then    the tester should be logged in to the tester home page