<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
  </head>
  
  <body>
  <form action="zz.action" method="post"> 
     
    <table width="393" border="0" align="center" style="margin-top:200px">
  <tr align="center" valign="middle">
    <td height="77" colspan="2">欢迎来到我的网站</td>
    </tr>
  <tr>
    <td width="191" height="66" align="center">用户名</td>
    <td width="192"><input type="text" name="username" size="15"></td>
  </tr>
  <tr>
    <td height="92" align="center">密码</td>
    <td><input type="text" name="password" size="15"></td>
  </tr>
  
  <tr>
    <td height="92"><input type="submit" value="登录" style="margin-left:80px"></td>
    <td><input type="button" onclick="location.href='zhuce.jsp'" value="注册" style="margin-left:50px" ></td>
  </tr>
  
</table>
 
 
 
 
 </form>
 
 
 
  </body>
</html>
