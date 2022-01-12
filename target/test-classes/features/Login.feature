Feature: User Try to signup on amazon

  Scenario: User Sign up though amazon link
    When User try to sign up from web link
    And User click on sign up link
    Then User should redirected to signup link


