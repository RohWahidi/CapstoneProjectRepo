package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup{
	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "signinLink") public WebElement signIn;
	@FindBy(linkText = "TEKSCHOOL") public WebElement tekSchoolLogo;
	@FindBy(xpath = "//button[@id= 'hamburgerBtn']") public WebElement allButton;
	@FindBy(xpath = " //h1[@id='contentHeader']") public List<WebElement> sideBar; 
	@FindBy(xpath = "//span[contains(text(), 'Electronics')]") public WebElement electronicsDepartment;
	@FindBy(xpath= "//span[contains(text(), 'Computers')]") public WebElement computersDepartment;
	@FindBy(xpath = "//span[contains(text(), 'Smart Home')]") public WebElement smartHomeDepartment; 
	@FindBy(xpath = "//span[contains(text(), 'Sports')]") public WebElement sportsDepartment; 
	@FindBy(xpath = "//span[contains(text(), 'Automative')]") public WebElement automativeDepartment; 
	@FindBy(xpath = "//select[@id='search']") public List<WebElement> allDepartmentList;
	@FindBy(xpath = "//input[@id='searchInput']") public WebElement searchBar; 
	@FindBy(xpath = "//button[@id='searchBtn']") public WebElement searchIcon; 
	@FindBy(xpath = "//img[contains(@alt, 'Kasa Outdoor Smart Plug')]") public WebElement kasa; 
	@FindBy(xpath = "//select[@class= 'product__select']//option") public List<WebElement> quantityOption;
	@FindBy(xpath = "//div[@id='cartBtn']") public WebElement cartBtn; 
	@FindBy(xpath = "//span[contains(text(), 'Add to Cart')]") public WebElement addToCartBtn;
	@FindBy(id = "cartQuantity") public WebElement cartQuantity;
	@FindBy(id = "proceedBtn") public WebElement proceedToCheckoutBtn;
	@FindBy(xpath = "//button[@id='addAddressBtn']") public WebElement addANewAddress;
	@FindBy(xpath = "//button[@id='addPaymentBtn']") public WebElement addCreditCardLink;
	@FindBy(xpath = "//button[text()= 'Place Your Order']") public WebElement placeYourOrderBtn;
	@FindBy(xpath = "//p[text()= 'Order Placed, Thanks']") public WebElement orderPlacedMessage;
	@FindBy(xpath = "//p[contains(text(), 'Apex Legends')]") public WebElement apex;
	@FindBy(xpath = "//a[@id= 'orderLink']") public WebElement ordersOption;
	
	
	
	
	
	

}
