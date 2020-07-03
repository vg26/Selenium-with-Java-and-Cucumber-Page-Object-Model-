Feature: Registred user should be able to add product to cart

Scenario: Adding product to cart

Given User is already signed in
And User is on MyAccount page
When I click on the woman menu
And I'm on the products page
Then I will add product to cart
 