package demo.frank.wu.poi;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import com.alibaba.druid.pool.DruidDataSource;

public class CmxSpxx {

	public static void main(String[] args) throws Exception, IOException {
		//需要拆解的矿编码
		//文件名以及路径
		String fileName = "ggbm";
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
			String mc = row.getCell(1).getStringCellValue();
			
			String sql = "update t_base_spxx a set a.ggmc='"+mc+"',a.ggbm='"+mc+"' where a.SPTM='"+tm+"'";
			System.err.println(sql);
			jdbcTemplate.execute(sql);
		}
		
	
		//更新品名
		System.err.println("Export end -- ");
	
	}

}
