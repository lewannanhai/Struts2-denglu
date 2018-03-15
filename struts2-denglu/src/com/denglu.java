package com;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.org.apache.bcel.internal.generic.DLOAD;


import dao.Dao;

public class denglu implements ModelDriven<user>  {

	
   user s=new user();
   Dao dao = new Dao();

   
   
 //实现验证的方法
  public String yanzheng() throws SQLException{
	   
	   String sq = "select * from yanzheng where name='" + s.getUsername()+"' and password ='"+s.getPassword()+"'";
	   
	   ResultSet rt=dao.executeQuery(sq);
	
	   
	   if (rt!=null) {
		   String shuchu="登录";
		   return "success";
	}
	   else
	   
	   {
		   return "error";
	   }
	   
	   }



  //实现注册的方法
  public String zhuce() throws SQLException{
	   
	  String sql = "insert into yanzheng(name,password) values('"+s.getUsername()+"','"+s.getPassword()+"')";
	   
	   int res=dao.executeUpdate(sql);
	
	   
	   if (res==1) {
		   String shuchu="注册";
		   return "success";
	}
	   else
	   
	   {
		   return "error";
	   }
	   
	   }
  
  
  
  
  
  
  

public user getModel() {
	// TODO Auto-generated method stub
	return s;
}
    
	  

	   
	   
  
   
   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
