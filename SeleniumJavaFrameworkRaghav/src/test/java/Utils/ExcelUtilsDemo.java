package Utils;


public class ExcelUtilsDemo {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		ExcelUtils2 excel = new ExcelUtils2(projectPath+"/Excel/Test.xlsx", "Sheet1");
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
	}
}
