package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This is the generic class for Data Driven Testing
 * @author Rohit Gupta
 *
 */
public class FileLib {
	/**
	 * Reading the data from property file.
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return value
	 * @throws IOException
	 */
	public String getPropertyValue(String key) throws EncryptedDocumentException,IOException { 
		FileInputStream fis = new FileInputStream("./data/ActiTimeCommonData.property");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	/**
	 * Method to read data from excel.
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelValue(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	public int getLastRowCountFromExcel() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet("loginData").getLastRowNum();
		
	}
	/**
	 * Method to write data to excel.
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExcelData(String sheetname, int row, int cell, String value)throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
		FileOutputStream fop = new FileOutputStream("./data/testdata.xlsx");
		wb.write(fop);
		wb.close();
	}
	
	

}
