package demo.frank.wu.poi;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import com.alibaba.druid.pool.DruidDataSource;

public class CmxKctz {

	public static void main(String[] args) throws Exception, IOException {
		//需要拆解的矿编码
		//文件名以及路径
		String fileName = "kc";
		String filePath = "d:/data/"+fileName+".xlsx";
		
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUsername("cms");
		dataSource.setPassword("cms");
		dataSource.setUrl("jdbc:mysql://localhost:3306/jxc?createDatabaseIfNotExist=true&amp;useUnicode=true&amp;characterEncoding=utf8");

		//协庄 :172.21.2.7		cims	cims	cimsdb	6055277
		//万祥矿业 :172.26.2.43		cims	cims	cimsdb	6055277	
		//翟镇煤矿:172.24.2.80		cmes	cims	cimsdb	1	
		//新巨龙煤矿	2630 172.29.90.41		cmes	cims	cimsdb	1	
		//新阳能源	2150 	172.29.1.85		administrator	cims	cims	cimsdb	85335	
		//黑沟煤矿	2220	172.29.171.101	administrator	598297988		172.29.171.100	administrator	cims	cims	cimsdb	598297988	
		//水帘洞煤矿	2210	172.29.177.25	administrator	jgb123456		172.29.177.30	administrator	cims	cims	cimsdb	jgb123456	

		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		
		Workbook workbook = WorkbookFactory.create(new File(filePath));
		Sheet sheet = workbook.getSheetAt(0);
		
		for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
			Row row = sheet.getRow(rowIndex);
			String tm = row.getCell(0).getStringCellValue();
			
			Cell c = row.getCell(1);
			c.setCellType(Cell.CELL_TYPE_STRING);
			String sl = c.getStringCellValue();
			
			String mdmc = row.getCell(9).getStringCellValue();
			
			Cell c36 = row.getCell(2);
			c36.setCellType(Cell.CELL_TYPE_STRING);
			String s36 = c36.getStringCellValue();
			
			Cell c37 = row.getCell(3);
			c37.setCellType(Cell.CELL_TYPE_STRING);
			String s37 = c37.getStringCellValue();

			Cell c38 = row.getCell(4);
			c38.setCellType(Cell.CELL_TYPE_STRING);
			String s38 = c38.getStringCellValue();

			Cell c39 = row.getCell(5);
			c39.setCellType(Cell.CELL_TYPE_STRING);
			String s39 = c39.getStringCellValue();
			
			Cell c40 = row.getCell(6);
			c40.setCellType(Cell.CELL_TYPE_STRING);
			String s40 = c40.getStringCellValue();
			
			Cell c41 = row.getCell(6);
			c41.setCellType(Cell.CELL_TYPE_STRING);
			String s41 = c41.getStringCellValue();
			
			if (StringUtils.isNotBlank(tm)) {
//				String sql = "update t_kc_kctz c set c.sjsl='"+s35+"',c.mdmc='"+mdmc+"' where  c.kykc='"+tm+"' and c.ggbm='35'";
//				jdbcTemplate.execute(sql);
				
				 String sql = "update t_kc_kctz c set c.sjsl='"+s36+"',c.mdmc='"+mdmc+"' where  c.kykc='"+tm+"' and c.ggbm='36'";
				jdbcTemplate.execute(sql);
				
				
				 sql = "update t_kc_kctz c set c.sjsl='"+s37+"',c.mdmc='"+mdmc+"' where  c.kykc='"+tm+"' and c.ggbm='37'";
				jdbcTemplate.execute(sql);
				
				
				 sql = "update t_kc_kctz c set c.sjsl='"+s38+"',c.mdmc='"+mdmc+"' where  c.kykc='"+tm+"' and c.ggbm='38'";
				jdbcTemplate.execute(sql);
				
				 sql = "update t_kc_kctz c set c.sjsl='"+s39+"',c.mdmc='"+mdmc+"' where  c.kykc='"+tm+"' and c.ggbm='39'";
				jdbcTemplate.execute(sql);
				
				 sql = "update t_kc_kctz c set c.sjsl='"+s40+"',c.mdmc='"+mdmc+"' where  c.kykc='"+tm+"' and c.ggbm='40'";
				jdbcTemplate.execute(sql);
				
				 sql = "update t_kc_kctz c set c.sjsl='"+s41+"',c.mdmc='"+mdmc+"' where  c.kykc='"+tm+"' and c.ggbm='41'";
				jdbcTemplate.execute(sql);
				System.err.println("update");
			}
		}
		
	
		//更新品名
		System.err.println("Export end -- ");
	
	}

}
