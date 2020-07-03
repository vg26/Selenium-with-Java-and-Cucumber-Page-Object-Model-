Feature: Login Functionality
 
Scenario: Login with Valid Credentials

 Given User is on Home Page
 When User Navigate to LogIn Page
 And User enters UserName and Password
 Then User should see MyAccount 
 