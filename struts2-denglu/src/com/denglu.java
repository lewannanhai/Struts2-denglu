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

   
   
 //ʵ����֤�ķ���
  public String yanzheng() throws SQLException{
	   
	   String sq = "select * from yanzheng where name='" + s.getUsername()+"' and password ='"+s.getPassword()+"'";
	   
	   ResultSet rt=dao.executeQuery(sq);
	
	   
	   if (rt!=null) {
		   String shuchu="��¼";
		   return "success";
	}
	   else
	   
	   {
		   return "error";
	   }
	   
	   }



  //ʵ��ע��ķ���
  public String zhuce() throws SQLException{
	   
	  String sql = "insert into yanzheng(name,password) values('"+s.getUsername()+"','"+s.getPassword()+"')";
	   
	   int res=dao.executeUpdate(sql);
	
	   
	   if (res==1) {
		   String shuchu="ע��";
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
