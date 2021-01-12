package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javapractice.ColumnInTableLNotFoundException;
import javapractice.ElementIsNotWebTable;

public class Webtable {

	private WebElement table;

	public Webtable(WebElement element) {
		String elementtagname = element.getTagName();
		if (elementtagname.equalsIgnoreCase("table")) {
			table = element;
		} else {
			throw new ElementIsNotWebTable(
					"given element is not a valid table element should contain table tagname" + elementtagname);

		}
	}

	public int get_rownum_by_text(String texttofind) {
		int rownum = -1;
		int colnum = -1;

		List<WebElement> allrows = table.findElements(By.tagName("tr"));

		rowsloop: for (int i = 0; i < allrows.size(); i++) {
			List<WebElement> allcells;
			WebElement row = allrows.get(i);

			if (i == 0) {
				allcells = allrows.get(i).findElements(By.tagName("th"));

				allcells = (allcells.size() == 0) ? allrows.get(i).findElements(By.tagName("td")) : allcells;
			} else {
				allcells = row.findElements(By.tagName("td"));

			}
			for (int j = 0; j < allcells.size(); j++) {
				if (allcells.get(j).getText().equalsIgnoreCase(texttofind)) {
					rownum = i;
					break rowsloop;
				}
			}

		}

		return rownum;
	}

	public int get_row_count() {
		int totalrows = table.findElements(By.tagName("tr")).size();
		return totalrows;
	}

	public List<WebElement> get_allelemens_incell(int rownum, String colname, String tagname) {

		int colpos = get_column_position(colname);
		WebElement row = table.findElements(By.tagName("tr")).get(rownum);
		WebElement allcells = row.findElements(By.tagName("td")).get(colpos);
		List<WebElement> datacells = allcells.findElements(By.tagName(tagname));
		return datacells;
	}

	public List<WebElement> get_allelemens_incell(int rownum, String colname) {

		int colpos = get_column_position(colname);
		WebElement row = table.findElements(By.tagName("tr")).get(rownum);
		WebElement allcells = row.findElements(By.tagName("td")).get(colpos);
		List<WebElement> datacells = allcells.findElements(By.xpath("*"));
		return datacells;
	}

	public int getrownum_by_text(String texttofind, String colname) {
		int rownum = -1;

		int colnum = get_column_position(colname);

		if (colnum == -1) {
			throw new ColumnInTableLNotFoundException("given value is not in the list");

		} else {
			List<WebElement> allrows = table.findElements(By.tagName("tr"));

			for (int i = 1; i <= allrows.size() - 1; i++) {
				WebElement row = allrows.get(i);
				List<WebElement> allcells = row.findElements(By.tagName("td"));
				WebElement colval = allcells.get(colnum);
				if (colval.getText().equalsIgnoreCase(texttofind)) {
					rownum = i;
					break;
				}

			}

		}
		return rownum;
	}

	public int get_column_position(String colvalue) {
		int colpos = -1;
		WebElement headerrow = table.findElement(By.tagName("tr"));
		List<WebElement> headervals = headerrow.findElements(By.tagName("th"));
		if (headervals.size() == 0) {
			headervals = headerrow.findElements(By.tagName("td"));
		}

		for (int i = 0; i < headervals.size(); i++) {
			if (headervals.get(i).getText().equalsIgnoreCase(colvalue)) {
				colpos = i;
				break;
			}
		}
		return colpos;
	}

}
