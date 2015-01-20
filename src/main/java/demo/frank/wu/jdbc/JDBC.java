/**
 * 
 */
package demo.frank.wu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.UUID;


/**
 * @FileName: JDBC.java
 * @Author: WuF
 * @Version: 1.0
 * @Date: 2012-4-5下午2:57:45
 * @Description: 
 * @Others: 
 * @FuntionList:
 * @History:
 * @category
 */
public class JDBC {
	private final static String URL = "jdbc:oracle:thin:@172.16.9.40:1521:CIMS";
	private final static String userName = "CIMS";
	private final static String password = "CIMS";
	
	private Connection con;
	
	public JDBC() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			con = DriverManager.getConnection(URL, userName, password);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		/**
		 * 基本操作CRUD
		 */
		JDBC jdbc = new JDBC();
		jdbc.retrieve();
	}
	/**
	 * 增加
	 */
	public void create(){
		try {
			String SQL = "create table test(ID varchar(36) primary key,USERNAME varchar(100))";
			PreparedStatement ppt = con.prepareStatement(SQL);
			ppt.executeUpdate();
		} catch (Exception e) {
			System.err.println("Create Error");
			e.printStackTrace();
		}
	}
	/**
	 * 插入
	 */
	public void insert(){
		try {
			String SQL ="insert into test values(?,?)";
			PreparedStatement ppt = con.prepareStatement(SQL);
			ppt.setString(1, UUID.randomUUID().toString());
			ppt.setString(2, "kitty");
			ppt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 查询
	 */
	public void retrieve(){
		try {
			System.err.println("Retrieve start");
//			String SQL ="select * from ITSM_SAP_ZCDD t where t.id=?";
			String SQL ="select * from ITSM_SAP_ZCDD t ";
			PreparedStatement ppt = con.prepareStatement(SQL);
//			ppt.setString(1, "00000000000000000000000000000001");
			ResultSet rs = ppt.executeQuery();
			System.err.println(rs.getMetaData().getColumnName(1)+","+rs.getMetaData().getColumnName(2)+","+rs.getMetaData().getColumnName(3));
			rs.next();
//			String id = rs.getString(1);
//			String uname = rs.getString("USERNAME");
			
//			System.err.println("ID is:"+id+"\nUserName is :"+uname);
//			while (rs.next()) {
//				type type = (type) en.nextElement();
//				
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 更新
	 */
	public void update(){
		try {
			String SQL = "update test set username='Tom'";
			PreparedStatement ppt = con.prepareStatement(SQL);
			ppt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 删除
	 */
	public void delete(){
		try {
			String SQL = "delete from  test where username='Tom'";
			PreparedStatement ppt = con.prepareStatement(SQL);
			ppt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
