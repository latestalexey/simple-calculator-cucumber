#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Calculate With Two Operands
  Narrative: 
  As a student in elementary school
  I want a calculator that performs simple math operations on two operands
  So that I can complete my homework in a timely manner
  
  AC:
  - Calculator accepts two operands
  - Calculator is instructed which math operation to perform
  - Calculator doesnt need to handle error conditions

  Scenario: Add two operands
    Given the first operand is 5
    And the second operand is 3
    When I do a addition calculation
    Then the result should be 8

  Scenario Outline: Subtract two operands
    Given the first operand is <operand1>
    And the second operand is <operand2>
    When I do a subtraction calculation
    Then the result should be <result>

    Examples: 
      | operand1 | operand2 | result |
      |        8 |        2 |      6 |
      |        4 |        1 |      3 |
      |       22 |       16 |      6 |

  Scenario: Multiply two operands
    Given the operands:
      | operand1 | operand2 |
      |        3 |        6 |
    When I do a multiplication calculation
    Then the result should be 18

  Scenario Outline: Divide two operands
    Given the operands:
      | operand1   | operand2   |
      | <operand1> | <operand2> |
    When I do a division calculation
    Then the result should be <result>

    Examples: 
      | operand1 | operand2 | result |
      |        8 |        2 |      4 |
      |       21 |        7 |      3 |

    @notImplemented
    Examples: 
      | 15 | 0 |  |
