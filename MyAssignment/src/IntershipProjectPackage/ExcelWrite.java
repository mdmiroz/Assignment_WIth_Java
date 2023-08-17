package IntershipProjectPackage;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
class ExcelWrite {
	public static void main(String[] args) throws Exception {
			
			File src=new File("C:\\Users\\user-pc\\eclipse-workspace\\MyAssignment\\ExcelFile\\excel_sheet.xlsx");
			FileInputStream fis= new FileInputStream(src);
			
			XSSFWorkbook wb;
			 wb=new XSSFWorkbook(fis);
			XSSFSheet sheet= wb.getSheetAt(0);
			
			sheet.getRow(3).createCell(5).setCellValue("java");
			sheet.getRow(4).createCell(2).setCellValue("Java Online Compiler");
			FileOutputStream fout= new FileOutputStream(src);
			
			
			wb.write(fout);
			wb.close();
			
			
		}
	}

