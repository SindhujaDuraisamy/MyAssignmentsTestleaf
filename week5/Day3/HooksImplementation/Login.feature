Feature: Login functionality of Leaftaps Application

Scenario: Login with valid credentials

And Enter the username as 'Demosalesmanager'
And Enter the password as crmsfa

When Click on the Login button

Then It should navigate to the next page

Scenario: Login with invalid credentials

And Enter the username as 'Demo'
And Enter the password as crmsfa

When Click on the Login button

But It throws error message
