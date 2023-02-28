package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{
	
	private POMFactory factory = new POMFactory();
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.accountPage().accountButton);
		logger.info("User click on Account option");
	}
	
	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().accountNameField);
		sendText(factory.accountPage().accountNameField, nameValue);
		clearTextUsingSendKeys(factory.accountPage().accountPhoneNumberField);
		sendText(factory.accountPage().accountPhoneNumberField, phoneValue);
		logger.info("User update name and phone");
		
		
	}
	
	@And("User click on Update button")
		public void userClickonUpdateButton() {
		click(factory.accountPage().accountUpdateBtn);
		logger.info("User click on update button");
			
		}
	
	@Then("A message should be displayed {string}")
	public void userProfileInformationShouldBeUpdataed(String value) {
		String text = getAttribute(factory.accountPage().accountUpdateAlert, value);
		logger.info("Alert should appear");
		
	}
	
	@And("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {
		List<Map<String, String>> data= dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().prevoiusPasswordField, data.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPasswordField, data.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmNewPasswordField, data.get(0).get("confirmPassword"));
		logger.info("User enters previous password and the new password");
		
	}
	
	@And("User click on Change Password button")
	public void userClickonChangePasswordButton() {
		click(factory.accountPage().changePasswordButton);
		logger.info("User click on change password button");
		
	}
	
	@Then("The message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String msg) {
		String message = getAttribute(factory.accountPage().passwordChangeAlert, msg);
		logger.info("A message should be displayed");
		
	}
	
	@And("User click on Add a payment method link")
	public void userClickOnAddApaymentMethodLink() {
		click(factory.accountPage().addPaymentMethod);
		logger.info("User click on add a payment method link");
	}
	
	@And("User fill Debit or credit card information")
	public void userFillDebitCardInfo(DataTable dataTable) {
		List<Map<String, String>> data= dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().carNumberField, data.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardField, data.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expiryMonth, data.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expiryYear, data.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCode, data.get(0).get("securityCode"));
		logger.info("User fill Debit/credit information");
	}
	
	@And("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().addCardButton);
		logger.info("User click on add your card button");
	}
	
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayedToConfirm(String confirmation) {
		String cardAdded = getAttribute(factory.accountPage().cardAddedSuccessMessage, confirmation);
		logger.info("Message should be displayed");
		
	}
	
	
	@And("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().cardsAndAccount);
		click(factory.accountPage().editCardOption);
		logger.info("User click on edit card option");
	}
	
	@And("User edit information with below data")
	public void userEditInformation(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().updateCardNumber);
		sendText(factory.accountPage().updateCardNumber, data.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountPage().updateNameOnCard);
		sendText(factory.accountPage().updateNameOnCard, data.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().updateExpiryMonth, data.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().updateExpiryYear, data.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.accountPage().updateSecurityCode);
		sendText(factory.accountPage().updateSecurityCode, data.get(0).get("securityCode"));
		logger.info("User update card informaiton");
	}
	
	@And("User click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateYourcardBtn);
		logger.info("User click on update your card button");
		
	}
	
	@Then("Message should be displayed {string}")
	public void messageShouldBeDisplayed(String message) {
		String updateMessage = getAttribute(factory.accountPage().paymentUpdateSuccessAlert, message);
		logger.info("Message should be displayed");
		
	}
	
	@And("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCard () {
		click(factory.accountPage().cardsAndAccount);
		click(factory.accountPage().cardRemoveOption);
		logger.info("User click on remove option");
	}
	
	@Then("Payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().nameOnCardField));
		logger.info("Payment details removed");
	}
	
	@And("User click on Add address option")
	public void userClickOnAddAddress () {
		
		click(factory.accountPage().addAddressOption);
		logger.info("User click on add address");
		
	}
	
	@And("User fill new address form with below information")
	public void userFillAddressInfo(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().addAddressCountryList, data.get(0).get("country"));
		sendText(factory.accountPage().addAddressFullName, data.get(0).get("fullName"));
		sendText(factory.accountPage().addAddressPhoneNumber, data.get(0).get("phoneNumber"));
		sendText(factory.accountPage().addAddressStreet, data.get(0).get("streetAddress"));
		sendText(factory.accountPage().addAddressApartment, data.get(0).get("apt"));
		sendText(factory.accountPage().addAddressCity, data.get(0).get("city"));
		selectByVisibleText(factory.accountPage().addAddressState, data.get(0).get("state"));
		sendText(factory.accountPage().addAddressZipCode, data.get(0).get("zipCode"));
		logger.info("User fill new address form");
	}
	
	@And("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().addAdressButton);
		logger.info("User click on add address button");
		
	}
	
	@Then("The pop-up message should be displayed {string}")
	public void theMessageShouldBeDisplayed(String successMessage) {
		String mssg = getAttribute(factory.accountPage().addAddressSuccessMessage, successMessage);
		logger.info("User added address successfully");
		
		
	}
	
	@And("User click on edit address option")
	public void userClickOnEditAddressOption () {
		click(factory.accountPage().editAddressOption);
		logger.info("User click on edit Address option");
	}
	
	
	@And("User fill new address form with below information2")
	public void userFillNewAddressFormWithInformation (DataTable dataTable) {
		
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().addAddressCountryList, data.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().addAddressFullName);
		sendText(factory.accountPage().addAddressFullName, data.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().addAddressPhoneNumber);
		sendText(factory.accountPage().addAddressPhoneNumber, data.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().addAddressStreet);
		sendText(factory.accountPage().addAddressStreet, data.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().addAddressApartment);
		sendText(factory.accountPage().addAddressApartment, data.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().addAddressCity);
		sendText(factory.accountPage().addAddressCity, data.get(0).get("city"));
		selectByVisibleText(factory.accountPage().addAddressState, data.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().addAddressZipCode);
		sendText(factory.accountPage().addAddressZipCode, data.get(0).get("zipCode"));
		logger.info("User fill new address information");
		
	}
	
	@And("User click update Your Address button")
	public void userClickOnUpdateYourAddressButton () {
		click(factory.accountPage().updateAddressBtn);
		logger.info("User click on update address");
		
	}
	
	@Then("The message should be displayed on the screen {string}")
	public void theMessageDisplayed (String updateSuccessMessage) {
		String msge = getAttribute(factory.accountPage().UpdateAddressSuccessMessage, updateSuccessMessage);
		logger.info("Update success message appears");
		
	}
	
	@And("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().addressRemoveOption);
		logger.info("User click on remove option of address section");
	}
	
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved () {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressBox));
		logger.info("Address details removed");
		
	}
	
	
	
}
