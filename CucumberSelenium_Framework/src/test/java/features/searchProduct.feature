Feature: Search and place the order for product

#Scenario: Search experiance for product search in both home page and offers page
 #Given user is on greeenkart landing page
 #When  user search with shortname "Tom" and extracted actual name of product
 #And   user searched for "Tom" shortname in offers page
 #Then validate product name in offers page matches with landing page
 
 @OfferPage
 Scenario Outline: Search experiance for product search in both home page and offers page
 Given user is on greeenkart landing page
 When  user search with shortname <vegName> and extracted actual name of product
 And   user searched for <vegName> shortname in offers page
 Then validate product name in offers page matches with landing page
 Examples:
 |vegName|
 |Tom|
 |Beet|