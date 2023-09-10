package Java_Qu01.Java_Qu01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// Read data from Excel sheet

			FileInputStream file = new FileInputStream(new File("ReadAndWriteDateQu01.xlsx"));

			XSSFWorkbook workbook = new XSSFWorkbook(file);

			XSSFSheet sheet = workbook.getSheetAt(0);

			// Create a list to store the data

			List<String[]> data = new ArrayList<String[]>();
			for (Row row : sheet) {
				String[] rowData = new String[3];
				int columnIndex = 0;
				for (Cell cell : row) {
					rowData[columnIndex++] = cell.getStringCellValue();
				}
				data.add(rowData);
			}
			for (String[] rowData : data) {
				System.out.println("Name: " + rowData[0]);
				System.out.println("Course: " + rowData[1]);
				System.out.println("Fee: " + rowData[2]);
				System.out.println();
			}

			// Close the input stream

			FileOutputStream out = new FileOutputStream(new File("ReadAndWriteDateQu01.xlsx"));
			workbook.write(out);
			System.out.println("ReadAndWriteDateQu01.xlsx written successfully !");
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
