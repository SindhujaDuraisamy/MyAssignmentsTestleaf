Feature: CreateLead functionality of Leaftaps

@Sanity
Scenario Outline: CreateLead with multiple data


And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should navigate to the next page
When Click on CRMSFA link
And Click on Leads link
And Click on CreateLead link
And Enter the companyname as <companyName>
And Enter the firstname as <firstName>
And Enter the lastname as <lastName>
And Click on Create Lead button
Then Lead should be created

Examples:
|companyName|firstName|lastName|
|TestLeaf|Vineeth|Rajendran|
|Qeagle|Hari|Radhakrishan|

