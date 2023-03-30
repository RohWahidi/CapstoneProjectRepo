package tek.sdet.framework.steps;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{
	
	private POMFactory factory = new POMFactory();
	
	@And("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.homePage().ordersOption);
		logger.info("User click on Orders Section");
	}

	
	
	@And("User click on first order in list")
	public void userClickOnFirstOrderInTheList() {
		click(factory.orderPage().hideOrderDetails);
		click(factory.orderPage().showOrderDetails);
		logger.info("User click on first order in list");
		
	}
	@And("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelTheOrderBtn);
		logger.info("User click on Cancel the Order button");
	}
	@And("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String cancelReason) {
		List<WebElement> canReason = factory.orderPage().reasonInput;
		for(WebElement element : canReason) {
			if(element.getText().equals(cancelReason)) {
				element.click();
				break; 
			}
			
		}
		
	}
	@And("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelOrderBtn);
		logger.info("User click on Cancel Order button");
	}
	@Then("A cancelation message should be displayed {string}")
	public void aCancelationMesageShouldBeDisplayed(String cancelMessage) {
		waitTillPresence(factory.orderPage().orderCancelledMessage);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().orderCancelledMessage));
		logger.info("A cancellation message should be displayed");
		
	}
	
	@And("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnItemsBtn);
		logger.info("User click on return items button");
		
	}
	@And("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String returnReason) {
		List<WebElement> returnR = factory.orderPage().reasonInput;
		for(WebElement element : returnR) {
			if(element.getText().equals(returnReason)) {
				element.click();
				break;
			}
		}
		
	}
	@And("User select the drop off service {string}")
	public void userSelectTheDropOffService(String dropOffService) {
		List<WebElement> dropOffS = factory.orderPage().dropOffServiceList;
		for(WebElement element : dropOffS) {
			if(element.getText().equals(dropOffService)) {
				element.click();
				break;
			}
		}
		
	}
	@And("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnOrderBtn);
		logger.info("User click on Return Order button");
		
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String cancelationMessage) {
		waitTillPresence(factory.orderPage().returnMessage);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().returnMessage));
		logger.info("A cancelationi message should be displayed");
	}
	
	@And("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewBtn);
		logger.info("User click on Review button");
	}
	@And("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAndReview(String headline, String review) {
		sendText(factory.orderPage().headlineField, headline);
		sendText(factory.orderPage().reviewDescriptionField, review);
		logger.info("User write review headline and review description");
	}
	@And("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().addReviewBtn);
		logger.info("User click add your review button");
	}
	@Then("A review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String reviewAddedMessage) {
		waitTillPresence(factory.orderPage().reviewAddedMessage);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().reviewAddedMessage));
		logger.info("A review message should be displayed");
	}
	
	
	
	
	
	
	
}
