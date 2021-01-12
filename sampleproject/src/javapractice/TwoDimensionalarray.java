package javapractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TwoDimensionalarray {

	@Test
	public void tc1() {
		String[][] testdata = getdata_from_exceltoarray();
		HashMap<String, Integer> colval = getcolpos_of_an_array(testdata);
		for (int i = 1; i <= testdata.length - 1; i++) {
			String firstname = testdata[i][colval.get("firstname")];
		}
	}

	@Test
	public HashMap<String, Integer> getcolpos_of_an_array(String[][] array) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < array[0].length; i++) {
			String colheader = array[0][i];
			map.put(colheader, i);
			break;

		}
		return map;
	}

	@Test
	public String[][] getdata_from_exceltoarray() {
		String filepath = "C:\\Users\\Srikath\\eclipse-workspace\\CogmentoAutomation\\Data\\creatcompany.xlsx";
		String sheetname = "";
		FileInputStream fis;
		String[][] testdata = null;
		try {
			fis = new FileInputStream(filepath);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet(sheetname);
			int totalrows = sheet.getLastRowNum();
			int totalcols = sheet.getRow(0).getLastCellNum();
			testdata = new String[totalrows + 1][totalcols];
			for (int i = 0; i <= totalrows; i++) {
				XSSFRow row = sheet.getRow(i);
				for (int j = 0; j < totalcols; j++) {
					XSSFCell cell = row.getCell(j);
					String celldata = (cell != null) ? cell.toString() : "";
					testdata[i][j] = celldata;

				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return testdata;

	}

}
