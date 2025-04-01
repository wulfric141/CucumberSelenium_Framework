package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public String landingPageProductName;
	public PageObjectManager pageObjectManager;
	public TestBase testbase;
	public GenericUtils genericUtils;
	
	public TestContextSetup() throws IOException {
		testbase=new TestBase();
		pageObjectManager=new PageObjectManager(testbase.WebDriverManager()); 
		genericUtils=new GenericUtils(testbase.WebDriverManager());
	}
	

}
