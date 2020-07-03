package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.After;

public class TestNG {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my\\eclipse-workspace\\DataDriven\\Driver1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	      String expectedTitle = "Welcome: Mercury Tours";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	    
	}
	
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("@BeforeTest");
	}
	
	@BeforeClass
	public void beforeClasMethod() {
		System.out.println("@BeforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}
	
	@Test(priority=-5)
	public void nothing()
	{
		System.out.println("Checking priority");
	}
	
	@Test(priority=-2)
	public void something()
	{
		System.out.println("something");
	}
	
	@Test(priority=3, groups= {"group1"})
	public void basketBall()
	{
		System.out.println("basketball");
	}
	
	@Test(groups= {"group1"})
	public void yacht()
	{
		System.out.println("yacht");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");
	}
	
	@AfterClass
	public void afterClasMethod() {
		System.out.println("@AfterClass");
	}
	
	@AfterTest
	public void afterTestMethod() {
		System.out.println("@AfterTest");
	}
	
	@AfterSuite
	public void tearDown() {
driver.quit();
	}
	

}
