package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesNodes {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\my\\eclipse-workspace\\DemoProjects\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.ally.io/careers/chennai");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.switchTo().frame(0);
			//List<WebElement> findElements = driver.findElements(By.xpath("//h3[text()='Engineering']//following-sibling::div//a[@data-mapped='true']"));
			//List<WebElement> findElements = driver.findElements(By.xpath("//section[@class='level-0']//following::div"));
			//List<WebElement> findElements = driver.findElements(By.xpath("//h3[text()='Engineering']//ancestor::div"));
			//List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='opening']//child::a"));
			//List<WebElement> findElements = driver.findElements(By.xpath("//h3[text()='Engineering']//following-sibling::div//a"));
			//List<WebElement> findElements = driver.findElements(By.xpath("//h3[text()='Engineering']//preceding::h2"));
			//List<WebElement> findElements = driver.findElements(By.xpath("//h3[text()='Engineering']//parent::h3"));
			//List<WebElement> findElements = driver.findElements(By.xpath("//h3[text()='Engineering']//self::h3"));
			List<WebElement> findElements = driver.findElements(By.xpath("//div[@id='wrapper']//descendant::div"));
			//List<WebElement> findElements = driver.findElements(By.xpath("//section[@class='level-0']//descendant::div"));
			for (WebElement webElement : findElements) {
				System.out.println(webElement.getAttribute("id"));
				System.out.println(webElement.getText());
			}
			driver.quit();
		}

	

}
