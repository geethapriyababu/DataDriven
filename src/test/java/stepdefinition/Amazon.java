package stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amazon {

	public static WebDriver driver;
	int dataSet = -1;
	Write wr=new Write();
	
	

	@BeforeSuite
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\my\\eclipse-workspace\\DataDriven\\Driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		//Assert.assertEquals(true, false, "both are true");
	}

	@BeforeTest
	public void getUrl() {
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

	@DataProvider(name = "excelValues")
	public Object[][] readFromExcel() throws Exception {
		Object[][] value = null;
		File f = new File("D:\\phones1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int numberOfCells = sheet.getRow(1).getPhysicalNumberOfCells();
		System.out.println("noOfRows-" + noOfRows);
		System.out.println("numberOfCells-" + numberOfCells);
		value = new String[noOfRows - 1][1];
		for (int i = 1; i < noOfRows; i++) {
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			value[i - 1][0] = cell.getStringCellValue();
		}
		return value;
	}
	

	@Test(dataProvider = "excelValues")
	public void searchProdcut(String phoneBrandName) throws Exception {
		System.out.println(phoneBrandName);
		dataSet++;
		Thread.sleep(5000);
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.clear();
		Thread.sleep(5000);
		searchBox.sendKeys(phoneBrandName);
		WebElement search = driver.findElement(By.xpath("(//input[@class=\"nav-input\"])[1]"));
		search.click();
		WebElement price = driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[1]"));
		String priceText=price.getText();
		System.out.println("priceText"+priceText);
		wr.writeToExcel(priceText,dataSet+1);
			}
	

	
	@AfterTest
	public void closeWb() {
		
	}
	
	@AfterSuite
	public void tearDown() {
		driver.close();
	}

}
