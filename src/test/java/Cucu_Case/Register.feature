
@tag
Feature: Register

  @tag1
  Scenario Outline: Register in TestMeApp Application
  	Given User open the application
  	When User click sign_up button to register
  	And User enters the username as "s3"
  	And User enters first name as "sarumathi"
  	And User enters last name as "naren"
  	And User enters password as "Alex@123"
  	And User enters confirm password as "Alex@123"
  	And User enters gender as Male
  	And User enters e-mail as "saru@gmail.com"
  	And User enters mobileNumber as "9876543"
  	And User enters dob as "05/12/1998"
  	And User enters address as "machuvadi,chennai"
  	And User enters security question as "What is your Birth Place?"
  	And User enters answer as "chennai"
  	And User click register button  
  	And Login Page will display
  	And user enters the "<username>"  
   	And user enters the pwd "<password>"
   	And user clicks the Login
   	And user type first four letter of search product as "Head"
   	And user select the shown product
   	Then user add items into the cart
   	
   	Examples:
   	|username	|password|
   	|AlexUser1|Alex@123|
   	
