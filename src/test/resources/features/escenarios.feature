#Author: Edward Sierra

  @regresion
Feature: Fill form on Colorlib
  As an user, I want to login in colorlib website and fill the form

  Scenario Outline: Login on colorlib website and fill the form
    Given I am on colorlibwebsite
    When I login with my credentials and fill the form
      | userLogin   | passwordLogin   | required   | email   | password   | cpassword   | date   | url   | digits   | range   |
      | <userLogin> | <passwordLogin> | <required> | <email> | <password> | <cpassword> | <date> | <url> | <digits> | <range> |
    Then I should see the title Popup Validation

    Examples:
      | userLogin | passwordLogin | required | email             | password | cpassword | date  | url                                                     | digits | range |
      ##@externaldata@./src/test/resources/datadriven/data.xlsx@data
   |demo   |demo   |prueba   |esierra@gmail.com   |53210   |53210   |34986   |https://colorlib.com/polygon/metis/form-validation.html   |123   |11|

    
  Scenario Outline: Login on colorlib website to verify requirement fields
    Given I am on colorlibwebsite
    When I login with my credentials and send the empty form
      | userLogin   | passwordLogin   |
      | <userLogin> | <passwordLogin> |
    Then I should see the message This field is required.

    Examples:
      | userLogin | passwordLogin |
      ##@externaldata@./src/test/resources/datadriven/data.xlsx@data2
   |demo   |demo|
