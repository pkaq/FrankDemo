package demo.frank.wu.poi;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CellNumber {
	public static void main(String[] args) {
		Workbook wb;
		try {
			wb = WorkbookFactory.create(new FileInputStream(new File("d:/data/test.xlsx")));
			Sheet st = wb.getSheetAt(0);
			Row r = st.getRow(0);
			if (null != r) {
				short cn = r.getLastCellNum();
				System.err.println(cn);
			}else{
				System.err.println("null--->");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
}
