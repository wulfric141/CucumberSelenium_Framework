package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {

public WebDriver driver;
	
	public OffersPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By productName=By.xpath("//input[@type='search']");
	By productValue=By.cssSelector(".table.table-bordered tbody tr td");
	
	
	public String getProductName() {
		return driver.findElement(productValue).getText();
	}

	public void switchToOffersPage(String parentwindow) {
		Set<String> s1=driver.getWindowHandles();
		
		Iterator<String> it=s1.iterator();
		while(it.hasNext()) {
			String childWindow=it.next();
			if(!parentwindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
			}
		}
	}
	

	public void searchProduct(String prodName) {
		driver.findElement(productName).sendKeys(prodName);
	}
	

}
