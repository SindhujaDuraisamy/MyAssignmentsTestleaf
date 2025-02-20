Feature: EditLead functionality of Leaftaps
Scenario Outline: Edit with multiple data


And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should navigate to the next page
When Click on CRMSFA link
And Click on Leads link
And Click on EditLead link
And Enter the Phone Number as <phonenumber>
When Click on Find Leads
When Click on Edit Link
And Enter the Updated Company Name as <companyname>
Then Lead should be edited

Examples:
|phonenumber|companyname|
|'99'|'TCS'|


