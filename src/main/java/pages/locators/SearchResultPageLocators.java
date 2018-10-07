package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchResultPageLocators {
	
	
	@FindBy(how=How.XPATH, using="//span[@class='sli_keyword']")
	public WebElement searchText;
	

}
