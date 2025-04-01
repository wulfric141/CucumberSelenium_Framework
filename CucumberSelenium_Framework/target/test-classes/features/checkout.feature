Feature: place the order for products

 @PlaceOrder
 Scenario Outline: Search experiance for product search in both home page and offers page
 Given user is on greeenkart landing page
 When user search with shortname <vegName> and extracted actual name of product
 And Added "3" items of the selected product to cart
 Then user proceeds to checkout page and validate <vegName> items in checkout page
 And Verify user has ability to add promocode and place the order
 Examples:
 |vegName|
 |Tom|

	