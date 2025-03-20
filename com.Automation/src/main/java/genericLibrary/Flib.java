package genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	 
	

	public  String readDatExcel(String excelPath, String sheet, int rwoNo, int cellNo)
			throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook wb = WorkbookFactory.create(new FileInputStream(excelPath));
		String data = wb.getSheet(sheet).getRow(rwoNo).getCell(cellNo).toString();
		return data;

	}
	
	public int getLastRowNum(String excelPath, String sheet)
			throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook wb = WorkbookFactory.create(new FileInputStream(excelPath));
		int data = wb.getSheet(sheet).getLastRowNum();
		return data;

	}
	public Sheet getSheet(String excelPath, String sheet)
			throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook wb = WorkbookFactory.create(new FileInputStream(excelPath));
		Sheet data = wb.getSheet(sheet);
		return data;

	}

	public String readPropertyData(String propPath, String key) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream(propPath));
		String data = prop.getProperty(key);
		return data;

	}

}
