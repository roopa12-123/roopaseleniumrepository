package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step1:create FileInputStream object
		FileInputStream fis= new FileInputStream("./TestData/exceltestdata.xlsx");
		
		//step2:create respective file type object
		Workbook workbook = WorkbookFactory.create(fis);
		
		//step3:call read methods
		String url=workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
	

	}

}
