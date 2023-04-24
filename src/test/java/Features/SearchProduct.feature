Feature: Search and place order for products

@OffersPage
Scenario Outline: Search experience for product search in both home and product page

Given Usre is on GreenKart landing page 
When Usre serach with shortname "<Name>" and extracyted actual name of product from homepage
Then User serached for "<Name>" shortname in offer page
And Validate productname in offer page matches with home  page

Examples:
|Name|
|Tom |
|Beet| 