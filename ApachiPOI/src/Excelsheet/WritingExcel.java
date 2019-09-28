package Excelsheet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet0 = workbook.createSheet("First sheet");
		Row row0 = sheet0.createRow(0);
		
		Cell cellA = row0.createCell(0);
		Cell cellB = row0.createCell(1);
		
		cellA.setCellValue("first cell");		
		cellB.setCellValue("second cell");
		
		// Connecting streams
		File f = new File("E:\\Eclipse\\Excelwrite.xlsx");
		FileOutputStream fos = new FileOutputStream(f);
		
		workbook.write(fos);
		
		// closing the stream
		
		fos.close();
		System.out.println("File created");
		
	}

}
