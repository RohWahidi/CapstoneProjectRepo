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
	

}
