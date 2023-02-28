Feature: This is for Home Page

  Background: 
    Given User is on retail website

  @dryTest
  Scenario: This is for Home Page test
    When User click on Sign in option
    Then User should be on signIn page

  @dryTest1
  Scenario: Verify Shop by Department sidebar
    When User click on All section
    Then Below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |
