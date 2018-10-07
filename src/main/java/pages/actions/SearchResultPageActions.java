package pages.actions;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import pages.locators.SearchResultPageLocators;
import pages.locators.TelevisionPageLocators;
import utils.SeleniumDriver;
import utils.TelevisionItem;

public class SearchResultPageActions {
	
	SearchResultPageLocators searchResultPageLocators = null;
	
	public SearchResultPageActions() {
		// this.driver=driver;
		this.searchResultPageLocators = new SearchResultPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), searchResultPageLocators);
	}
	
	public String getSearchText() {
		String getSearchValueText = searchResultPageLocators.searchText.getText();
		System.out.println(getSearchValueText);

		return getSearchValueText;

	}
	
	

}
