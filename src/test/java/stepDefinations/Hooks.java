package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@MobileTest")
	public void beforevalidation()
	{
		System.out.println("Mobile Before Hook");
	}
	
	@After("@MobileTest")
	public void afterevalidation()
	{
		System.out.println("Mobile after Hook");
	}

	@Before(" @WebTest")
	public void beforewebvalidation()
	{
		System.out.println("Before Web Validation Hook");
	}
	
	@After(" @WebTest")
	public void afterwebevalidation()
	{
		System.out.println("After Web Validation Hook");
	}

}
