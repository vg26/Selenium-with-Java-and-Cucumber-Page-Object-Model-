Feature: Registred and signed in user should be able to make an order

Scenario: Making an order

Given User is already signed in on page
And User has already added a product to the cart
When User proceed to checkout 
And User fill in all necessary information
Then User will create order