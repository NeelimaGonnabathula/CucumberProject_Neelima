Feature: Checkout a Product 

@Checkout
Scenario:  check if landing page and Checkout page has same product
 
Given User is on GreenCart LoginPage
When User Search With shortname Tom and extracted actual name from product 
 And added 4 items and added then to cart
 And click on checkout page link and proceed with checkout
 Then in checkoutpage check if landing page and Checkout page has same product 
 And Enter promo code as Promo1 and click on place order