package com.qa.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.xml.stream.XMLEventReader;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.qa.Base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICIT_WAIT = 30;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public TestUtil(String ExcelPath) {
		// TODO Auto-generated constructor stub
		try {
			File src = new File(ExcelPath);
			fis = new FileInputStream(src);
			wb = new XSSFWorkbook();
			//in case of .xls file use below
//		HSSFWorkbook wb = new HSSFWorkbook();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
//	XMLEventReader reader;
//	Xls_Reader reader;
	
	public String getCellData(int sheetNumber,int rowNumber,int columnNumber){
		sheet1 = wb.getSheetAt(sheetNumber);
		System.out.println(sheet1.getSheetName());
		String newEmail = sheet1.getRow(rowNumber).getCell(columnNumber).getStringCellValue();
		return newEmail;
		}

}
