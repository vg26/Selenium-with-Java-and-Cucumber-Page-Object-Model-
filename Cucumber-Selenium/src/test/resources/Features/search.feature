Feature: Without being registered and signed in user should be able to use the search functionality

Scenario: Finding the product through the search field 

Given User is on homepage 
When User writes t-shirts in search
And Click the search button
Then Matching products are shown


