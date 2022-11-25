@List @android
Feature: List Feature

  Background: Verify user successfully login when input valid email and password
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    Then user click button login


  @Longpress
  Scenario: long press in the list
    Given User click Humberger button
    When User click list
    Then User Choosing and long press in the list

  @Multiple
  Scenario: multiple tap in the list
    Given User click Humberger button
    When User click list
    Then User Choosing and Multiple tap in the list