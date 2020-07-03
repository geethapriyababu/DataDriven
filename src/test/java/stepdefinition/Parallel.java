package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel {
	
	public WebDriver driver;
	
	@Test()
	public void testOnChromeWithBrowserStackUrl() throws Exception
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\my\\eclipse-workspace\\DataDriven\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	System.out.println(driver);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.browserstack.com/users/sign_up");
	//WebElement f = driver.findElement(By.xpath("//a[text()='Sign In']"));
	//f.click();
	//driver.findElement(By.id("user_email_login")).sendKeys("geethapriyababu@gmail.com");
	//driver.findElement(By.id("user_password")).sendKeys("asadfg");
	driver.manage().window().maximize();
	driver.findElement(By.id("user_full_name")).sendKeys("Sadhvi Singh");
	driver.findElement(By.id("user_email_login")).sendKeys("sadhvisingh24@gmail.com");
	driver.findElement(By.id("user_password")).sendKeys("browserstack");
	System.out.println("this is the test related to chrome browserstack homepage"+ " " +Thread.currentThread().getId());
	Thread.sleep(2000);
	driver.quit();
	}

	@Test()
	public void testOnChromeWithBrowserStackSignUp() throws Exception
	{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\my\\eclipse-workspace\\DataDriven\\Driver\\geckodriver.exe");
	driver=new FirefoxDriver();
	System.out.println(driver);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.browserstack.com/users/sign_up");
	driver.manage().window().maximize();
	driver.findElement(By.id("user_full_name")).sendKeys("Sadhvi Singh");
	driver.findElement(By.id("user_email_login")).sendKeys("sadhvisingh24@gmail.com");
	driver.findElement(By.id("user_password")).sendKeys("browserstack");
	System.out.println("this is the test related to firefox browserstack login"+ " " +Thread.currentThread().getId());
	Thread.sleep(2000);
	driver.quit();
	}


}
