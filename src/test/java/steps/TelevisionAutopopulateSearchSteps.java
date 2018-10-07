package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.SearchResultPageActions;
import pages.actions.TelevisionLandingPageActions;
import pages.locators.SearchResultPageLocators;
import utils.SeleniumDriver;

public class TelevisionAutopopulateSearchSteps 
{
	
	private TelevisionLandingPageActions _televisionLandingPageActions; 
	private SearchResultPageActions _searchResultPageActions;
	
	public TelevisionAutopopulateSearchSteps(TelevisionLandingPageActions televisionLandingPageActions,SearchResultPageActions searchResultPageActions )
	{
		_televisionLandingPageActions = televisionLandingPageActions;
		_searchResultPageActions = searchResultPageActions;
		
		
	}
	@Given("^I am on  Television Page_ \"([^\"]*)\"$")
	public void i_am_on_Television_Page_(String websiteUrl) throws Throwable {
		SeleniumDriver.openPage(websiteUrl);
	    
	}
	
	@When("^I go to search button$")
	public void i_go_to_search_button() throws Throwable {
		_televisionLandingPageActions.searchClick();
	}

	@When("^I enter \"([^\"]*)\"$")
	public void i_enter(String arg1) throws Throwable {
		_televisionLandingPageActions.searchSendClick(arg1);
	}
	
	


	@Then("^I should be able to select \"([^\"]*)\" from autopolulated list$")
	public void i_should_be_able_to_select_from_autopolulated_list(String arg1) throws Throwable {
		_televisionLandingPageActions.selectAutoSuggestOption(arg1);
	}

	@Then("^It Should diaplay search result of  \"([^\"]*)\" on search page$")
	public void it_Should_diaplay_search_result_of_on_search_page(String arg1) throws Throwable {
		 String s = _searchResultPageActions.getSearchText();
		    Assert.assertEquals(arg1, s);
	}


	

	

	

	

	

	
}
