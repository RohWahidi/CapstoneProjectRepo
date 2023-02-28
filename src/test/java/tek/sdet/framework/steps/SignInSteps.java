package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{
	
	private POMFactory factory = new POMFactory();
	
	
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passValue) {
		sendText(factory.signInPage().emailField, emailValue);
		sendText(factory.signInPage().passwordField, passValue);
		logger.info("User enter email and pass");
		
	}
	
	@And("User click on login button")
	public void userClickOnLoginBtn() {
		click(factory.signInPage().loginButton);
		logger.info("User click on login Btn");
		
	}
	
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().accountButton));
		logger.info("User should be logged in");
	}
	
	@And("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().newAccountBtn);
		logger.info("User Click on Create New Account button");
	}
	
	@And("User fill the signUp information with below data")
	public void userFillTheInformation(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		sendText(factory.signInPage().newAccountNameField, data.get(0).get("name"));
		sendText(factory.signInPage().newAccountEmailField, data.get(0).get("email"));
		sendText(factory.signInPage().newAccountPasswordField, data.get(0).get("password"));
		sendText(factory.signInPage().newAccountConfirmPasswordField, data.get(0).get("confirmPassword"));
		logger.info("User fill the signUp information");
		
		
	}
	
	@And("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().signUpButton);
		logger.info("User click on SignUp button");
	}
	
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().accountProfileImage));
		logger.info("User is logged into account page");
	}
	
	
}

	
