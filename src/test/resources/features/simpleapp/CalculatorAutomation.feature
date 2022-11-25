@Calculate @android
Feature: Calculator Automation

  Background: Verify user successfully login when input valid email and password
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    Then user click button login

  @Sum
  Scenario Outline: User Using calculator for +
    Given User input number1 <Number1>
    Given User input number2 <Number2>
    When User clik button calculate
    Then user expected <Hasil>
    Examples:
      | Number1 | Number2 | Hasil         |
      | 1       | 2       | "Hasil : 3"   |
      | 15      | 20      | "Hasil : 35"  |
      | 115     | 200     | "Hasil : 315" |

  @Min
  Scenario Outline: User Using calculator for -
    Given User input number1 <Number1>
    Given User input number2 <Number2>
    When User click drop down button
    Then User click substraction
    When User clik button calculate
    And User expected for subtraction <Hasil>
    Examples:
      | Number1 | Number2 | Hasil        |
      | 2       | 1       | "Hasil : 1"  |
      | 20      | 15      | "Hasil : 5"  |
      | 200     | 115     | "Hasil : 85" |

  @Distribution
  Scenario Outline: User Using calculator for /
    Given User input number1 <Number1>
    Given User input number2 <Number2>
    When User click drop down button
    Then User click distribution
    When User clik button calculate
    And User expected for distribution <Hasil>
    Examples:
      | Number1 | Number2 | Hasil       |
      | 4       | 2       | "Hasil : 2" |
      | 15      | 3       | "Hasil : 5" |
      | 100     | 4       | "Hasil : 25" |

  @Multi
  Scenario Outline: User Using calculator for *
    Given User input number1 <Number1>
    Given User input number2 <Number2>
    When User click drop down button
    Then User click multiplication
    When User clik button calculate
    And User expected for multiplication <Hasil>
    Examples:
      | Number1 | Number2 | Hasil         |
      | 1       | 2       | "Hasil : 2"   |
      | 10      | 20      | "Hasil : 200" |
      | 100     | 3       | "Hasil : 300" |

