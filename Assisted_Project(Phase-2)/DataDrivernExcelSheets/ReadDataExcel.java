package com.datadrivenExcelSheets;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel {

	public static void main(String[] args) throws IOException {

		String excelfilepath = "C:\\Users\\DELL\\OneDrive\\Desktop\\MyTestData\\TestData.xlsx";

		// Give the location of the file

		File excelfile = new File(excelfilepath);

		// fetch the file

		FileInputStream fis = new FileInputStream(excelfile);

		// Create object of workbook
		// High level representation of a SpreadsheetML workbook.
		// This is the first object most userswill construct whether they are reading or
		// writing a workbook.
		// It is also thetop level object for creating new sheets/etc.

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// fetch the sheet name from the workbook

		// Sheets are the central structures within a workbook, and are where a user
		// does most of his spreadsheet work.The most common type of sheet is the
		// worksheet, which is represented as a grid of cells. Worksheet cells
		// cancontain text, numbers, dates, and formulas. Cells can also be formatted.

		XSSFSheet sheet = workbook.getSheet("Sheet1");

		// Count the number of rows

		int rows = sheet.getLastRowNum();
		System.out.println("Number of Rows : " + rows);

		// Count the number of columns

		int col = sheet.getRow(1).getLastCellNum();
		System.out.println("Number of columns : " + col);

		// go to every row, every cell and fetch the data

		// for loop to go on every rows

		for (int r = 0; r < rows; r++) {

			XSSFRow row = sheet.getRow(r);

			// for loop to go to every cell of the column
			for (int c = 0; c < col; c++) {

				XSSFCell cell = row.getCell(c);

				CellType cellType = cell.getCellType();

				switch (cellType) {

				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				}

				System.out.println(" ");

			}
			System.out.println();
		}

		workbook.close();
	}

}
