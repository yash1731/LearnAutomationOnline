package dataProvider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDetaProvider {
	
	
	XSSFWorkbook wb;
	
	public ExcelDetaProvider()
	{
		File src = new File("./ApplicationTestDeta/");
		
		try {
			
			FileInputStream fis = new FileInputStream(src);
			
			 wb = new XSSFWorkbook(fis);
			
		} catch (Exception e) 
		{
			
		System.out.println("exception is "+ e.getMessage());	
		}
	}
		public String getData (int sheetIndex,int row, int coloum)
		{
		String data = wb.getSheetAt(sheetIndex).getRow(row).getCell(coloum).getStringCellValue();
		return data;
		}
		public String getData (String sheetname,int row, int coloum)
		{
		String data = wb.getSheet(sheetname).getRow(row).getCell(coloum).getStringCellValue();
		return data;
		}
	}

