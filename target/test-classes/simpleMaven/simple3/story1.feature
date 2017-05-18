Feature: user enters two integers in google
  In order to test addition and subtraction
  I create two scenarios, one for add and one for sub

Scenario: First sum
Given I go to google
When I enter two integers "22" and "33" and the operation "+" and hit enter
Then the sum of "55" appears

Scenario: First subtraction
Given I go to google
When I enter two integers "22" and "33" and the operation "-" and hit enter
Then the subtraction of "-11" appears