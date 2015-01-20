package demo.frank.wu.jdbc;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.commons.io.output.FileWriterWithEncoding;
import org.junit.Test;

public class JdbcDemo {
	
	@Test
	public void main() throws Exception{
		ResultSet resultSet = getData();
		File file = new File("d:/mate_item.csv");
        writeData(resultSet,file);
	}
	
	public ResultSet getData(){
		ResultSet resultSet = null;
		try {
			//加载驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//建立连接
			Connection connection =  DriverManager.getConnection("jdbc:oracle:thin:@172.31.122.120:1521:cims", "oams", "oams");
			//sql语句
			String sql = "select t.mate_cd, t.mate_name, t.spec, decode(vic.item_text, '', t.unit, vic.item_text) unit, xj.item_text xj, data.item_text data, decode(t.price_inclusive, '-9999', 0, t.price_inclusive) price_inclusive" +
					" from mate_item t" +
					" left join v_itsm_code xj on xj.item_value = t.xj_type and xj.code = 'mate_xj_type'" +
					" left join v_itsm_code data on data.item_value = t.data_type and data.code = 'mate_dataType'" +
					" left join v_itsm_code vic on vic.code = 'cims_unit' and vic.item_value = t.unit" +
					" where rownum <= 100";
			//创建Statement对象
			Statement statement = connection.createStatement();
			//执行操作
			resultSet = statement.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return resultSet;
	}
	
	
	public void writeData(ResultSet resultSet,File file) throws Exception {
        try {
            //输出标题头,注意列之间用","间隔,写完一行需要回车换行
            String title = "材料编码,材料名称,规格型号,计量单位,新旧料分类,数据类型,含税单价"+"\n";
//            fileWriter.write(title);
         
           FileWriterWithEncoding  writer = new FileWriterWithEncoding(file, "gbk");
          
            String datas = null;
            	while(resultSet.next()){
            		String mate_cd = new String(resultSet.getString("mate_cd").getBytes(), "ascii");
            		String mate_name = resultSet.getString("mate_name");
            		String spec = new String(resultSet.getString("spec").getBytes(), "ascii");
            		String unit = new String(resultSet.getString("unit").getBytes(), "ascii");
            		String xj = new String(resultSet.getString("xj").getBytes(), "ascii");
            		String data = new String(resultSet.getString("data").getBytes(), "ascii");
            		Double price_inclusive = new Double(resultSet.getDouble("price_inclusive"));
            		
//            		datas = resultSet.getString("mate_cd")+","+resultSet.getString("mate_name")+","+resultSet.getString("spec")+","+resultSet.getString("unit")+","+resultSet.getString("xj")+","+resultSet.getString("data")+","+resultSet.getDouble("price_inclusive")+"\n";
            		datas = mate_cd+","+mate_name+","+spec+","+unit+","+xj+","+data+","+price_inclusive+"\n";
            		writer.write(datas);
            		writer.flush();
            		
//            		fileOutputStream.write(datas.getBytes());
            		
            	}
//            fileWriter.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
