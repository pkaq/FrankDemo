package demo.frank.wu.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 该工具类为材料导入未清月计划转换数据所用
 * @author Leon
 *
 */
public class MonthPlaneInitConvert {

	public static void main(String[] args) throws Exception {
		
//		new MonthPlaneInitConvert().separateXlsByMineCd();
		
		new MonthPlaneInitConvert().separateXlsByDept();
		
//		new MonthPlaneInitConvert().separateXlsByMineCdForHG();
		
	}
	
	/**
	 * 按部门分离excel文件
	 * @throws Exception 
	 */
	public void separateXlsByDept() throws Exception{
		System.err.println("Program start -- ");
		String fileName = "d:/data/"+"00-黑沟整理数据"+".xls";
		// 读取总表
		FileInputStream fis = new FileInputStream(new File(fileName));
		Workbook wb = WorkbookFactory.create(fis);

		Sheet st = wb.getSheetAt(0);
		//将同一部门的数据放到一起
		Map<String,List<String[]>> dataMap= new HashMap<String,List<String[]>>();
		for (int rowIndex = 1; rowIndex <= st.getLastRowNum(); rowIndex++) {
			//获取部门编码
			Row row = st.getRow(rowIndex); 
			//获取部门编码
			String dept_code = row.getCell(7).toString();
			//获取部门名称
			String dept_name = row.getCell(8).toString();
			//为保证唯一性采用编码和部门名称组合成key
			String key = dept_code+"_"+dept_name;

			List<String[]> tempList = null == dataMap.get(key)?new ArrayList<String[]>():dataMap.get(key);
			
			String[] tempStr = new String[2];
			
			//物料编码
			tempStr[0] =  row.getCell(3).toString();
			//申请数量
			tempStr[1] =   row.getCell(4).toString();
			
			tempList.add(tempStr);
			//更新hashmap
			dataMap.put(key, tempList);
		}	
		//遍历整理归类完成的数据进行分离
		Iterator<String> iterator =  dataMap.keySet().iterator();
		int counts = 1;
		while (iterator.hasNext()) {
			String key = iterator.next();
			
			List<String[]> deptList = dataMap.get(key);
			if (null != deptList && !deptList.isEmpty()) {
				SXSSFWorkbook SXSSFWorkbook = new SXSSFWorkbook(10000);
				//设置表头
				Font f  = (Font) SXSSFWorkbook.createFont();      
				f.setFontHeightInPoints((short) 12);
				f.setBoldweight(Font.BOLDWEIGHT_BOLD);
				//创建单元格样式
				CellStyle style = SXSSFWorkbook.createCellStyle();
				style.setFont(f);
				style.setAlignment(CellStyle.ALIGN_CENTER); 
				style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
				
				Sheet newwbSheet = SXSSFWorkbook.createSheet("sheet1");
				//冻结第一行
				newwbSheet.createFreezePane( 0, 1, 0, 1 );
				
				Row row_0 =  newwbSheet.createRow(0);
				Cell cell_0 = row_0.createCell(0);
				cell_0.setCellStyle(style);
				cell_0.setCellValue("材料编号");
				
				Cell cell_1 = row_0.createCell(1);
				cell_1.setCellStyle(style);
				cell_1.setCellValue("申请数量");
				
				int rows = 1;
				for (String[] data : deptList) {
					Row tempRow = newwbSheet.createRow(rows);
					tempRow.createCell(0).setCellValue(data[0]);
					tempRow.createCell(1).setCellValue(data[1]);
					rows++ ;
				}
				
				//设置文件名
				String tempCounts = String.valueOf(counts);
				if (counts<10) {
					tempCounts = "0"+counts;
				}
				String ExportfileName = tempCounts+"-"+key+".xlsx";
				
				SXSSFWorkbook.write(new FileOutputStream(new File("d:/data/"+ExportfileName)));
				SXSSFWorkbook.dispose();
				System.err.println(ExportfileName+"  -- 导出完成");
			}
			counts ++;
		}
		System.err.println("Program end -- ");
	}
	/**
	 * 按矿分离出excel文件
	 */
	public void separateXlsByMineCd() throws Exception{
		//需要拆解的矿编码
		String mine_code = "2150";
		//文件名以及路径
		String fileName = "00-新阳能源整理数据";
		String filePath = "d:/data/"+fileName+".xlsx";
		
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUsername("cims");
		dataSource.setPassword("cimsdb");
		dataSource.setUrl("jdbc:oracle:thin:@172.29.1.85:1521:cims");

		//协庄 :172.21.2.7		cims	cims	cimsdb	6055277
		//万祥矿业 :172.26.2.43		cims	cims	cimsdb	6055277	
		//翟镇煤矿:172.24.2.80		cmes	cims	cimsdb	1	
		//新巨龙煤矿	2630 172.29.90.41		cmes	cims	cimsdb	1	
		//新阳能源	2150 172.29.1.85	administrator	cims	cims	cimsdb	85335	

		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		
		//读取成本中心
		String sql = "select t.SAP_CODE code,t.NAME name from ITSM_DEPARTMENT t";
		
		final Map<String,String> map = new HashMap<String,String>();
		jdbcTemplate.query(sql, new RowCallbackHandler(){

			@Override
			public void processRow(ResultSet rs) throws SQLException {
				String name =  StringUtils.isNotBlank(rs.getString("name"))?rs.getString("name"): " 未找到  ";
				if (StringUtils.isNotBlank(rs.getString("code"))) {
					map.put(rs.getString("code").toUpperCase(),name);
				}
			}
		});
		//建立新的副本
		//设置列数
		SXSSFWorkbook newwb = new SXSSFWorkbook(10000);
		
		Font f  = (Font) newwb.createFont();      
		f.setFontHeightInPoints((short) 12);//字号       
		f.setBoldweight(Font.BOLDWEIGHT_BOLD);//加粗       
		
		CellStyle style = newwb.createCellStyle();
		style.setFont(f);//字体样式
		style.setAlignment(CellStyle.ALIGN_CENTER);//左右居中       
		style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);//上下居中
		
		Sheet newwbSheet = newwb.createSheet("sheet1");
		//冻结第一行
		newwbSheet.createFreezePane( 0, 1, 0, 1 );
		
		Row row_0 =  newwbSheet.createRow(0);
		Cell cell_0 = row_0.createCell(0);
		cell_0.setCellStyle(style);
		cell_0.setCellValue("订单类型");
		
		Cell cell_1 = row_0.createCell(1);
		cell_1.setCellStyle(style);
		cell_1.setCellValue("采购方");
		
		Cell cell_2 = row_0.createCell(2);
		cell_2.setCellStyle(style);
		cell_2.setCellValue("SAP系统物料编码");
		
		Cell cell_3 = row_0.createCell(3);
		cell_3.setCellStyle(style);
		cell_3.setCellValue("数量");
		
		Cell cell_4 = row_0.createCell(4);
		cell_4.setCellStyle(style);
		cell_4.setCellValue("计量单位");
		
		Cell cell_5 = row_0.createCell(5);
		cell_5.setCellStyle(style);
		cell_5.setCellValue("对矿销售含税价格");
		
		Cell cell_6 = row_0.createCell(6);
		cell_6.setCellStyle(style);
		cell_6.setCellValue("税率");
		
		Cell cell_7 = row_0.createCell(7);
		cell_7.setCellStyle(style);
		cell_7.setCellValue("交货日期");
		
		Cell cell_8 = row_0.createCell(8);
		cell_8.setCellStyle(style);
		cell_8.setCellValue("成本中心编码");
		
		Cell cell_9 = row_0.createCell(9);
		cell_9.setCellStyle(style);
		cell_9.setCellValue("部门");
		// 读取总表
		Workbook wb = WorkbookFactory.create(new FileInputStream(new File("d:/data/all.xlsx")));

		Sheet st = wb.getSheetAt(0);
		int headerRow = 1;
		
		int rowNumber = 1;
		
		for (int rowIndex = headerRow - 1; rowIndex <= st.getLastRowNum(); rowIndex++) {
			Row row = st.getRow(rowIndex); 
			
			String mine_cd = row.getCell(1).toString();
			
			Row rowtemp = null;
			if (mine_cd.equals(mine_code)) {
				//创建新行
				rowtemp = newwbSheet.createRow(rowNumber);
				rowNumber++;
			}
			for (int i = 0; i < row.getLastCellNum(); i++) {
				
				if (mine_cd.equals(mine_code)) {
					//获取部门编码
					String cbzx = row.getCell(8).getStringCellValue().toUpperCase();
					//获取部门名称
					String bmmc = map.get(cbzx);
					//增加部门名称
					switch (row.getCell(i).getCellType()) {
						case Cell.CELL_TYPE_STRING:
							  rowtemp.createCell(i).setCellValue(row.getCell(i).getStringCellValue());
							  break;
						case Cell.CELL_TYPE_NUMERIC:
							  rowtemp.createCell(i).setCellValue(row.getCell(i).getNumericCellValue());
							  break;
					}
					//将最后一行设置为部门名称
					if (i+1 ==  row.getLastCellNum()) {
						rowtemp.createCell(i).setCellValue(bmmc);
					}
				}
			}
		}
		// 创建矿级总表
		newwb.write(new FileOutputStream(new File(filePath)));
		newwb.dispose();
		// 按部门分离数据
		System.err.println("Export end -- ");
	
	}
	
	public void separateXlsByMineCdForHG() throws Exception{

		//需要拆解的矿编码
		String mine_code = "2220";
		//文件名以及路径
		String fileName = "00-黑沟整理数据";
		String filePath = "d:/data/"+fileName+".xlsx";
		
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUsername("cims");
		dataSource.setPassword("cimsdb");
		dataSource.setUrl("jdbc:oracle:thin:@172.29.171.100:1521:cims");

		//协庄 :172.21.2.7		cims	cims	cimsdb	6055277
		//万祥矿业 :172.26.2.43		cims	cims	cimsdb	6055277	
		//翟镇煤矿:172.24.2.80		cmes	cims	cimsdb	1	
		//新巨龙煤矿	2630 172.29.90.41		cmes	cims	cimsdb	1	
		//新阳能源	2150 	172.29.1.85		administrator	cims	cims	cimsdb	85335	
		//黑沟煤矿	2220	172.29.171.101	administrator	598297988		172.29.171.100	administrator	cims	cims	cimsdb	598297988	
		//水帘洞煤矿	2210	172.29.177.25	administrator	jgb123456		172.29.177.30	administrator	cims	cims	cimsdb	jgb123456	

		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		
		//读取成本中心
		String sql = "select t.SAP_CODE code,t.NAME name from ITSM_DEPARTMENT t";
		
		final Map<String,String> map = new HashMap<String,String>();
		jdbcTemplate.query(sql, new RowCallbackHandler(){

			@Override
			public void processRow(ResultSet rs) throws SQLException {
				String name =  StringUtils.isNotBlank(rs.getString("name"))?rs.getString("name"): " 未找到  ";
				if (StringUtils.isNotBlank(rs.getString("code"))) {
					map.put(rs.getString("code").toUpperCase(),name);
				}
			}
		});
		//建立新的副本
		//设置列数
		SXSSFWorkbook newwb = new SXSSFWorkbook(10000);
		
		Font f  = (Font) newwb.createFont();      
		f.setFontHeightInPoints((short) 12);//字号       
		f.setBoldweight(Font.BOLDWEIGHT_BOLD);//加粗       
		
		CellStyle style = newwb.createCellStyle();
		style.setFont(f);//字体样式
		style.setAlignment(CellStyle.ALIGN_CENTER);//左右居中       
		style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);//上下居中
		
		Sheet newwbSheet = newwb.createSheet("sheet1");
		//冻结第一行
		newwbSheet.createFreezePane( 0, 1, 0, 1 );

		Row row_0 =  newwbSheet.createRow(0);
		Cell cell_0 = row_0.createCell(0);
		cell_0.setCellStyle(style);
		cell_0.setCellValue("订单类型");
		
		Cell cell_1 = row_0.createCell(1);
		cell_1.setCellStyle(style);
		cell_1.setCellValue("采购方");
		
		Cell cell_2 = row_0.createCell(2);
		cell_2.setCellStyle(style);
		cell_2.setCellValue("销售方");
		
		Cell cell_3 = row_0.createCell(3);
		cell_3.setCellStyle(style);
		cell_3.setCellValue("SAP系统物料编码");
		
		Cell cell_4 = row_0.createCell(4);
		cell_4.setCellStyle(style);
		cell_4.setCellValue("数量");
		
		Cell cell_5 = row_0.createCell(5);
		cell_5.setCellStyle(style);
		cell_5.setCellValue("交货日期");
		
		Cell cell_6 = row_0.createCell(6);
		cell_6.setCellStyle(style);
		cell_6.setCellValue("发货库存地点");
		
		Cell cell_7 = row_0.createCell(7);
		cell_7.setCellStyle(style);
		cell_7.setCellValue("成本中心编码");
		
		Cell cell_9 = row_0.createCell(8);
		cell_9.setCellStyle(style);
		cell_9.setCellValue("部门");
		// 读取总表
		FileInputStream fis = new FileInputStream(new File("d:/data/A1.xlsx"));
		Workbook wb = WorkbookFactory.create(fis);

		Sheet st = wb.getSheetAt(0);
		int headerRow = 1;
		
		int rowNumber = 1;
		
		for (int rowIndex = headerRow - 1; rowIndex <= st.getLastRowNum(); rowIndex++) {
			Row row = st.getRow(rowIndex); 
			Cell c =  row.getCell(1);
			c.setCellType(Cell.CELL_TYPE_STRING);
			String mine_cd =c.getStringCellValue();
			
			Row rowtemp = null;
			if (mine_cd.equals(mine_code)) {
				//创建新行
				rowtemp = newwbSheet.createRow(rowNumber);
				rowNumber++;
				
			}
			for (int i = 0; i < row.getLastCellNum(); i++) {
				
				if (mine_cd.equals(mine_code)) {
					//获取部门编码
					String cbzx = row.getCell(7).getStringCellValue().toUpperCase();
					//获取部门名称
					String bmmc = map.get(cbzx);
					//增加部门名称
					switch (row.getCell(i).getCellType()) {
						case Cell.CELL_TYPE_STRING:
							  rowtemp.createCell(i).setCellValue(row.getCell(i).getStringCellValue());
							  break;
						case Cell.CELL_TYPE_NUMERIC:
							  rowtemp.createCell(i).setCellValue(row.getCell(i).getNumericCellValue());
							  break;
					}
					//将最后一行设置为部门名称
					if (i+1 ==  row.getLastCellNum()) {
						rowtemp.createCell(row.getLastCellNum()).setCellValue(bmmc);
					}
				}
			}
		}
		// 创建矿级总表
		newwb.write(new FileOutputStream(new File(filePath)));
		newwb.dispose();
		// 按部门分离数据
		System.err.println("Export end -- ");
	}
}
