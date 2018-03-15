package dao;
import java.sql.*;

import sun.applet.Main;

public class Dao {
	
	Statement st;
	Connection conn;
	ResultSet rs;
	
	public Dao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		
		  
		  String url = "jdbc:mysql://localhost:3306/sdb?useSSL=false";  
	        String usename="root"; 
	        String psw="1234";  
	      
			try {
				conn = DriverManager.getConnection(url,usename,psw);
			 st=conn.createStatement();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	       
	    
	}
	
	
	//查询用户名是否一致的方法
	public ResultSet executeQuery(String sql) {
		
		try {
			rs = st.executeQuery(sql);
		
		} 
		
		catch (Exception e) {
		// TODO: handle exception
		
		}
		
		
		
		return rs;
		
		
		}
	
	
	
	
	//方法二将未注册的用户名导入到数据库当中
	
	
	public int executeUpdate(String sql) {
		try {
			
		st.executeUpdate(sql);
		
		
		} catch (Exception e) {
		// TODO: handle exception
		}
		
		return 1;
		}
	
	
	//测试方法
	
		/*public static void main(String[] args) {
			
			Dao ssDao=new Dao();
			
			 String sq = "select * from yanzheng ";
			
			 ResultSet rs =ssDao.executeQuery(sq);
			

	        try {
				while (rs.next()) {
					System.out.println(rs.getString("name")+rs.getInt("password"));	
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			*/
			
			
			
			
		}
      
      

