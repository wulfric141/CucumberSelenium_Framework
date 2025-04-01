package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	public WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
	}
	

	By buttonCart=By.xpath("//img[@alt='Cart']");
	By buttonProceedToCheckout=By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	By buttonApplyPromo=By.cssSelector(".promoBtn");
	By buttonPlaeOrder=By.xpath("//button[text()='Place Order']");
	
	public void checkoutItems() {
		driver.findElement(buttonCart).click();
		driver.findElement(buttonProceedToCheckout).click();
	}
	
	public boolean verifyPromoButton() {
		return driver.findElement(buttonApplyPromo).isDisplayed();
	}
	public boolean VerifyPlaceOrder() {
		return driver.findElement(buttonPlaeOrder).isDisplayed();
	}

}
