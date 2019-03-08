package com.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Exceldataconfig {
	
	
	public void Exceldata(String file) throws FileNotFoundException
	{
		XSSFWorkbook wb;
		XSSFSheet sheet;
		FileInputStream fis= new FileInputStream(file);
		
		System.out.println("run at the top")
		
	
	}
		

}
