package stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Write {
	
	@Test
	public void writeToExcel(String priceText, int ds) throws Exception {
			
			File f = new File("D:\\phones1.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			int noofrows = sheet.getPhysicalNumberOfRows();
			Row row = sheet.getRow(ds);
				Cell cell = row.getCell(1);
				if(cell==null)
				{
					System.out.println("cell created");
					row.createCell(1).setCellValue(priceText);
				}
			
			FileOutputStream fos=new FileOutputStream(f);
			wb.write(fos);
			wb.close();
			
		}


}
