package javapractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

@Test
public class ExcelUtil {

	public void exceldata() {
		String filepath = "C:\\Users\\Srikath\\eclipse-workspace\\CogmentoAutomation\\Data\\creatcompany.xlsx";

		String extension = Fileutils.get_file_extension(filepath);
		System.out.println(extension);
		System.out.println(getdata(filepath, "creatcompany", "CC_01"));

	}

	public static HashMap<String, String> getdata(String filepath, String sheetname, String tcid) {
		HashMap<String, String> alldata = new HashMap<>();
		if (Fileutils.get_file_extension(filepath).equalsIgnoreCase("xlsx")
				|| Fileutils.get_file_extension(filepath).equalsIgnoreCase("xls")) {
			FileInputStream fis;
			try {
				fis = new FileInputStream(filepath);
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet sheet = wb.getSheet(sheetname);
				if (sheet != null) {
					XSSFRow testcaserow = gettestcaserow(sheet, tcid);
					if (testcaserow != null) {
						XSSFRow headerrow = sheet.getRow(0);
						int totalcol = headerrow.getLastCellNum();
						for (int colnum = 0; colnum <= totalcol; colnum++) {
							String headercvalue = headerrow.getCell(colnum).toString();
							String cellvalue = testcaserow.getCell(colnum).toString();
							if (cellvalue != null) {
								alldata.put(headercvalue, cellvalue);
							} else {
								alldata.put(headercvalue, cellvalue = "");

							}
						}
					} else {
						System.out.println("given " + tcid + "does not exist in the sheet");
					}

				} else {
					System.out.println("given sheet does not exist" + sheetname);
					wb.close();
				}

				wb.close();
			} catch (IOException e) {
				System.out.println("file is not founding in the given" + filepath + e.getMessage());

			}

		} else {
			System.out.println(" please give excel file" + filepath + "given file is excel file");
		}
		return alldata;
	}

	public static XSSFRow gettestcaserow(XSSFSheet sheet, String tcid) {
		XSSFRow tcrow = null;
		int testcase_col_position = getcolumnposition(sheet, "tc_id");
		if (testcase_col_position >= 0) {
			int totalrows = sheet.getLastRowNum();
			for (int rnum = 1; rnum <= totalrows; rnum++) {
				XSSFRow row = sheet.getRow(rnum);
				if (row.getCell(testcase_col_position).toString().equalsIgnoreCase(tcid)) {
					tcrow = row;

				}

			}
		} else {
			System.out.println("tcid is not in the sheet");
		}
		return tcrow;
	}

	public static int getcolumnposition(XSSFSheet sheet, String colheader) {
		int colpos = -1;
		XSSFRow row = sheet.getRow(0);
		int totalcols = row.getLastCellNum();
		for (int colnum = 0; colnum < totalcols; colnum++) {
			XSSFCell cell = row.getCell(colnum);
			if (cell.toString().equalsIgnoreCase(colheader)) {
				colpos = colnum;
			}
		}
		return colpos;
	}

	public int getcolpos(XSSFSheet sheetname, String colpos) {
		int colposition = -1;
		XSSFRow row = sheetname.getRow(0);
		int allheadercells = row.getLastCellNum();
		for (int colnum = 0; colnum < allheadercells; colnum++) {
			XSSFCell cell = row.getCell(colnum);
			if (cell.toString().equalsIgnoreCase(colpos)) {
				colposition = colnum;
			}
		}
		return colposition;
	}

}
