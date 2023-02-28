package tek.sdet.framework.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import org.junit.Assert;
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
//	@Then("Below options are present in Shop by Department sidebar")
//		
//	public void allOptionsShouldBePresentInDepartment(DataTable dataTable) {
//		List<List<String>> departmentSection = dataTable.asLists(String.class);
//		List<WebElement> dept = factory.homePage().sideBar;
//		for(int i = 0; i <departmentSection.get(0).size(); i++) {
//			
//		}
//	} 
	
	
	
	
	
	
	
	
	
	
	
}
