Feature: Login

Scenario Outline: Login as admin with valid username and password
Given User should be in login page
When User logs in with <username> and <password>
Then Homepage should be displayed
And All the contents of homepage should be displayed

Examples:
|username			|password			|
|admin				|manager			|
|manager			|manager			|