Feature: Login page Automation of saucedemo app
Scenario: Check whether the login is successfull with the valid credentials
Given User is on login page 
When User enters valid Username and Password
And Clicks on Login Button
Then User should be Navigated to home Page 
And Close the browser