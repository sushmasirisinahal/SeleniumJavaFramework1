package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public static void main(String[] args) {
		getRowCount();
		getColCount();
		getCellDataString();
		getCellDataNumber();
	}


	public static void getRowCount() {
		try {
			projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectpath+"/Excel/Test.xlsx");
			sheet = workbook.getSheet("Sheet1");
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows: "+rowCount);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		} 
	}

	
	public static void getColCount() {
		try {
			projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectpath+"/Excel/Test.xlsx");
			sheet = workbook.getSheet("Sheet1");
			int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Number of columns: "+colCount);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		} 
	}

	public static void getCellDataString() {
		try {
			projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectpath+"/Excel/Test.xlsx");
			sheet = workbook.getSheet("Sheet1");
			String cellData = sheet.getRow(1).getCell(0).getStringCellValue();
			System.out.println(cellData);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		} 
	}
	
	public static void getCellDataNumber() {
		try {
			projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectpath+"/Excel/Test.xlsx");
			sheet = workbook.getSheet("Sheet1");
			double cellData = sheet.getRow(1).getCell(1).getNumericCellValue();
			System.out.println(cellData);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		} 
	}

}
