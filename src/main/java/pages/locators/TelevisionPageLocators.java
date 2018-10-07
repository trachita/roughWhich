package pages.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utils.SeleniumDriver;

public class TelevisionPageLocators

{
	
	@FindBy(how=How.CSS, using=".wui-button-priority-a")
	public WebElement btnTVMenu;
	
	
	@FindBy(how=How.XPATH, using="*//header/div[2]/ul/li[1]/a")
	public WebElement btnAllTelevision;
	
	@FindBy(how=How.XPATH, using="*//header/div[2]/ul/li[2]/a")
	public WebElement btnBestBuy;
	
	@FindBy(how=How.XPATH, using="*//header/div[2]/ul/li[3]/a")
	public WebElement btnDontBuy;
	
	@FindBy(how=How.XPATH, using="*//header/div[2]/ul/li[4]/a")
	public WebElement btnAdviceGuide;
	
	@FindBy(how=How.XPATH, using="//span[@data-test-element='pagination-limit']")
	public WebElement txtTotalItem;
	
	
	@FindBy(how=How.XPATH, using ="(//Select[@id='product_listing_sorter'])[1]")
	public WebElement menuSortBy;
	
   // @FindBy(how=How.XPATH, using ="*//main/div[2]/div/div/ul")
    //public List<WebElement> allElements;
    
    @FindBy(how=How.XPATH, using="//*[@data-test-element='product-amount']")
    public List<WebElement> allPriceElements;
	
    
    @FindBy(how=How.XPATH, using="//ul[@data-test-element='product-list']/li[@itemprop='itemListElement']")
	public List<WebElement> allTelevisionElements; 
    
    
    public WebElement launchDateOfTvItem(WebElement item)
    {
    	return item.findElement(By.xpath("//p[@data-test-element='launch-date']"));     	
    }
    public WebElement reviewDateOfTvItem(WebElement item)
    {
    	return item.findElement(By.xpath("//p[@data-test-element='tested-date']"));     	
    }
    
    public WebElement sizeOfTvItem(WebElement item)
    {
    	
    	return item.findElement(By.xpath("//div[@data-test-element='product-smif']"));     	
    }
    
    public WebElement manufacturerOfTvItem(WebElement item)
    {
    	return item.findElement(By.xpath("//div[@data-which-id='manufacturer-model']"));     	
    }
    
    public WebElement priceOfTvItem(WebElement item)
    {
    	return item.findElement(By.xpath("//div[@data-test-element='product-price']"));     	
    }
    
    public WebElement companyOfTvItem(WebElement item)
    {
    	return item.findElement(By.xpath("//p[@itemprop='manufacturer']"));     	
    }
    
    public WebElement modelOfTvItem(WebElement item)
    {
    	return item.findElement(By.xpath("//p[@itemprop='model']"));     	
    }
    
    public WebElement priceTextOfTvItem(WebElement item)
    {
    	return item.findElement(By.xpath("//p[@data-test-element='product-amount']"));     	
    }
    
    public WebElement chkScreenSize(String screenSize)
    {
    	String elementId = "screen_size_"; 
    	elementId= elementId + screenSize;   
    	return SeleniumDriver.getDriver().findElement(By.id(elementId));
    	
    }
    
    
    public WebElement chkScreenSizeCount(String screenSize)
    {     	
    	//WebElement chkBox= chkScreenSize(screenSize);
    	String elementId = "screen_size_"; 
    	elementId= elementId + screenSize;  
    	elementId = "//label[@for='" + elementId + "']/div/span/span/span";
    	return SeleniumDriver.getDriver().findElement(By.xpath(elementId));
    	
    }
    
    /*@FindBy(how=How.CSS, using="#screen_size_20_28")
	public WebElement chkScreenSize20_28;*/
    
   /* @FindBy(how=How.XPATH, using="//form/aside/div[2]/div[3]/section/ul/li[1]/div/label/div/span/span/span")    
	public WebElement txtScreenSize20_28;*/
    
    @FindBy(how=How.XPATH, using="//strong[@data-test-element='total-count']")
	public WebElement txtTotalCount;
  
    @FindBy(how=How.XPATH, using="//div[2]/div[2]/ul/li[2]/a")
	public WebElement btnlogIn;
  
    @FindBy(how=How.XPATH, using="//form/aside/div[2]/div[1]")
	public WebElement secMembership;
    
    @FindBy(how=How.CSS, using=".gn-search-menu__icon--search")
	public WebElement btnSearch;
    
    @FindBy(how=How.CSS, using="#sli_search_1")
	public WebElement txtSearch;
    
    @FindBy(how=How.XPATH, using="//button[@class='_3ys9t _19lvj']")
   	public WebElement clearAll;
    
    @FindBy(how=How.TAG_NAME, using="li")
    public List<WebElement> liAutopopulate;
    
    @FindBy(how=How.XPATH, using="//ul[@id='sli_autocomplete']/li[@class='sli_ac_suggestions']/ul/li[@class='sli_ac_suggestion']")
	public List<WebElement> autoPopulatedList;
    
    

    
    
    
    
    
}
