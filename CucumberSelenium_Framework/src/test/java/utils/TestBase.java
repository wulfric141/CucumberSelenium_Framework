package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException {
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("url");
		
	   if(driver==null) {

		   if(prop.getProperty("browser").equals("chrome")) { 
			   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			    driver=new ChromeDriver();   
		   }
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.get(url);   
	   }
	  
	    return driver;
	}
}
