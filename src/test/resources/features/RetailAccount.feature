Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'rhwahidi12@gmail.com' and password 'Roh12@pass4PASStek'
    And User click on login button
    And User should be logged in into Account
    And User click on Account option

  @smokeTest1
  Scenario: Verify User can update Profile Information
    And User update Name 'RohWahidiii' and Phone '7675776574'
    And User click on Update button
    Then A message should be displayed 'Personal Information Updated Successfully'

  @smokeTest2
  Scenario: Verify User can Update password
    And User enter below information
      | previousPassword      | newPassword        | confirmPassword    |
      | Roh12@pass4PASStek123 | Roh12@pass4PASStek | Roh12@pass4PASStek |
    And User click on Change Password button
    Then The message should be displayed 'Password Updated Successfully'

  @smokeTest3
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard   | expirationMonth | expirationYear | securityCode |
      | 4430345676342712 | Alex Pitters |               3 |           2025 |          413 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added successfully'

  @smokeTest4
  Scenario: Verify User can edit Debit or Credit card
    And User click on Edit option of card section
    And User edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 4400769647556630 | Jake Smith |               6 |           2026 |          745 |
    And User click on Update Your Card button
    Then Message should be displayed 'Payment Method updated Successfully'

  @smokeTest5
  Scenario: Verify User can remove Debit or Credit card
    And User click on remove option of card section
    Then Payment details should be removed

  @smokeTest6
  Scenario: Verify User can add an Address
    And User click on Add address option
    And User fill new address form with below information
      | country       | fullName   | phoneNumber | streetAddress   | apt     | city    | state    | zipCode |
      | United States | John Smith |  8793674635 | 1740 E Michigan | Apt 120 | Lansing | Michigan |   23058 |
    And User click Add Your Address button
    Then The pop-up message should be displayed 'Address Added Successfully'

  @smokeTest7
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And User fill new address form with below information2
      | country       | fullName      | phoneNumber | streetAddress        | apt    | city   | state   | zipCode |
      | United States | Maddy Fermine |  5482344765 | 5878 Michigan Avenue | Apt 12 | Phonix | Arizona |   14387 |
    And User click update Your Address button
    Then The message should be displayed on the screen 'Address Updated Successfully'

  @smokeTest8
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
