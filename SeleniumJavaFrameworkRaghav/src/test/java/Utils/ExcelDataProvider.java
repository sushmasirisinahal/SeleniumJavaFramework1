package Utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	@Test(dataProvider="test1data")
	public void test1(String Username, String Password) {
		System.out.println(Username+"  |  "+Password);
	}
	
	@DataProvider(name="test1data") //test data for test1 so giving the name test1data, any name can be used
	public Object[][] getData() {
		String excelPath = "C:\\Users\\adminHome\\Eclipse projects\\SeleniumJavaFrameworkRaghav\\Excel\\Test.xlsx";
		String sheetName = "Sheet1";
		Object data[][] = testData(excelPath, sheetName);
		return data;
	}
	
	public Object[][] testData(String excelPath, String sheetName) {
		ExcelUtils2 excel = new ExcelUtils2(excelPath, sheetName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		//declare an object array so that we can capture any data type
		Object data[][]= new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				String cellData = excel.getCellDataString(i, j);
				//regular print
				//System.out.println("Cell data is: "+cellData);
				System.out.print(cellData+"  |  ");
				//return the value to object
				data[i-1][j] = cellData;
			}
			System.out.println();
		}
		
		return data;
	}

}
