package steps;

import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.TelevisionLandingPageActions;
import utils.SeleniumDriver;

public class TelevisionLandingPageSteps 
{
	private TelevisionLandingPageActions _televisionLandingPageActions; 
	//TelevisionLandingPageActions televisionLandingPageActions = new TelevisionLandingPageActions();
	public TelevisionLandingPageSteps(TelevisionLandingPageActions televisionLandingPageActions )
	{
		_televisionLandingPageActions=televisionLandingPageActions;
	}
/*	
 @Given("^I launch \"([^\"]*)\" of Which website$")
	public void i_launch_of_Which_website(String websiteUrl) throws Throwable {
		
		SeleniumDriver.openPage(websiteUrl);
	}*/

	@When("^I am on television page$")
	public void i_am_on_television_page() throws Throwable {
	    
	}
	
	
	@Then("^\"([^\"]*)\" All television  tab should be selected$")
	public void all_television_tab_should_be_selected(String arg1) throws Throwable {
		boolean varBoolean = _televisionLandingPageActions.getAllTelevisionDataAttribute();
		Assert.assertTrue(varBoolean);
	}

	@Then("^\"([^\"]*)\" TV & home Entertainment option should be selected$")
	public void tv_home_Entertainment_option_should_be_selected(String arg1) throws Throwable {
		String  tvHomeStr = _televisionLandingPageActions.getMenuText();
		Assert.assertEquals(tvHomeStr, arg1);
	}
	
	

	@Then("^\"([^\"]*)\"Best Buys tab should be available on the page$")
	public void best_Buys_tab_should_be_available_on_the_page(String arg1) throws Throwable {
		String bestBuyStr = _televisionLandingPageActions.getBestBuyText();
		Assert.assertEquals(bestBuyStr, arg1);
	}

	@Then("^\"([^\"]*)\" Dont Buys tab should be available on the page$")
	public void dont_Buys_tab_should_be_available_on_the_page(String arg1) throws Throwable {
		String dontBuyStr = _televisionLandingPageActions.getDontBuyText();
		Assert.assertEquals(dontBuyStr, arg1);
	}

	@Then("^\"([^\"]*)\" Advice Guides tab should be available on the page$")
	public void advice_Guides_tab_should_be_available_on_the_page(String arg1) throws Throwable {
		String adviceStr = _televisionLandingPageActions.getAdviceGuideText();
		//_televisionLandingPageActions.lowToHigh();
		Assert.assertEquals(adviceStr, arg1);
	}
	
	@Then("^Page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String arg1) throws Throwable {
		String strGetTitle = _televisionLandingPageActions.getPageTitle();
		Assert.assertEquals(strGetTitle, arg1);
	}


	




	

	

	
	

	
	

}
