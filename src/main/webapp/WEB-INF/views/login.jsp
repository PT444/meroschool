<%@ page language="java" 
	contentType="text/html; charset=ISO-8859-1"
  	pageEncoding="ISO-8859-1"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login</title>
  </head>
  <body>
    <center> 
      <font color="gray" size="7">  Hello World! </font> 
      <form action="/spring-mvc/login" method="post">
      <font color="red">${errorMessage}<br/></font>
      Enter your name <input type="text" name="name" ><br/><br/>
      Enter your Password <input type="password" name="password"><br/><br/>
      <input type="submit"/>
      </form>
    </center>
  </body>
</html>