Feature: Application Login 
 
@RegerssionTest
 Scenario: Home Page default Login 
 Given User is on Landaing page 
 When User is login into application with username "jin" and password "12345"
 Then Home page is populated 
 And Cards displayed are "True"
  
  
 