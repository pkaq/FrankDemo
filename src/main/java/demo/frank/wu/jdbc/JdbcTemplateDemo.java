package demo.frank.wu.jdbc;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.io.output.FileWriterWithEncoding;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import com.alibaba.druid.pool.DruidDataSource;

public class JdbcTemplateDemo {
	@Test
	public void test() {
		System.err.println("Start-----------------");
		//创建数据源
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUsername("oams");
		dataSource.setPassword("oams");
		dataSource.setUrl("jdbc:oracle:thin:@172.31.122.120:1521:cims");
		//SQL语句
		String sql = "select * from DCMS_SELL_CUSTOMER";
		
		try(final Writer writer = new FileWriterWithEncoding(new File("d:/xxx.csv"),"gbk");) {
			//JDBCtemplate
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			jdbcTemplate.query(sql, new RowCallbackHandler() {
				
				@Override
				public void processRow(ResultSet rs) throws SQLException {
					try {
						writer.write(rs.getString(2)+"\r\n");
						writer.flush();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.err.println("End------------------------");
	}
}
