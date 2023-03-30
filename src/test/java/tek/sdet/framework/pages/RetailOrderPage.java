package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderPage extends CommonUtility{
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "cancelBtn") public WebElement cancelTheOrderBtn; 
	@FindBy(xpath = "//select[@id= 'reasonInput']//option") public List<WebElement> reasonInput;
	@FindBy(xpath = "//button[@class= 'order__cancel-submit']") public WebElement cancelOrderBtn;
	@FindBy(xpath = "//p[text()= 'Your Order Has Been Cancelled']") public WebElement orderCancelledMessage; 
	@FindBy(xpath = "//p[text()= 'Hide Details']") public WebElement hideOrderDetails;
	@FindBy(xpath = "//p[text()= 'Show Details']") public WebElement showOrderDetails;
	@FindBy(id = "returnBtn") public WebElement returnItemsBtn;
	@FindBy(xpath = "//select[@id= 'dropOffInput']//option") public List<WebElement> dropOffServiceList; 
	@FindBy(id = "orderSubmitBtn") public WebElement returnOrderBtn;
	@FindBy(xpath = "//p[text()= 'Return was successfull']") public WebElement returnMessage;
	@FindBy(id = "reviewBtn") public WebElement  reviewBtn;
	@FindBy(id = "headlineInput") public WebElement headlineField;
	@FindBy(id= "descriptionInput") public WebElement reviewDescriptionField; 
	@FindBy(id = "reviewSubmitBtn") public WebElement addReviewBtn;
	@FindBy(xpath = "//div[contains(text(), 'Your review was added successfully')]") public WebElement reviewAddedMessage; 
	
	
	
	
	
}
