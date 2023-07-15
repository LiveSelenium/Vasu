Feature: 60045 Zoom In

  @60045_TC1
  Scenario: Verify the user is able to login to OrangeHRM application
    Given User Launch Chrome Browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When User enters username as "Admin" and password as "admin123"
    When Click on Login button
    Then Page Title should be "OrangeHRM"

  
@60045_TC2
  Scenario: Verify the user is able to create an employee
    Given User Launch Chrome Browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When User enters username as "Admin" and password as "admin123"
    When Click on Login button
    Then Page Title should be "OrangeHRM"
    When Click on PIM link
  
  @60045_TC3
   Scenario Outline: Login Data Driven
    Given User Launch Chrome Browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And User enters username as "<username>" and password as "<password>"
    And Click on Login button
    Then Page Title should be "OrangeHRM"
    When User click on Logut drop
    And click on Logout link
    Then Page Title should be "OrangeHRM"
    And Close Browser
    When The user enter the <username> and <value>
    
    Examples:
    |username|password|value|
    |naresh  |admin   |vasu |
    |Admin   |admin123|