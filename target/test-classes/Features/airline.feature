@E2E
Feature: To validate the Homepage Functionality
 
@first
Scenario: To validate the From and To credentials
Given The user should be in airline login page
When The user has enter from and to location
And to select a adult,child,infant details
And then click a search button
When click date of departure
Then The user should be see a Flight list


@second
Scenario: To check our client details
Given The user should be in airline page
When to click our branches button
And to take screenshot on first page what we see
And then scroll down then take another one screenshot
And then click a close button

@third
Scenario: to click and take airline pic
Given to go airline page
When to click and take pic on that particular picture


