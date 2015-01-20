package demo.frank.wu.poi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import com.alibaba.druid.pool.DruidDataSource;

public class Export {
	public static void main(String[] args)  {

		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUsername("oams");
		dataSource.setPassword("oams");
		dataSource.setUrl("jdbc:oracle:thin:@172.31.122.120:1521:cims");

		try {
			JdbcTemplate jdbcTemplate = new JdbcTemplate();
			jdbcTemplate.setDataSource(dataSource);
			
			String sql = "select t.mate_cd,t.mate_name from MATE_ITEM t";
			
//			最重要的就是使用SXSSFWorkbook，表示流的方式进行操作 
//			SXSSF通过限制内存中可访问的记录行数来实现其低内存利用，当达到限定值时，新一行数据的加入会引起老一行的数据刷新到硬盘。      
//			比如内存中限制行数为100，当行号到达101时，行号为0的记录刷新到硬盘并从内存中删除，当行号到达102时，行号为1的记录刷新到硬
//			盘，并从内存中删除，以此类推。       rowAccessWindowSize代表指定的内存中缓存记录数，默认为100，此值可以通过new 
//			SXSSFWorkbook搜索(int rowAccessWindowSize)或SXSSFSheet.setRandomAccessWindowSize(int windowSize)来设置。

//			SXSSFWorkbook  workbook = new SXSSFWorkbook(5000);
			
//			final Sheet sheet = workbook.createSheet("sheet1");
			
			System.err.println("export begin -- ");
			long start = new Date().getTime();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("===");
		}
	
//		try(final OutputStream writer = new FileOutputStream("d:/workbook.xlsx");) {
//			//JDBCtemplate
//			jdbcTemplate.query(sql, new RowCallbackHandler() {
//
//				int i = 0 ;
//				@Override
//				public void processRow(ResultSet rs) throws SQLException {
//				    Row row = sheet.createRow(i);
//				    
//				    row.createCell(0).setCellValue(rs.getString("mate_cd"));;
//				    
//				    row.createCell(1).setCellValue(rs.getString("mate_name"));
//				    
//					i++;
//				}
//			});
//			workbook.write(writer);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally{
//			//删除磁盘上的缓存文件
//			workbook.dispose();
//		}
//		long end = new Date().getTime();
		
//		System.err.println("export end -- " + ((end-start)));
	}
}
