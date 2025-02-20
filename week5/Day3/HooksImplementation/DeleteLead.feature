Feature: DeleteLead functionality of Leaftaps
Scenario: Delete leads multiple data


And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should navigate to the next page
When Click on the CRMSFA link
And Click on Find Leads link
And Click on Phone link
And Enter the Phone Number of the lead as '9'
When Click on Find Leads button
And Find the leadId to be Deleted and click on Delete Link
And Click the Find Leads button again
Then Verify the Lead is deleted
