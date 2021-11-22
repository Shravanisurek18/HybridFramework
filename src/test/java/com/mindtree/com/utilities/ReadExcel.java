package com.mindtree.com.utilities;

import java.io.FileInputStream;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	
	public static void main(String[] args) {
	}
	
	public static Object[][] getDetails(String status) throws IOException {
		
		//Initializing file path
		FileInputStream OrderStatus = new FileInputStream("C:\\Users\\sravani-jukebox\\OneDrive\\Desktop\\Comprehensive Assessment\\TrackOrder.xlsx");
		//accessing the excel sheet
		XSSFWorkbook TrackOrderBook = new XSSFWorkbook(OrderStatus);
		//accessing the particular sheet in the excel
		XSSFSheet Details = TrackOrderBook.getSheet(status);
		int rowCount = Details.getLastRowNum();
		XSSFRow row = Details.getRow(0);
		int colCount = row.getLastCellNum();
		
		//initializing the data in an object and passing the same to the data provider
		Object[][] data = new Object[rowCount + 1][colCount];
		for(int i = 0; i < rowCount+1 ;i++) {
			for(int j = 0; j < colCount; j++) {
				data[i][j] = Details.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(data[i][j]);
			}
		}
		return data;
		
	}
	
}
