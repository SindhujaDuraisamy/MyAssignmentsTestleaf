Feature: CreateLead functionality of Leaftaps
Scenario Outline: Created with multiple data

And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should navigate to the next page
When Click on CRMSFA link
And Click on Leads link
And Click on CreateLead link
And Enter the companyname as <companyname>
And Enter the firstname as <firstname>
And Enter the lastname as <lastname>
And Click on Create Lead button
Then Lead should be created

Examples:
|companyname|firstname|lastname|
|TestLeaf|Vineeth|Rajendran|
|Qeagle|Hari|Radha|