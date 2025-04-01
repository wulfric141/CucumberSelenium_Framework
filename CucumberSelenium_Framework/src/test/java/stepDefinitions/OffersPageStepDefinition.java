package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import utils.TestContextSetup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OffersPageStepDefinition {
	 TestContextSetup testcontextsetup;
	 public WebDriver driver;
	 public String landingPageProductName,offersPageProductName;
	 
	public OffersPageStepDefinition(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	
	}
	
	

	@And("^user searched for (.+) shortname in offers page$")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String vegName) throws InterruptedException {
		OffersPage op=testcontextsetup.pageObjectManager.getOfferspage();
		LandingPage lp=testcontextsetup.pageObjectManager.getLandingPage();
		lp.selectTopDeals();
		testcontextsetup.genericUtils.SwitchToChildWindow();
		op.searchProduct(vegName);
		offersPageProductName=op.getProductName();
	}
			
	
	@Then("validate product name in offers page matches with landing page")
	public void validate_product() {
		   System.out.print("Product name of landing page is"+testcontextsetup.landingPageProductName);
		   System.out.print("Product name of offers page is"+offersPageProductName);
		Assert.assertEquals(offersPageProductName, testcontextsetup.landingPageProductName);
	}

}
