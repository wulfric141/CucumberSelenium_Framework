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
import pageObjects.CheckoutPage;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class CheckoutPageStepDefinitions {
	
	 TestContextSetup testcontextsetup;
	 public WebDriver driver;
	 public String landingPageProductName;
	 public CheckoutPage cp;
	 PageObjectManager pageobjectmanager;
	 
	public CheckoutPageStepDefinitions(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		 this.cp=testcontextsetup.pageObjectManager.getcheckoutpage();
	
	}
	
	@Then("Verify user has ability to add promocode and place the order")
	public void verify_user_has_ability_enter_promocode() {
		
		 Assert.assertTrue(cp.verifyPromoButton());
		 Assert.assertTrue(cp.VerifyPlaceOrder());
	}
	
	@Then("^user proceeds to checkout page and validate (.+) items in checkout page$")
	public void user_proceeds_to_checkout(String name) {
		cp.checkoutItems();
		//Assertion to get name and verify with name string
	}
	
}
