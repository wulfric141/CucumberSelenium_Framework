package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	

	By search=By.xpath("//input[@type='search']");
	By productName=By.cssSelector("h4.product-name");
	By topDealsButton=By.linkText("Top Deals");
	By increment=By.cssSelector("a.increment");
	By addToCart=By.cssSelector("div.product-action button");
	
	public void searchItem(String itemName) {
		driver.findElement(search).sendKeys(itemName);
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	public void selectTopDeals() {
		driver.findElement(topDealsButton).click();
	}
	
	public String getTitleLandingPage() {
		return driver.getTitle();
	}
	
	public void incrementquantity(int quantity) {
		int i=quantity-1;
		while(i>0) {
			driver.findElement(increment).click();
			i--;
		}
	}
	
	public void addToCart() {
		driver.findElement(addToCart).click();
	}

}
