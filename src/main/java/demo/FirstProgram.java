package demo;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstProgram {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my\\eclipse-workspace\\DataDriven\\Driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//WebDriverWait myWait=new WebDriverWait(driver, 50);
		//myWait.until(ExpectedConditions.)
		
		
	//	driver.get("http://www.popuptest.com/popuptest2.html");
		
		/*driver.get("http://demo.guru99.com/selenium/deprecated.html");
		WebDriver frame = driver.switchTo().frame("classFrame");
		Thread.sleep(2000);
		WebElement findElement = frame.findElement(By.linkText("Deprecated"));
		findElement.click();*/

		/*driver.get("http://jsbin.com/usidix/1");
		WebElement f = driver.findElement(By.cssSelector("input[value=\"Go!\"]"));
		f.submit();
		//Select s=new Select(f);
		Actions act=new Actions(driver);
		act.moveToElement(f).keyDown(f, Keys.SHIFT).sendKeys(f,"something").keyUp(f, Keys.SHIFT).doubleClick(f).contextClick().build().perform();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();*/
		
		/*driver.get("http://demo.guru99.com/test/yahoo.html");
		WebElement d = driver.findElement(By.id("messenger-download"));
		String attrText = d.getAttribute("href");
		String wget_command="cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate "+ attrText;
		try {
			Process exec=Runtime.getRuntime().exec(wget_command);
			int exitVal=exec.waitFor();
			System.out.println(exitVal);
			
		}catch(Exception e)
		{
			System.out.println(e.toString());
		}
		*/
		
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		WebElement wb = driver.findElement(By.xpath("//*[contains(@href,'popup.php')]"));
		wb.click();
        String MainWindow=driver.getWindowHandle();
        
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        
        while(iterator.hasNext())			
        {		
            String ChildWindow=iterator.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	                                                                                                           
                    driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");                			
                    
                    driver.findElement(By.name("btnLogin")).click();			
                                 
			// Closing the Child Window.
                        driver.close();	
                       				

            }		
        }		

        driver.switchTo().window(MainWindow);
		
		/*String actualTitle="Welcome: Mercury Tours";
		String title = driver.getTitle();
		if(actualTitle.contentEquals(title))
			System.out.println("Test passed");
		else
			System.out.println("Test fail");
		//System.out.println(title);
*/
		/*String tagName = driver.findElement(By.id("email")).getTagName();
		System.out.println(tagName);
		WebElement findElement = driver.findElement(By.id("email"));*/
		driver.quit();
		//System.exit(0);
				
		
		
	}

}
