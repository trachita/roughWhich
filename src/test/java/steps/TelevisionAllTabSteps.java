package steps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.TelevisionLandingPageActions;
import utils.SeleniumDriver;
import utils.TelevisionItem;

public class TelevisionAllTabSteps {

	private TelevisionLandingPageActions _televisionLandingPageActions; 
	//TelevisionLandingPageActions televisionLandingPageActions = new TelevisionLandingPageActions();
	
	public TelevisionAllTabSteps(TelevisionLandingPageActions televisionLandingPageActions )
	{
		_televisionLandingPageActions=televisionLandingPageActions;
	}
	
	@Given("^I am on Television Page \"([^\"]*)\"$")
	public void i_am_on_Television_Page(String websiteUrl) throws Throwable {
		SeleniumDriver.openPage(websiteUrl);
	}
	
  /* @Given("^I am on Television Page \"([^\"]*)\"$")
	public void i_am_on_Television_Page(String websiteUrl) throws Throwable {
		SeleniumDriver.openPage(websiteUrl);
	}*/
	
	/*@Given("^I am on Television Page$")
	public void i_am_on_Television_Page() throws Throwable {
	   
	}*/


	@Then("^Header Label Count should match the no of items displayed$")
	public void header_Label_Count_should_match_the_no_of_items_displayed() throws Throwable 
	{
		_televisionLandingPageActions.setSearchResults();
		List<TelevisionItem> items = _televisionLandingPageActions.getAllTvItems();
		String strTotalVal= _televisionLandingPageActions.getTotalItemVal();
		//System.out.println("all item on page" + items.size());
		Assert.assertEquals(Integer.parseInt(strTotalVal), items.size());
		
		
	}
	
	
	/* @Given("^I am on the Television Page \"([^\"]*)\"$")
	public void i_am_on_the_Television_Page(String url) throws Throwable {
		SeleniumDriver.openPage(url);
	}*/

	
	@When("^I Clear Filter Category$")
	public void i_clear_filter_Category() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		_televisionLandingPageActions.clearFilter();
		Thread.sleep(10000);
	}
	
	@When("^I select filter Category Screen Size and value \"([^\"]*)\"$")
	public void i_select_filter_Category_and_value(String screenSize) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		_televisionLandingPageActions.checkScreenSize(screenSize);
		Thread.sleep(10000);
	}

	@Then("^no of items in the filter \"([^\"]*)\"  should match no of items on the page$")
	public void no_of_items_in_the_filter_should_match_no_of_items_on_the_page(String screenSize) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String s1 = _televisionLandingPageActions.checkScreenSizeText(screenSize);
	    String s2 = _televisionLandingPageActions.totalCountScreenSizeText();
	    Assert.assertEquals(s1.replaceAll("[^a-zA-Z]+" , "").trim(), s2.replaceAll("[^a-zA-Z]+" , "").trim());
	}
	
		
	
	/*@Given("^I am on television page \"([^\"]*)\"$")
	public void i_am_on_television_page(String websiteUrl) throws Throwable {
		SeleniumDriver.openPage(websiteUrl);
	}	*/
	
	
	@When("^I select Price \\(low to high\\)$")
	public void i_select_Price_low_to_high() throws Throwable 
	{
	 _televisionLandingPageActions.moveToLowToHigh();   
	}

	@Then("^All television should display in ascending price order$")
	public void all_television_should_display_in_ascending_price_order() throws Throwable {
		List<TelevisionItem> items = _televisionLandingPageActions.getAllTvItems(); 
		List<TelevisionItem> sortedItems =new ArrayList<TelevisionItem>(items); 
		Comparator<TelevisionItem> priceComparer = new Comparator<TelevisionItem>() {
			public int compare(TelevisionItem s1, TelevisionItem s2) {
				return (int) (s1.Price  - s2.Price);
			}
		};
		
		sortedItems.sort(priceComparer);
		
		Assert.assertEquals(items, sortedItems);
		
	}
	
	/*@Given("^I am on the Television Page_ \"([^\"]*)\"$")
	public void i_am_on_the_Television_Page_(String arg1) throws Throwable {
	    SeleniumDriver.openPage(arg1);
	}*/

	@Given("^I am not Logged in$")
	public void i_am_not_Logged_in() throws Throwable {
		
		Assert.assertTrue(_televisionLandingPageActions.loginCheck());
	}

	@Then("^Member options should be disabled$")
	public void member_options_should_be_disabled() throws Throwable {
		
		Assert.assertTrue(_televisionLandingPageActions.secMembershipEnable());
	}
	
	
	@Then("^I select following filter Category$")
	public void i_select_multiple_filters(DataTable dt) throws Throwable {
		List<List<String>> filters = dt.asLists(String.class);
		for(int i=0; i<filters.size(); i++) { //i starts from 1 because i=0 represents the header
			i_select_filter_Category_and_value(filters.get(i).get(0));
		}
		
	}
	
	
	@Then("^No of items in the filters should match no of items in the page$")
	public void no_of_items_filters_should_match_no_of_items_in_page(DataTable dt) throws Throwable {
		List<List<String>> filters = dt.asLists(String.class);
		int count=0; 
		for(int i=0; i<filters.size(); i++) { //i starts from 1 because i=0 represents the header
			String countText = _televisionLandingPageActions.checkScreenSizeText(filters.get(i).get(0));
			count=count + Integer.parseInt(countText);
		}
		String totalString = _televisionLandingPageActions.totalCountScreenSizeText();
		int total = Integer.parseInt(totalString);
		Assert.assertEquals(count, total);
	}


	
	
	

	
}
