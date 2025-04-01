package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public LandingPage landingpage;
	public OffersPage offerspage;
	public CheckoutPage checkoutpage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LandingPage getLandingPage() {
		landingpage = new LandingPage(driver);
		return landingpage;
	}
	
	public OffersPage getOfferspage() {
		offerspage = new OffersPage(driver);
		return offerspage;
	}
	
	public CheckoutPage getcheckoutpage() {
		checkoutpage = new CheckoutPage(driver);
		return checkoutpage;
	}

}
