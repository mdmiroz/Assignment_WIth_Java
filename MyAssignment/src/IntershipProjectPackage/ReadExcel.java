package IntershipProjectPackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\user-pc\\eclipse-workspace\\MyAssignment\\ExcelFile\\excel_sheet.xlsx");
		
		FileInputStream fis= new FileInputStream(src);
		
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		XSSFSheet Sheet =xsf.getSheetAt(0);
		
		String entry1=Sheet.getRow(3).getCell(4).getStringCellValue();
		
		System.out.println("The value of Shorted is:" +entry1);
		
		String entry2=Sheet.getRow(3).getCell(5).getStringCellValue();
		System.out.println("The value of Longet is:" +enter2);
		
		xsf.close();
		
	}
}
