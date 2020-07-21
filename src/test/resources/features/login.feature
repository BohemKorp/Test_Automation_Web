Feature: test login
  This feature test all workflow from the login page

  @Login
  Scenario Outline: User login by Travel and Tourism
    Given The user access login form
    When The user complete <company> , <email> and <password>
    And Press login button
    Then The user access is <result>
    Examples:
      | company                   | email  | password | result           |
      | AEROLINEAS ARGENTINAS (AR)| qatest | 12345    | Success          |
      | AEROLINEAS ARGENTINAS (AR)| none   | none     | IncorrectUser    |
      |                           |        |          | UserNull         |

  @GoForgotPassword
   Scenario: User go Password Reset
     Given The user access login form
     When The user press 'Forgot your password'
     Then is redirected to form Password Reset



   @GoSignUp
   Scenario: User go Create Account
     Given The user access login form
     When The user press 'Sign Up'
     Then is redirected to form Create Account


