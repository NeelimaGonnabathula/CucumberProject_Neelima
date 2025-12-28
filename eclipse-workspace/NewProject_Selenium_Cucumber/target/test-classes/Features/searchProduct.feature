Feature: Search and Place the order for Product

#Scenario: Search Experience for Product search both home and offeres page

#****basic expression****
#Given User is on GreenCart LoginPage
#When User Search With shortname "Tom" and extracted actual name from product
#Then User searched for samename "Tom" in offerspage
#And validate product name from landingpage and offers page


#****using regex expression****
#Given User is on GreenCart LoginPage
#When User Search With shortname Tom and extracted actual name from product
#Then User searched for samename Tom in offerspage
#And validate product name from landingpage and offers page

@SearchProduct
#******* Scenario Outline **********
Scenario Outline: Search Experience for Product search both home and offeres page

Given User is on GreenCart LoginPage
When User Search With shortname <Name> and extracted actual name from product
Then User searched for samename <Name> in offerspage
And validate product name from landingpage and offers page

Examples: 
 |Name|
 |Tom|

 
 

