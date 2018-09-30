package com.utility.apachepoi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteXLSX {

	//Giving path of the file
	String xlsxFilePath = "C:\\Users\\student_v\\Desktop\\myFile.xlsx";

	XSSFWorkbook myWorkbook;
	XSSFSheet mySheet;
	XSSFRow myRow;
	XSSFCell myCell;
	
	void writeIntoXSSFWorkbook() {

		//Creating a blank workbook
		myWorkbook = new XSSFWorkbook();

		//Creating new worksheet
		mySheet = myWorkbook.createSheet("My 1st Sheet");

		//Creating new row
		myRow = mySheet.createRow(0);

		//Create new cell
		myCell = myRow.createCell(0);

		myCell.setCellValue("Shivam");

	}
	
	void writeIntoXLSXWorkbook() {
		
		try {
			FileOutputStream fout = new FileOutputStream(new File(xlsxFilePath));
			myWorkbook.write(fout);
			fout.close();
			System.out.println("Done");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		WriteXLSX w = new WriteXLSX();
		w.writeIntoXSSFWorkbook();
		w.writeIntoXLSXWorkbook();
		
	}

}
