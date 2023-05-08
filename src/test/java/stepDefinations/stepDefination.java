package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {
	
	@Given("^Validate the Browser$")
    public void validate_the_browser() throws Throwable {
        System.out.println("Deciding to Browser to open");
    }

    @When("^Browser is triggred$")
    public void browser_is_triggred() throws Throwable {
        System.out.println("Browser is triggred");
    }

    @Then("^Check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
       System.out.println("Browser is started");
    }
	
	 	@Given("^User is on Landaing page$")
	    public void user_is_on_landaing_page() throws Throwable {
	       System.out.println("Navigated to login URL");
	    }

	    @When("^User is login into application with username and password$")
	    public void user_is_login_into_application_with_username_and_password() throws Throwable {
	    	System.out.println("Navigated to username and password page");
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	       System.out.println("Home page is populated");
	    }

	    @And("^Cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	        System.out.println("Card page is displayed");
	    }
	    

	    @When("^User is login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_is_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	      System.out.println(strArg1);
	      System.out.println(strArg2);
	    }
	    @And("^Cards displayed are \"([^\"]*)\"$")
	    public void cards_displayed_are_something(String strArg1) throws Throwable {
	        System.out.println(strArg1);
	    }
	    
	    @When("^User signup with follwoing details:$")
	    public void user_signup_with_follwoing_details(DataTable data) throws Throwable {
	    List<List<String>> obj=data.asLists();
	    System.out.println(obj.get(0).get(0));
	    System.out.println(obj.get(0).get(1));
	    System.out.println(obj.get(0).get(2));
	    System.out.println(obj.get(0).get(3));
	    System.out.println(obj.get(0).get(4));
	    }
	    
	    @When("^User is login in to application with username (.+) and password (.+)$")
	    public void user_is_login_into_application_with_username_and_password(String username, String password) throws Throwable {
	        System.out.println(username);
	        System.out.println(password);
	    }
}
