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
When I do an addition calculation
Then the result should be 8

