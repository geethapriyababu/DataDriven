package stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadAndWriteToExcel {
	
	public static void main(String[] args) throws Exception {
		
		/*Scanner s=new Scanner(System.in);
		int i = s.nextInt();
		double d = s.nextDouble();*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my\\eclipse-workspace\\DataDriven\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		File f=new File("D:\\Book2.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet3");
		int noofRows = sheet.getPhysicalNumberOfRows();
		System.out.println(noofRows);
		for(int i=1; i<noofRows;i++)
		{
			Row row = sheet.getRow(i);		
			Cell cell = row.getCell(0);
			String cellValue = cell.getStringCellValue();
			System.out.println(cellValue);
			driver.get(cellValue);
			String title = driver.getTitle();
			Cell cell2 = row.getCell(2);
			if(cell2==null)
			{
				System.out.println("cell created");
				row.createCell(2).setCellValue(title);
			}
		}
		
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		
		driver.close();
		
	}

}
