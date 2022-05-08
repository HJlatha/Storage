package Generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcHybrid {
	public static String getdata(String Sheet,int row,int column) throws EncryptedDocumentException, IOException{
		String value="";
		FileInputStream fis=new FileInputStream("./Excel/hybrid.xlsx");
		Workbook book =WorkbookFactory.create(fis);
		Cell c=book.getSheet(Sheet).getRow(row).getCell(column);
		return value=c.getStringCellValue();
		}
}
