package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/***
 * 
 * @author Sudarshan
 *
 */
public class ExcelUtil {
	/**
	 * This method is used to import the data from the Excel file in the String form
	 * @param sheetName pass sheetName where the data is present
	 * @param rowNumber pass sheetName where the data is present
	 * @param cellNumber pass sheetName where the data is present
	 * @return data return the value present in the excel
	 * @throws Exception
	 */
	public String excelStringFile(String sheetName,int rowNumber,int cellNumber) throws Exception {
		File abPath =new File(IAutoConstants.EXCEL_PATH);
		FileInputStream fis=new FileInputStream(abPath);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		String data = sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();
		return data;
	}
	/**
	 * This method is used to import the data from the Excel file in the Boolean form
	 * @param sheetName pass sheetName where the data is present
	 * @param rowNumber pass sheetName where the data is present
	 * @param cellNumber pass sheetName where the data is present
	 * @return data return the value present in the excel
	 * @throws Exception
	 */
	public boolean excelBooleanFile(String sheetName,int rowNumber,int cellNumber) throws Exception {
		File abPath =new File(IAutoConstants.EXCEL_PATH);
		FileInputStream fis=new FileInputStream(abPath);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		boolean data = sheet.getRow(rowNumber).getCell(cellNumber).getBooleanCellValue();
		return data;
	}
	/**
	 * This method is used to import the data from the Excel file in the Date form
	 * @param sheetName pass sheetName where the data is present
	 * @param rowNumber pass sheetName where the data is present
	 * @param cellNumber pass sheetName where the data is present
	 * @return data return the value present in the excel
	 * @throws Exception
	 */
	public Date excelDateFile(String sheetName,int rowNumber,int cellNumber) throws Exception {
		File abPath =new File(IAutoConstants.EXCEL_PATH);
		FileInputStream fis=new FileInputStream(abPath);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Date data = sheet.getRow(rowNumber).getCell(cellNumber).getDateCellValue();
		return data;
	}
	/**
	 * This method is used to import the data from the Excel file in the number form
	 * @param sheetName pass sheetName where the data is present
	 * @param rowNumber pass sheetName where the data is present
	 * @param cellNumber pass sheetName where the data is present
	 * @return data return the value present in the excel
	 * @throws Exception
	 */
	public double excelNumericFile(String sheetName,int rowNumber,int cellNumber) throws Exception {
		File abPath =new File(IAutoConstants.EXCEL_PATH);
		FileInputStream fis=new FileInputStream(abPath);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		double data = sheet.getRow(rowNumber).getCell(cellNumber).getNumericCellValue();
		return data;
	}
}
