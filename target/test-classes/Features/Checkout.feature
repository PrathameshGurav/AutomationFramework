Feature: Search and place order for products

@placeOrder
Scenario Outline: Search experience for product search in both home and product page

Given Usre is on GreenKart landing page 
When Usre serach with shortname "<Name>" and extracyted actual name of product from homepage
And Added "3" items of selected product to cart
Then User proceeds to Checout and validate the "<Name>" items in checkout page
And verify user has ability to enter promo code and place order

Examples:
|Name|
|Tom |
 