Feature: Login page feature

  Scenario: Login page title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "ParaBank | Welcome | Online Banking"

  Scenario: Forgot Password link
    Given user is on login page
    Then forgot your password link should be displayed

  Scenario: Login with correct credentials
    Given user is on login page
    When user enters username "swap8237"
    And user enters password "Swaraj8237$"
    And user clicks on Login button
    Then user gets the title of the page
    And page title should be "ParaBank | Accounts Overview"
