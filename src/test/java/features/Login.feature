Feature: Application Login 
  

 
 @WebTest
 Scenario: Home Page default Login 
 Given User is on Landaing page 
 When User is login into application with username "jin" and password "12345"
 Then Home page is populated 
 And Cards displayed are "True"
  
 @MobileTest 
 Scenario: Home Page default Login 
 Given User is on Landaing page 
 When User is login into application with username "john" and password "3456"
 Then Home page is populated 
 And Cards displayed are "False"
 
  @WebTest
 Scenario: Home Page default Login 
 Given User is on Landaing page 
 When User signup with follwoing details:
 |Jenny|123456789|jenny@abcd.com|India|98754785478|
 Then Home page is populated 
 And Cards displayed are "False"
 
  @SmokeTest
 Scenario Outline: Home Page default Login 
 Given User is on Landaing page 
 When User is login in to application with username <UserName> and password <Password>
 Then Home page is populated 
 And Cards displayed are "True"
 
 Examples:
|UserName|Password|
|User1   |Pass1   |
|User2   |Pass2 |
|User3   |Pass3   |
|User4   |Pass4   |
|User5   |Pass5   |