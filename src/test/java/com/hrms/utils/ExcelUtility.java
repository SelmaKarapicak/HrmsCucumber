package com.hrms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	private static Workbook book;
	private static Sheet sheet;
	
	public static void openExcel(String filePath, String sheetName) { //this for opening and reach to excel file
		
		try {
			FileInputStream fis=new FileInputStream(filePath);
		     book=new XSSFWorkbook(fis);
		  sheet=book.getSheet(sheetName);
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
	}
	
	public static int rowCount() { //to get numbers of excel file
	 return sheet.getPhysicalNumberOfRows();
	}
	
	public static int colCount() {  //to get cell or col number of the excel file
	return sheet.getRow(0).getLastCellNum();
	}
	
	public static String getCellData(int rowIndex, int colIndex) { //to get specific data/cell
		return sheet.getRow(rowIndex).getCell(colIndex).toString();
	}
	
	public static List<Map<String, String>> excelIntoListOfMaps(String filePath, String sheetName){
		openExcel(filePath,sheetName);
		
		 List<Map<String, String>> data=new  ArrayList<Map<String, String>>(); 
		
		for (int i=1; i<rowCount(); i++) {  //values cell datalarimiz
			Map<String, String> map=new LinkedHashMap<>();
			
			for(int j=0; j<colCount(); j++) {            // key values
				map.put(getCellData(0, j), getCellData(i, j));
			}
			data.add(map);
		}
		return data;
	}
	

}
