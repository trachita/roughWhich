package pages.actions;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.locators.TelevisionPageLocators;
import utils.SeleniumDriver;
import utils.TelevisionItem;

public class TelevisionLandingPageActions {

	TelevisionPageLocators televisionPageLocators = null;

	List<TelevisionItem> televisionItems = null;

	public List<TelevisionItem> getAllTvItems() {

		return televisionItems;

	}

	public TelevisionLandingPageActions() {
		// this.driver=driver;
		this.televisionPageLocators = new TelevisionPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), televisionPageLocators);
	}

	public String getAllTelevisionText() {
		String btnAllTelevisionText = televisionPageLocators.btnAllTelevision.getText();
		System.out.println(btnAllTelevisionText);

		return btnAllTelevisionText;

	}

	public boolean getAllTelevisionDataAttribute() {
		String dataWhichAttribute = televisionPageLocators.btnAllTelevision.getAttribute("data-which-id");
		System.out.println(dataWhichAttribute);
		if (dataWhichAttribute.equals("active-true")) {
			return true;
		}
		return false;
	}

	public String getDontBuyText() {
		String btngetDontBuyText = televisionPageLocators.btnDontBuy.getText();
		System.out.println(btngetDontBuyText);
		return btngetDontBuyText;

	}

	public String getBestBuyText() {
		String btngetBestBuyText = televisionPageLocators.btnBestBuy.getText();
		System.out.println(btngetBestBuyText);
		return btngetBestBuyText;

	}

	public String getAdviceGuideText() {
		String btngetAdviceGuideText = televisionPageLocators.btnAdviceGuide.getText();
		System.out.println(btngetAdviceGuideText);
		return btngetAdviceGuideText;

	}

	public String getMenuText() {
		String btngetMenuText = televisionPageLocators.btnTVMenu.getText();
		System.out.println(btngetMenuText);
		return btngetMenuText;

	}

	public String getPageTitle() {
		String getTitle = SeleniumDriver.getDriver().getTitle();
		System.out.println(getTitle);
		return getTitle;
	}

	public String getTotalItemVal() {
		String getTotalItemVal = televisionPageLocators.txtTotalItem.getText();
		System.out.println(getTotalItemVal);
		return getTotalItemVal;
	}

	public void checkScreenSize(String screenSize) {
		// televisionPageLocators.chkScreenSize20_28.click();
		screenSize= screenSize.replace('"', ' ').trim(); 
		screenSize= screenSize.replace('-', '_').trim(); 
		Actions actions = new Actions(SeleniumDriver.getDriver());
		actions.moveToElement(televisionPageLocators.chkScreenSize(screenSize)).click().perform();

	}

	public String checkScreenSizeText(String screenSize) {
		screenSize= screenSize.replace('"', ' ').trim(); 
		screenSize= screenSize.replace('-', '_').trim(); 
		WebElement e= televisionPageLocators.chkScreenSizeCount(screenSize);
		String strScreenSize = e.getText();
		strScreenSize= strScreenSize.replace('(', ' ').replace(')' , ' ' ).trim(); 
		return strScreenSize;

	}

	public String totalCountScreenSizeText() {
		String strTotalcountScreenSize = televisionPageLocators.txtTotalCount.getText();		
		return strTotalcountScreenSize;

	}

	public boolean loginCheck() {
		if (televisionPageLocators.btnlogIn.isDisplayed()) {
			return true;
		}
		return false;

	}

	public boolean secMembershipEnable() {
		if (televisionPageLocators.secMembership.isEnabled()) {
			return true;
		}
		return false;
	}

	public void searchClick() {
		televisionPageLocators.btnSearch.click();

	}

	public void searchSendClick(String search) {
		televisionPageLocators.txtSearch.sendKeys(search);
		

	}

	public void selectAutoSuggestOption(String searchTxt) throws InterruptedException 
	{
		
				List<WebElement> elements = televisionPageLocators.autoPopulatedList;
				SeleniumDriver.wait(elements);
				System.out.println(elements.size());
				if (elements != null)
				{
					for (Iterator<WebElement> w = elements.iterator(); w.hasNext();) 
					{
						WebElement item = w.next();
						System.out.println(item.getText());
						if(item.getText().equals(searchTxt))
						{ 
							System.out.println("Trying to select: "+searchTxt); item.click(); break; 
							
							
						}
												
					}
						
				  }
				/*
				 * List<WebElement> optionsToSelect = 
				 * for(WebElement option : optionsToSelect)
				 * { System.out.println(option);
				 * if(option.getText().equals(searchTxt))
				 *  { System.out.println( "Trying to select: "+searchTxt); option.click(); break; } }
				 */

	}

		
	
	public void setSearchResults() {

		// WebDriverWait wait = new WebDriverWait(SeleniumDriver.getDriver(),
		// 30);
		// List<WebElement> trs =
		// wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("div.datepicker-days>table>tbody>tr")));

		// List<WebElement> televisionWebItems =
		// wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(televisionPageLocators.allTelevisionElements);

		int counter = 0;
		int success = 0;
		while (counter < 4 && success == 0) {
			List<WebElement> televisionWebItems = televisionPageLocators.allTelevisionElements;
			televisionItems = new ArrayList<TelevisionItem>();
			try {
				for (Iterator<WebElement> w = televisionWebItems.iterator(); w.hasNext();) {
					WebElement item = w.next();

					TelevisionItem prodItem = new TelevisionItem();
					WebElement size = televisionPageLocators.sizeOfTvItem(item);
					WebElement manufaturer = televisionPageLocators.manufacturerOfTvItem(item);
					WebElement price = televisionPageLocators.priceOfTvItem(item);
					WebElement launched = televisionPageLocators.launchDateOfTvItem(item);
					WebElement reviewed = televisionPageLocators.reviewDateOfTvItem(item);
					if (size != null) {
						String sizeString = size.getText();
						sizeString = sizeString.replace('"', ' ').trim();
						prodItem.Size = Integer.parseInt(sizeString);
					}
					if (manufaturer != null) {
						WebElement company = televisionPageLocators.companyOfTvItem(manufaturer);
						prodItem.Company = company.getText();
						WebElement model = televisionPageLocators.modelOfTvItem(manufaturer);
						prodItem.Model = model.getText();
					}
					if (price != null) {
						price = televisionPageLocators.priceTextOfTvItem(price);
						String value = price.getText();
						value = value.replace("£", "");
						prodItem.Price = Double.parseDouble(value);
					}
					if (launched != null) {
						prodItem.Launched = launched.getText().replace("Launched:", "").trim();
					}
					if (reviewed != null) {
						prodItem.Reviewed = reviewed.getText().replace("Reviewed:", "").trim();
					}
					televisionItems.add(prodItem);

				}
				success = 1;

			} catch (StaleElementReferenceException e) {
				counter++;
				System.out.println("Trying to recover from a stale element :" + e.getMessage());
			}

		}

	}

	/*public void getAllItems() {
		setSearchResults();

	}*/

	public void moveToLowToHigh() {

		Select select = new Select(televisionPageLocators.menuSortBy);
		select.selectByValue("price_asc");
		setSearchResults();
	}
	public void clearFilter()
	{
		WebElement clearFilterElement = televisionPageLocators.clearAll; 
		Actions actions = new Actions(SeleniumDriver.getDriver());
		actions.moveToElement(clearFilterElement).click().perform();
	}
	

}
