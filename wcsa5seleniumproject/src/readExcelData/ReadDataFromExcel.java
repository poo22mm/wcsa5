package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Read data from IPL Sheet
		
		//implementation of read the data from excel
		
		FileInputStream fs = new FileInputStream("./data/TestData.xlsx");
		Workbook Wb = WorkbookFactory.create(fs);
		Sheet sheet = Wb.getSheet("IPL"); //
		Row row = sheet.getRow(3);  //get into the desired row
		Cell cell = row.getCell(1); //get into the desired cell or coloum
		String data = cell.getStringCellValue(); // read the data from cell
		System.out.println(data);

	}

}
