package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.utilities.CommonUtility;

public class RetailSignInPage extends CommonUtility{
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	
	@FindBy(id = "email")
	public WebElement emailField;

	@FindBy(id = "password")
	public WebElement passwordField;

	@FindBy(xpath = "//button[text() = 'Login']")
	public WebElement loginButton;
	
	@FindBy(id= "newAccountBtn")
	public WebElement newAccountBtn;
	
	@FindBy(xpath= "//input[@id='nameInput']")
	public WebElement newAccountNameField;
	
	@FindBy(xpath= "//input[@id='emailInput']")
	public WebElement newAccountEmailField;
	
	@FindBy(xpath = "//input[@id='passwordInput']")
	public WebElement newAccountPasswordField;
	
	@FindBy(xpath = "//input[@id='confirmPasswordInput']")
	public WebElement newAccountConfirmPasswordField;
	
	@FindBy(id = "signupBtn")
	public WebElement signUpButton;

}
