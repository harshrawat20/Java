<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%--Example of response object 
<% 

response.sendRedirect("https://www.google.com/");

%>

--%>

<%--Example of config implicit object 
<%
String username=config.getInitParameter("username");
out.print("Welcome :"+username);
%>

--%>

<%--Example of application/context implicit object 
<%
String username=application.getInitParameter("username");
out.print("Welcome using application/context :"+username);
%>

--%>
<%--Example of session implicit object --%>
<%
String username=request.getParameter("username");
out.print("Welcome using session :"+username);

session.setAttribute("name",username);
%>

<br/>

<form action="home.jsp">
<input type="submit" value="submit" >
</form>



</body>
</html>