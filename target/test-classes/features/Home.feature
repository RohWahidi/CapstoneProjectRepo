Feature: This is for Home Page

  @dryTest
  Scenario: This is for Home Page test
    Given User is on retail website
    When User click on Sign in option
    Then User should be on signIn page

  @dryTest1
  Scenario: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on All section
    Then Below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @dryTest2
  Scenario Outline: Verify department sidebar options
    Given User is on retail website
    When User click on All section
    And User on <department>
    Then Below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department    | optionOne                      | optionTwo                |
      | 'Electronics' | TV & Video                     | Video Games              |
      | 'Computers'   | Accessories                    | Networking               |
      | 'Smart Home'  | Smart Home Lightning           | Plugs and Outlets        |
      | 'Sports'      | Athletic Clothing              | Exercise & Fitness       |
      | 'Automotive'  | Automative Parts & Accessories | MotorCycle & Powersports |

  @dryTest3
  Scenario: Verify User can add an item to cart
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'rohwa4123@capstone.edu' and password 'cap56Pass23ROH@234'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then The cart icon quantity should change to '2'

  @dryTest4
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'rohwa4123@capstone.edu' and password 'cap56Pass23ROH@234'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    And The cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information
      | country       | fullName   | phoneNumber | streetAddress   | apt     | city    | state    | zipCode |
      | United States | John Smith |  8793674635 | 1740 E Michigan | Apt 120 | Lansing | Michigan |   23058 |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard   | expirationMonth | expirationYear | securityCode |
      | 4430345676342712 | Alex Pitters |               3 |           2025 |          413 |
    And User click on Add your card button
    And User click on Place Your Order
    Then A thank you message should be displayed 'Order Placed, Thanks'

  @dryTest5
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'rohwa4123@capstone.edu' and password 'cap56Pass23ROH@234'
    And User click on login button
    And User should be logged in into Account
    And User change category to 'Electronics'
    And User search for the item 'Apex Legends'
    And User click on Search icon
    And User click on the item
    And User select the quantity '5'
    And User click add to Cart button
    And Cart icon quantity should change to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then A thank you message should be displayed 'Order Placed, Thanks'
