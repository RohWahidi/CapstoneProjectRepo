package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	
	public RetailAccountPage () {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//a[@id='accountLink']") public WebElement accountButton;
	@FindBy(id= "profileImage") public WebElement accountProfileImage;
	@FindBy(id = "nameInput") public WebElement accountNameField;
	@FindBy(id = "personalPhoneInput") public WebElement accountPhoneNumberField;
	@FindBy(xpath = "//button[@id='personalUpdateBtn']") public WebElement accountUpdateBtn;
	@FindBy(xpath = "//div[@class= 'Toastify__toast-body']") public WebElement accountUpdateAlert;
	@FindBy(xpath= "//input[@id='previousPasswordInput']") public WebElement prevoiusPasswordField;
	@FindBy(xpath= "//input[@id='newPasswordInput']") public WebElement newPasswordField;
	@FindBy(xpath= "//input[@id='confirmPasswordInput']") public WebElement confirmNewPasswordField;
	@FindBy(xpath = "//button[@id='credentialsSubmitBtn']") public WebElement changePasswordButton;
	@FindBy(xpath = "//div[text()= 'Password Updated Successfully']") public WebElement passwordChangeAlert;
	@FindBy(xpath= "//p[text()= 'Add a payment method']") public WebElement addPaymentMethod;
	@FindBy(id = "cardNumberInput") public WebElement carNumberField;
	@FindBy(id = "nameOnCardInput") public WebElement nameOnCardField;
	@FindBy(id = "expirationMonthInput") public WebElement expiryMonth;
	@FindBy(id = "expirationYearInput") public WebElement expiryYear;
	@FindBy(id = "securityCodeInput") public WebElement securityCode;
	@FindBy(id = "paymentSubmitBtn") public WebElement addCardButton;
	@FindBy(xpath = "//div[text()= 'Payment Method added sucessfully']") public WebElement cardAddedSuccessMessage;
	@FindBy(xpath= "//p[@class='account__payment-sub-title']") public WebElement cardsAndAccount;
	@FindBy(xpath= "//button[contains(text(),'Edit')]") public WebElement editCardOption;
	@FindBy(xpath= "//input[@id='cardNumberInput']") public WebElement updateCardNumber;
	@FindBy(xpath = "//input[@name='nameOnCard']") public WebElement updateNameOnCard;
	@FindBy(xpath= "//select[@id='expirationMonthInput']") public WebElement updateExpiryMonth;
	@FindBy(xpath= "//select[@id='expirationYearInput']") public WebElement updateExpiryYear;
	@FindBy(xpath = "//input[@id='securityCodeInput']") public WebElement updateSecurityCode;
	@FindBy(xpath = "//button[@id='paymentSubmitBtn']") public WebElement updateYourcardBtn;
	@FindBy(xpath = "//div[contains(text(),'Payment Method updated Successfully')]") public WebElement paymentUpdateSuccessAlert;
	@FindBy(xpath = "//button[contains(text(),'remove')]") public WebElement cardRemoveOption; 
	@FindBy(xpath = "//p[contains(text(), 'Add Address')]") public WebElement addAddressOption;
	@FindBy(xpath = "//select[@id= 'countryDropdown']") public WebElement addAddressCountryList;
	@FindBy(xpath = "//input[@id= 'fullNameInput']") public WebElement addAddressFullName;
	@FindBy(xpath = "//input[@id= 'phoneNumberInput']") public WebElement addAddressPhoneNumber;
	@FindBy(xpath = "//input[@id= 'streetInput']") public WebElement addAddressStreet;
	@FindBy(xpath = "//input[@id= 'apartmentInput']") public WebElement addAddressApartment;
	@FindBy(xpath = "//input[@id= 'cityInput']") public WebElement addAddressCity;
	@FindBy(xpath = "//select[@name='state']") public WebElement addAddressState;
	@FindBy(xpath = "//input[@id='zipCodeInput']") public WebElement addAddressZipCode;
	@FindBy(xpath = "//button[@id='addressBtn']") public WebElement addAdressButton;
	@FindBy(xpath = "//div[contains(text(),'Address Added Successfully')]") public WebElement addAddressSuccessMessage;
	@FindBy(xpath = "//button[@class= 'account__address-btn']") public WebElement editAddressOption;
	@FindBy(xpath = "//button[contains(text(), 'Update Your Address')]") public WebElement updateAddressBtn; 
	@FindBy(xpath = "//div[contains(text(), 'Address Updated Successfully')]") public WebElement UpdateAddressSuccessMessage;
	@FindBy(xpath = "//button[contains(text(), 'Remove')]") public WebElement addressRemoveOption;
	@FindBy(xpath = "//div[@class='account__address-single']") public WebElement addressBox;
	
	
	
}
