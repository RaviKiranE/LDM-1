package utils;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataInputProvider{

	public static Object[][] getSheet(String dataSheetName,String SheetName) {		

		Object[][] data = null ;

		try {			
			XSSFWorkbook workbook = new XSSFWorkbook("./data/"+dataSheetName+".xlsx");
			
			//XSSFSheet sheet = workbook.getSheetAt(0);	
			XSSFSheet sheet = workbook.getSheet(SheetName);
			
			// get the number of rows
			int rowCount = sheet.getLastRowNum();
			// get the number of columns
			int columnCount = sheet.getRow(0).getLastCellNum();

			data = new String[rowCount][columnCount];

			// loop through the rows
			for(int i=1; i <rowCount+1; i++){
				try {
					XSSFRow row = sheet.getRow(i);
					for(int j=0; j <columnCount; j++){ // loop through the columns
						try {
							String cellValue = "";
							try{
								cellValue = row.getCell(j).getStringCellValue();
							}catch(NullPointerException e){

							}
							data[i-1][j]  = cellValue; // add to the data array
						} catch (Exception e) {
							e.printStackTrace();
						}				
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}	
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return data;
	}
}
