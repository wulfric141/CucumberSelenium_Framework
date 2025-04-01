package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class LandingPageStepDefinitions {
	
	 TestContextSetup testcontextsetup;
	 public WebDriver driver;
	 public String landingPageProductName;
	 PageObjectManager pageobjectmanager;
	 public LandingPage lp;
	 
	public LandingPageStepDefinitions(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		this.lp=testcontextsetup.pageObjectManager.getLandingPage();
	}
	
	@Given("user is on greeenkart landing page")
	public void user_is_on_greeenkart_landing_page() {
	    Assert.assertTrue(lp.getTitleLandingPage().contains("GreenKart"));
	}
	
	@When("^user search with shortname (.+) and extracted actual name of product$")
	public void user_search_with_shortname_and_extracted_actual_name_of_product(String vegName) throws InterruptedException {
		//LandingPage lp=testcontextsetup.pageObjectManager.getLandingPage();- declare in constructor to give the life of page object in all steps
		lp.searchItem(vegName);
	   Thread.sleep(2000);
	    testcontextsetup.landingPageProductName=lp.getProductName().split("-")[0].trim();
	    System.out.print("Product name of landing page is"+testcontextsetup.landingPageProductName);
	}
	
	@And("Added {string} items of the selected product to cart")
	public void Added_items_product(String count) {
		lp.incrementquantity(Integer.parseInt(count));
		lp.addToCart();
	}

}