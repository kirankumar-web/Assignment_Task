package Assignment_general;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Assignment_general.Autoconstants.autoconstants;

public class Data_retrival implements autoconstants
{

	public static String getdata(String filepath,String sheet,int rc,int cc)
	   {
		   try 
		   {
			FileInputStream fis=new FileInputStream(new File(filepath));
			Workbook wb = WorkbookFactory.create(fis);
			Cell cn = wb.getSheet(sheet).getRow(rc).getCell(cc);
			String data = cn.toString();
			return data;
			} 
		   catch (Exception e) 
		   {
			   return " ";
		   }
	   }
	
	public static int getCellData(String filepath, String sheetName, int rowNum, int colNum) {
        try {
            FileInputStream fis = new FileInputStream(new File(filepath));
            Workbook workbook = WorkbookFactory.create(fis);
            Cell cell = workbook.getSheet(sheetName).getRow(rowNum).getCell(colNum);
            
            if (cell != null && cell.getCellType() == cell.getCellType()) {
                return (int) cell.getNumericCellValue();
            } else {
                // Handle non-numeric or empty cells
                return 0; // Return a default value or handle the error condition as per your requirement
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0; // Return a default value or handle the error condition as per your requirement
        }
    }
		
}

