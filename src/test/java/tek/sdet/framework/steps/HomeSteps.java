package tek.sdet.framework.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import org.bouncycastle.asn1.dvcs.Data;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility{
	
	private POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("User is on retial website");
	}
	
	@When("User click on Sign in option")
	public void userClicksOnSignInButton() {
		click(factory.homePage().signIn);
		logger.info("User clicks on signIn button");
	}

	@Then("User should be on signIn page")
	public void userShouldBeOnSignInPage() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().emailField));
		logger.info("User is on signIn page");
	}
	
	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allButton);
		logger.info("User click on All section");
	}
	@Then("Below options are present in Shop by Department sidebar")
		
	public void allOptionsShouldBePresentInDepartment(DataTable dataTable) {
		List<List<String>> departmentSection = dataTable.asLists(String.class);
		List<WebElement> dept = factory.homePage().sideBar;
		for(int i = 0; i <departmentSection.get(0).size(); i++) {
			for(WebElement element: dept) {
				if(element.getText().equals(departmentSection.get(0).get(i))) {
					Assert.assertTrue(element.isDisplayed());
					logger.info(element.getText() + "The item is present");
					
				}
			}
			
		}
	} 
	
	@And("User on {string}")
	public void userOnDepartment(String department) {
		List<WebElement> dept = factory.homePage().sideBar;
		for(WebElement element: dept) {
			if(element.getText().equals(department)) {
				element.click();
				break; 
			}
		}
		
	}
	
	@Then("Below options are present in department")
	public void belowOptioinsArePresentInDepartment(DataTable dataTable) {
		List<List<String>> departmentSection = dataTable.asLists(String.class);
		List<WebElement> dept = factory.homePage().sideBar;
		for(int i = 0; i <departmentSection.get(0).size(); i++) {
			for (WebElement element : dept) {
				if(element.getText().equals(departmentSection.get(0).get(i))) {
					Assert.assertTrue(element.isDisplayed());
					logger.info("Options are present in department");
				}
			}
		}
	}
	
	@And("User change the category to {string}")
	public void userChangeTheCategoryToSmartHome(String category) {
		List<WebElement> cat = factory.homePage().allDepartmentList;
		for(WebElement element : cat) {
			if(element.getText().equals(category)) {
				element.click();
				break;
			}
			
		}
		
		
	}
	@And("User search for an item {string}")
	public void userSearchForAnItemKaska(String kasa) {
		sendText(factory.homePage().searchBar, kasa);
		logger.info("User search for an item");
		
		
	}
	@And("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchIcon);
		logger.info("User click on search icon");
	}
	@And("User click on item")
	public void userClickOnItem() {
		click(factory.homePage().kasa);
		logger.info("User click on item");
		
	}
	
	@And("User select quantity {string}")
	public void userSelectQuantity(String quantity) {
		List<WebElement> quan = factory.homePage().quantityOption;
		for(WebElement element : quan) {
			if(element.getText().equals(quantity)) {
				element.click();
				break;
			}
		}
	}
			
	@And("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.homePage().addToCartBtn);
		logger.info("User click add to Cart Button");
		
		
	}
	
	@Then("The cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChange(String cart) {
		waitTillPresence(factory.homePage().cartQuantity);
		Assert.assertTrue(isElementDisplayed(factory.homePage().cartQuantity));
		logger.info("The cart icon quantity should change");
		
		
	}
	
	@And("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.homePage().cartBtn);
		logger.info("User click on Cart Option");
		
	}
	@And("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.homePage().proceedToCheckoutBtn);
		logger.info("User click on Proceed to Checkout button");
		
	}
	@And("User click Add a new address link for shipping address")
	public void userClickAndANewAddressLinkForShippingAddress() {
		click(factory.homePage().addANewAddress);
		logger.info("User click Add a new Address link");
	}
	
	
	@And("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddAcreditCardForPaymentMethod() {
		click(factory.homePage().addCreditCardLink);
		logger.info("User click Add a credit card for payment method");
		
	}
	
	@And("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.homePage().placeYourOrderBtn);
		logger.info("User click on place your order");
	}
	@Then("A thank you message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String msg) {
		waitTillPresence(factory.homePage().orderPlacedMessage);
		Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedMessage));
		logger.info("A message should be displayed");
		
		
	}
	
	@And("User change category to {string}")
	public void userChangeCategoryTOElectronics(String electronics) {
		List<WebElement> elec = factory.homePage().allDepartmentList;
		for(WebElement element : elec) {
			if(element.getText().equals(electronics)) {
				element.click();
				break;
			}
		}
		
	}
	@And("User search for the item {string}")
	public void userSearchForAnItem(String apex) {
		sendText(factory.homePage().searchBar, apex);
		logger.info("User search for an item");
		
		
	}
	
	@And("User click on the item")
	public void userClickOnTheItem() {
		click(factory.homePage().apex);
		logger.info("User click on the item");
	}
	
	@And("User select the quantity {string}")
	public void userSelectTheQuantity(String quantityFive) {
		List<WebElement> quantFive = factory.homePage().quantityOption;
		for(WebElement element : quantFive) {
			if(element.getText().equals(quantityFive)) {
				element.click();
				break;
			}
		}
		
		
	}
	
	@And("Cart icon quantity should change to {string}")
	public void cartIconQuantityShouldChange(String cartFive) {
		waitTillPresence(factory.homePage().cartQuantity);
		Assert.assertTrue(isElementDisplayed(factory.homePage().cartQuantity));
		logger.info("Cart icon quantity should change to Five");
		
	}

	
	
}
