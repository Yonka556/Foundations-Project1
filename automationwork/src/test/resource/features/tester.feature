Feature: Users of my bug catcher application should be able to accept a defect and 

   Scenario: As a tester I want to be able to accept, fix, shelve or decline defects
    
       Given    the tester is on their correct home page
       When     the tester accepts the defect
       When     the tester declines the defect
       When     the tester fix the defect
       When     the tester shelves the defect
       Then     the tester returns to the login page

        
